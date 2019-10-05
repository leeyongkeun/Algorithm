/**
 * BackTracking 가지치기_ 순열 permutation
 */
public class Z22_BackTracking2 {

	public static int [] arr = {6,7,8}; //순열을 구할 원래 배열
	
	public static void main(String[] args) {
		// arr 순열을 모두 구해보자(멱집합 : powerset)
		//   원소의 사용 여부를 저장할 배열, 0번째 원소도 사용
		int [] a = new int [arr.length]; // 순열의 index 순번을 저장할 배열 , 0번째 원소도 사용
		backtrack (a, 0, a.length); // a.legnth 순열로 표현할 개수 
		
	}//main
/**
 * @param a : 순열을 구할 때 원소의 사용여부를 저장할 배열
 * @param k : 현재 단계, input과 같아질때까지 반복
 * @param input: 순열로 표현할 개수
 */
	
	
	public static void backtrack(int []a, int k , int input) {
		if(k== input) {// 종료파트 (해인가?) IsSolution()
			process_solution(a,k); // 각 완성 단계에서 하고싶은 작업(출력)
		}else{//재귀파트
			int []c = new int[a.length]; // 후보군을 저장할 배열
			int ncands = make_candidates(a,k,input,c); // 후보군을 만들어오는 메소드 
			for (int i = 0; i < ncands; i++) {
				a[k] = c[i];
				backtrack(a, k+1, input); // 다음 단계를 재귀호출 
			}
		}
		
		
		// 후보군을 만들어오는 메서드 
	}
		
	public static int make_candidates(int[] a, int k, int input, int [] c) {
		boolean [] in_perm = new boolean [a.length]; // 각 index가 사용햇엇는지를 여부를 체크할 flag
		for (int i = 0; i < k; i++) { // 현재 단계 전까지 사용한 숫자들을 체크  a배열에 들어있음
			in_perm[a[i]] = true; // 사용함 체크
			
			
		}//
		int ncands = 0; // 후보군의 개수를 카운팅할 변수
		
		//in_perm 배열에 false인 인덱스는 사용 안한 숫자 -> 이것을 후보군으로 담아서 보낸다 
		for (int i = 0; i < in_perm.length; i++) {
			if(!in_perm[i]) { // 사용하지 않은 숫자라면 후보군에 담겠다
				c[ncands++] = i;
			}
		}
		
		
		return ncands;
				
		
	}
	/** 각 완성 단계에서 하고 싶은 작업 (출력) */
	public static void process_solution(int []a, int k) {

		for (int i = 0; i < k; i++) { // a.length 와 k 해도 같은 값이지만 k라고
			System.out.print(arr[a[i]] +" ");// 저장된순번을 출력해보기
		}
		System.out.println();
	}
}//class
