/*
 * DP 동적 계획법 
 *  - 점화식을 사용
 */
public class Z50_Pibonachi {
	public static int [] memo = new int [101];
	// 함수의 호출 결과를 저장할 배열
	public static void main(String[] args) {
			
//		for (int i = 0; i < 10; i++) {
//			System.out.print(f(i)+" ");
//		}
		
		// 동적 계획법 DP : 작은 해 부터 구해서 큰해를 구한다.
		// 				중복 연산이 발생 - 메모이제이션으로 해결한다
		// 				기록해 나아가는 방법
		
		int [] memo = new int [10];
		memo[0] = 0;
		memo[1] = 1;
		
		for (int i = 2; i <= 8; i++) {
			memo[i] = memo[i-2] + memo[i-1];
		}
		System.out.println(memo[8]);
		
		// 배열을 만들 메모리 공간이 부족할 경우
		
		int a = 0;
		int b = 1;
		int temp = -1;
		
		for (int i = 2; i <= 8; i++) {
			temp = a + b; // 이전의 2개의 값을 더함
			a = b;
			b = temp;
		}
		System.out.println(temp);
		
	}//main
	
	// 점화식을 재귀함수로 구현 : 코드가 간단하지만 중복호출이 많이 발생
	
	public static int f (int n) {
			
		if(n < 2) {
			return 1;
		}else {
			return f(n-1) + f(n-2);
		}
		
	}// pibo
	
	// 점화식을 재귀함수로 호출 시 중복 호출 발생을 줄이기 위해 : 메모이 제이션

	public static int g (int n) {
		
		if(n >= 2 && memo[n] == 0) {
			memo[n] = g(n-1) + g(n-2);
		}
		return memo[n];
	}
}//class













