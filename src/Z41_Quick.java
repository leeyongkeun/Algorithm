import java.util.Arrays;

public class Z41_Quick {
	public static int[] arr = {5,1,8,9,2,7,3,6,4};
	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(arr));
		Quicksort(0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}//main

	public static void Quicksort(int left, int right) {
		// 피봇을 기준으로 분할 하는 메서드
		// 피봇은 정렬된 위치로 옮겨진다
		// 분할만 해도 정렬이 된다. 
		if(left >= right) {
			//원소가  2개 이상일 떄만 정렬을 진행
			return;
		} 
		int pivot = Hoare(left, right);
		//int pivot = Lomuto(left, right);
		Quicksort(left, pivot-1);
		Quicksort(pivot+1, right);
		
	}
	
	public static int Lomuto(int left, int right) {
		// 피봇을 기준으로 작거나 같은 값을 좌측, 큰 값을 우측에 i~j 인덱스 범위안으로 지정
		// i위치는 큰 값 범위의 1칸 전인 인덱스
		// j위치는 큰 값 범위의 마지막 인덱스, , a[i] < 큰값들 <= a]j]
		int pivot = arr[right];
		int i = left -1;
		
		for (int j = left; j < right; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
		return i+1;
		
	}
	// left~right 범위에서 피봇을 기준으로 
	// 작거나 같은것은 피봇의 좌측으로 , 크거나 같은것은 피봇의 우측으로 
	// 피봇의 위치를 리턴
	
	public static int Hoare(int left, int right) {
		int pivot = left;
		// 피봇을 좌측 끝으로 지정
		while(left <= right) {
			// left < right 도 가능
			// 원소가 있으면 진행하기
			// 반드시 배열의 인덱스를 벗어나지 않는지 체크 필요 
			
			while(left <=right && arr[left] <= arr[pivot]) left++;
			while(left <=right && arr[right] > arr[pivot]) right--;
			if(left < right) { // 인덱스 교차시 종료
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		
		int temp = arr[right];
		arr[right] = arr[pivot];
		arr[pivot] = temp;
		
		
		return right;
	}
}//class
