
public class Z23_거듭제곱 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2; // 밑수
		int exp = 10; // 지수
		int result = 1;
		
		for (int i = 0; i < exp; i++) {
			result *= base;
		}
		System.out.println(result);
		System.out.println(power(base,exp));
		
	}//main

	public static int power(int base, int exp) {
		if(exp==0) { // 종료 
			return 1;
			
		}else { // 재귀
			
			return 2*power(base,exp-1);
		}
	}//power1
	
	public static int power2(int base, int exp) { // 분할정복
		if(exp == 1) {// 종료
			return base;
			
		}else if(exp ==0){// 종료
			return 1;
			
		}
		int temp = power2(base,exp/2);
		temp *= temp;
		if (exp %2 ==1) temp*=base;
		return temp;
		
//		int temp = power2(base,exp/2);
//		if (exp % 2==0) { // 짝수냐
//			return temp*temp;
//			
//		}else {
//			
//			return temp*temp*base;
//		}
		
	}//power2
	
}//class
