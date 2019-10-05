
public class Z35 {

	public static void main(String[] args) {
		String str = "0F97A3";
		String result = "";
		String [] binary = {"0000","0001","0010","0011","0100","0101","0110","0111",						
							"1000","1001","1010","1011","1100","1101","1110","1111"};
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>='0' && c<='9') {
				result += binary[c-'0'];
			}else {
				result += binary[c-'A'+10];
			}
			System.out.print(result);
		}
		System.out.println();
		// 앞에서 부터 7개씩 잘라서 숫자로 변환
		int value = 0;
		for (int i = 0; i < result.length(); i++) {
			value = value *2 + (result.charAt(i) -'0');
			
			if(i%7 == 6) {
				System.out.print(+value+",");
				value = 0;
			}
		}
		System.out.print(value);
	}

}
