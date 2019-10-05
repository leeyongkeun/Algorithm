import java.util.Arrays;
import java.util.Random;

/**
 * 삽입정렬 : O[n^2]
 * 		하지만 하나만 정렬할때 유용하다 (이진검색)
 * @author student
 */
public class Z30_InsertSort {

	public static void main(String[] args) {

		//int [] arr = {1,4,7,0,5,6,8,2,9,3};
		int [] arr = new int[200000];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt();
		}
		//long time = System.currentTimeMillis();
		
		// 배열, swap 안함 , arraycopy() 20만개 5초 
		
		for (int i = 0; i < arr.length; i++) {
			int data = arr[i];
			int j;
			
			for (j = i-1; j >= 0 && data < arr[j] ; j--) {
			}
			
			// 통째로 옮기기
			System.arraycopy(arr, j+1 , arr, j+2, i-1-j);
			arr[j+1] = data;
			
		}
		
		// System.out.println(System.currentTimeMillis() - time );
		
		
		
		
		
		// 배열, swap 안함 , 20만개 9초
//		for (int i = 1; i < arr.length ; i++) {
//			int data = arr[i]; // 삽입할 대상
//			int j;
//			for (j = i-1; j >= 0 && data < arr[j] ; j--) {
//				arr[j+1] = arr[j];// 뒤로 한칸 옮기기
//			}
//			arr[j+1] = data; // 백업해놨던 삽입할 대상 숫자를 저장, 1개를 보정 
//		}
//		
//
//		
//		// 	배열, swap, 코드가 간단, 20만개 12초
//		for (int i = 1; i < arr.length; i++) {
//			for (int j = i-1; j >= 0 && arr[j+1] < arr[j] ; j--) {
//				// 삽입할 대상 전부터 감소하면서 검색
//				int temp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] = temp;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(Arrays.toString(arr));
	}//main

}// class
