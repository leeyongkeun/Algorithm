
public class Z34 {

	public static void main(String[] args) {
		int binary = 0b100110111; // 311을  2진수로 저장
		
		StringBuilder sb = new StringBuilder();
		for (int j = 8; j >= 0 ; j--) {
			sb.append((311 &(1<<j)) == 0 ? 0 : 1 );
		}
		System.out.println(sb);

		// 저장한 2진수의 값을 311을 10진수로 출력하기
		System.out.println(binary);

		// num을 x진법으로 표현하는 방법 구현
		int num = 311;
		int x = 2; // x진법으로 변환
		String s = "";
		while(num>=0) {
			s = num % x + s; // 마지막에 구한 문자가 msb 가 되도록
			num /= x;
		}
		System.out.println(s+"("+x+"진수)");
		//API 사용하는 방법
		int num1 = 311;
		String s1 = ""; 
		s1 = Integer.toString(num1, 2);
		System.out.println(s1);
		
	}//main 

}//class
