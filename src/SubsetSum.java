import java.util.Arrays;

/**	  subset :  어떤 집합의 모든 부분 집합을 원소로 하는 집합
	 {1,2} 의 Sub set은
	 {{},{1},{2},{1,2}}
	 subset을 구하는 방법
	 1. 반복문
	 2. 바이너리 카운팅
	 3. 재귀함수
	 
 */	

public class SubsetSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 반복문
		int [] arr = {6,7,8};
		for (int i = 0; i < 2; i++) {
			// 첫번째 원소를 사용할지를 여부
			for (int j = 0; j <2; j++) {
				// 두 번째 사용할지를 여부
				for (int k = 0; k < 2; k++) {
					// 세번쨰 원소를 사용할지 여부
					// System.out.println(i+" "+j+" "+k);
					System.out.print(i==0 ? arr[0]+" " : "");  
					System.out.print(j==0 ? arr[1]+" " : "");  
					System.out.print(k==0 ? arr[2]+" " : "");  
					System.out.println();
				}
				
			}
		}
		
		// 정수의 진법 표현
		System.out.println("======정수의 진법 표현 ======");
		System.out.println(1234); // 10진수
		System.out.println(0b110); // 2진수 :0b or 0B를 이용
		System.out.println(01234); // 8진수 :0으로 시작
		System.out.println(0x1011); // 16진수 0x or 0X 0~9,a~f
		System.out.println(100);// 10진수 100 -> 출력은 무조건 10진수
		System.out.println(Integer.toBinaryString(100)); //100을 2진수로 표현
		System.out.println(0b1100100);
		System.out.println(Integer.toString(100,3));//100을 3진수로 이용
		
		System.out.println("======shift 연산자 ======");
		System.out.println(1 << 2);//1을 왼쪽으로 2번 shift
		System.out.println("1 << 0 : " + (1 << 0)+"   "+Integer.toBinaryString(1<<0));//1을 왼쪽으로 0번 shift
		System.out.println("1 << 1 : " + (1 << 1)+"   "+Integer.toBinaryString(1<<1));//1을 왼쪽으로 1번 shift
		System.out.println("1 << 2 : " + (1 << 2)+"   "+Integer.toBinaryString(1<<2));//1을 왼쪽으로 2번 shift
		System.out.println("1 << 3 : " + (1 << 3)+"   "+Integer.toBinaryString(1<<3));//1을 왼쪽으로 3번 shift
		System.out.println("1 << 4 : " + (1 << 4)+"   "+Integer.toBinaryString(1<<4));//1을 왼쪽으로 4번 shift
		System.out.println("1 << 5 : " + (1 << 5)+"   "+Integer.toBinaryString(1<<5));//1을 왼쪽으로 5번 shift
		
		System.out.println("========비트 마스킹========");
		int n = 0b100110111;
