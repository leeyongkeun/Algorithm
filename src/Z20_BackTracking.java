/**
 * BackTracking 가지치기_ powerSet 부분집합을 구하는 알고리즘
 */
public class Z20_BackTracking {

	public static int [] arr = {6,7,8}; //부분집함을 구할 원래 배열
	
	public static void main(String[] args) {
		// arr 부분집합을 모두 구해보자(멱집합 : powerset)
		boolean[] a = new boolean [arr.length];
		//   원소의 사용 여부를 저장할 배열, 0번째 원소도 사용
		backtrack (a,0,a.length);
		
	}//main
/**
 * @param a : 부분집합을 구할 때 원소의 사용여부를 저장할 배열
 * @param k : 현재 단계, input과 같아질때까지 반복
 * @param input:마지막 단계
 */
	public static void backtrack(boolean []a, int k , int input) {
		if(k== input) {// 종료파트 (해인가?) IsSolution()
			process_solution(a,k); // 각 완성 단계에서 하고싶은 작업(출력)
		}else{//재귀파트
			boolean []c = new boolean[a.length]; // 후보군을 저장할 배열
			int ncands = make_candidates(a,k,input,c); // 후보군을 저장할 메소드 
			
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i]; // false 1번, true 1번 a[k]에 저장
				backtrack(a,k+1,input);
			}
		}
		
		
		// 후보군을 만들어오는 메서드 
	}
		
	public static int make_candidates(boolean[] a, int k, int input, boolean [] c) {
		c[0] = false;
		c[1] = true;
		return 2;
				
		
	}
	
	public static void process_solution(boolean []a, int k) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]) {
				System.out.print(arr[i]+" " );
			}
		}
		System.out.println();
		
	}
}//class
