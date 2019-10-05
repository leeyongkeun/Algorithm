import java.util.Arrays;

/**
 *  정렬이 안된 경우 O[n]     순차 검색
 *  
 *  정렬이 된 경우 O[log2 n ] 이진검색
 * 
 *  정렬이 안된 경우 
 * 
 *  선택 정렬 O[n^2] : 정렬 방법으로는 시간이 많이 걸려서 안쓰임 
 *  k번째로 큰 (작은 )값을 찾을 떄, 셀렉션 알고리즘이 활용될 수 있다. 
 * 
 *
 */
public class Z10_SelectionSort { // 선택 정렬

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,4,1,9,2,8,5,7,3};
		// 0~8 에서 최소값 : 0 <-> 최소값 교환 ( 최소값이 들어있는 방 번호를 찾아야)
		// 1~8 에서 최소값 : 1 <-> 최소값 교환 ( 최소값이 들어있는 방 번호를 찾아야)
		// 2~8 에서 최소값 : 2 <-> 최소값 교환 ( 최소값이 들어있는 방 번호를 찾아야)
		// 3~8 에서 최소값 : 3 <-> 최소값 교환 ( 최소값이 들어있는 방 번호를 찾아야)
		 
		for (int i = 0; i < arr.length; i++) {
		//	i_8에서 최소값 방 번호 : i <-> 최소값 교환
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[minIndex]> arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	} // main

}// class
