
public class Z02_Array {

	public static void main(String[] args) {
		// 배열을 객체로 간주한다. 
		// 배열은 생성과 동시에 각 타입의 기본 값으로 초기화 된다.
		
		int[] arr;
		arr = new int[3];
		int[] brr = new int[3];
		int[] crr = {1,2,3};
		int[] drr = new int[] {1,2,3}; // 익명 배열 사용할 때
		int max; // 지역변수에는 초기값이 들어있지 않다.
		int [][] err = {{1,2},{3,4},{5,6}}; //3행 2열
		for (int i = 0; i < err.length; i++) {
			for (int j = 0; j < err[i].length; j++) {
				System.out.print(err[i][j]+" ");
				
			}
		}
		
		
		
	}//end of main

}// end of class
