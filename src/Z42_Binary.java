import java.util.Arrays;

public class Z42_Binary {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4,6};
		System.out.println(Arrays.binarySearch(arr, 5));
		// 이진탐색
		// 정렬된 상태의 배열에서 찾을 key 값이 존재하는 index 를 리턴
		// key가 존재 하지 않으면, 삽입해야할 위치 +1  값을 리턴
	}
}
