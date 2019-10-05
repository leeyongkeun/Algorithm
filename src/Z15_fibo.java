/**
 * 
 * 피보나치 수열 => 0 1 1 2 3 5 8 ...
 * 1. 재귀함수 : 단점 - 많은 중복이 일어난다. 그만큼 메모리도 성능떨어짐 
 * 2. 메모리제이션 : 한번 연산환 결과를 저장해서, 중복 연산을 줄인다. 
 * 3. DP : 작은 해 부터 구해서 전체 해를 구하는 방법
 *        DP와 메모리제이션은 같은말이 아니다  
 * -> DP가 성능이 제일 빠르다
 * 
 * 
 *
 */
public class Z15_fibo {

	public static int fibo(int n) {
		if(n<2) {//종료
			return n;
		}else {//재귀
			
			return fibo(n-1)+fibo(n-2);
		}
		
		
	}
	public static int[] memo = new int [10];
	
	public static int fibo1(int n) {
		if(n>=2 && memo[n]==0) {// 계산이 한번도 안되었다면 재귀호출로 계산해서 저장
			memo[n] = fibo1(n-1)+ fibo1(n-2);
		}
			return memo[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(fibo(6));
		System.out.println(fibo(5));
		System.out.println(fibo(4));
		System.out.println(fibo(3));
		System.out.println(fibo(2));
		System.out.println(fibo(1));
		System.out.println(fibo(0));
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(fibo1(6));
		
		
		System.out.println("=====DP====");
		
		int n = 6;
		int [] f = new int [n+1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i < f.length; i++) {
			f[i] = f[i-1] + f[i-2];
			
		}
		System.out.println(f[n]);
		System.out.println("======배열 없이 ====");
		int a = 0;
		int b = 1;
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		System.out.println(b);
		
		
		
	}//main
}//class
