import java.util.Arrays;

/**
 * 
 * 순열 알고리즘
 * 1. 반복문으로 작성 6중 포문
 * 2. 백트랙킹 단원 후보군 목록 구해온다  사용한 숫자를 체크해서 
 * 		사용안한 숫자의 목록을 만든다.
 * 3. 코드 간단 = 권장사항 - swap 방법으로 반복하고
 * 		사용안한 숫자들은 뒷쪽에 남아있도록 배치
 * 		코드도 간단~~!~!!
 * @author student
 *
 */
public class Z37_순열 {
	public static int [] arr = {6,7,8,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perm(arr.length, 0);
	}//main
	public static void Perm(int n, int k) {
	//n 뽑는 갯수 k 단계
		if(k == n) {
			System.out.println(Arrays.toString(arr));
		}else {
			//  현재 0번째 단계 칸에 모든 숫자를 채우고, 다음 1번째 단계로 사용하지않은 숫자에게 대해 반복
			for (int i = 0; i < arr.length; i++) {
				// swap(k위치 <-> i 위치를 바꾸기)
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				Perm(n,k+1);
				//swap (k위치 <-> i위치 0 원상 복구)
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				}
		}
	}
}//class