//			    0b000000001;
		System.out.println((n & 0b1) == 0 ? 0 :1); // 1  // 역순으로 출력함 
		System.out.println((n & 0b10)== 0 ? 0 :1); //  2
		System.out.println((n & 0b100)== 0 ? 0 :1); //  4
		System.out.println((n & 0b1000)== 0 ? 0 :1); //  0
		System.out.println((n & 0b10000)== 0 ? 0 :1); //  16
		System.out.println((n & 0b100000)== 0 ? 0 :1); //  32
		System.out.println((n & 0b1000000)== 0 ? 0 :1); //  0
		System.out.println((n & 0b10000000)== 0 ? 0 :1); //  0
		
		// ALT SHIFT A 
		
		System.out.println("========반복문 비트 마스킹========");
		for (int i = 0; i < 9; i++) {
			System.out.println((n & (1 << i)) == 0 ? 0 : 1 );
		}
		
		
		// 2. 바이너리 카운팅으로 PowerSet을 구해보자 
		// 부분집합의 갯수, 비트마스킹, 쉬프트 연산자 
		int[] crr = {-7,-3,-2}; // 5, 8
		for (int i = 0; i <(1<< crr.length) ; i++) {// 10진수로 숫자를 표현
			//System.out.println(Math.pow(2, 3));
			for (int j = 0; j < crr.length; j++) {
				if((i & (1<<j)) != 0 ) {
					System.out.print(crr[j]+" , ");
				}
			}
			System.out.println();
		}
		
		// 3. 재귀함수 연습
		// 4! = 4 *3* 2* 1 팩토리얼 
		
			
		int v = 1;
		for (int i = 1; i <= 4; i++) {
			v *= i;
		}
		System.out.println(v);
		a(4);
		
		System.out.println(a(4));
		
		
		
		
		//1 2 3 4 5
		for (int i = 1; i <=5 ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		b(1);
		
		// 0 2 4 6 8 
		// 5 4 3 2 1
		
		c(0);
		d(5);
		
		// 2 5 8 11
		e(2, 12, 3);
		
		System.out.println("=========재귀함수로 모든 부분 집합(powerSet)을 구해보자=======");
		f(0);
		
		int[] err = {-7,-3,-2, 5, 8};
		
		
	}//main

	
	
	
	
	
	
	
	
	
	/**
		반복문
		cpu만 사용
		재귀함수에 비해 실행속도가 빠르다 
		단점 : 동적으로 바뀌는 구조를 반복문으로 표현이 어렵다
		
		재귀함수
		callstack 영역에 메모리를 사용, 
		메모리의 한계가 있다. 
		실행속도가 느리다. (메모리를 활용해서 실행속도를 개선할 수 있다. 반복문보다 빠른 결과를 나타낼수도)
		동적으로 바뀌는 구조를 재귀함수로 표현이 가능하다.
		
		
		
		실행시키면 힙(인스턴스 변수), 콜 스택(지역변수), 클래스 Area 영역(스태틱 변수)
		
		
		
	
	 */
	public static int [] drr = {-7,-3,-2, 5, 8};
	public static boolean [] bit = new boolean[drr.length];
	// 매개변수 n 번째 인덱스의 배열값을 사용할지 여부를 지정 후 재귀호출, 마지막에 bit 배열을 보고 출력
	
	public static void f (int n) {
		if(n ==drr.length) {//종료파트 : bit 배열의 내용을 보고, drr 배열의 원소를 출력 
			//System.out.println(Arrays.toString(bit));
			int sum =0;
			for (int i = 0; i < bit.length; i++) {
				if (bit[i]) sum += drr[i];
			}
			if(sum==0) {
				
				for (int i = 0; i < bit.length; i++) {
					System.out.print(bit[i] ? drr[i]+" " : ""); 
					
				}
				System.out.println();
				
			}
		}else {//재귀파트 : 비트 배열의 각 원소를 채우기 
			bit[n] = false;
			f(n+1);
			bit[n] = true;
			f(n+1);
			
		}
		
		
		
	}
	
	
	public static void e (int start, int end, int step) { //e(2,12,3) 결과값  2 5 8 11
		if(start>=end) {//종료
			System.out.println("");
			
		}else {// 반복
			System.out.printf(start + " ");
			e(start+step, end, step);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void c (int n) { //c(0) 결과값 0 2 4 6 8
		if(n>8) {
			System.out.println("");
			
		}else {
			System.out.printf(n + " ");
			c(n+2);
			
		}
		
		
		
	}
	public static void d (int n) { // d(5) 결과 값 5 4 3 2 1
		if(n<=0) {
			System.out.println();
			
		}else {
			
			System.out.printf(n + " ");
			d(n-1);
		}
		
		
	}
	
	
	
	
	
	
	public static void b (int n) {
		if(n>5) {//종료파트
			System.out.println();
			
		}else {//반복파트
			
			System.out.printf(n+" ");
			b(n+1);
			
		}
	}
	
	
	
	
	// 4! = 4 * 3!
	//	  = 4 * 3 * 2!	 
	public static int a (int n) { // 재귀함수
		if(n<=1) {// 종료파트
			
			return 1;
		}else { // 반복파트
			
			return n * a(n-1);
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
