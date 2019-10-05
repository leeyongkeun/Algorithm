import java.util.Arrays;

public class Z36_RecursiveSort {
	public static int [] Arr = {5,7,2,4,1,0,9,3,6,8};
	public static int min;
	
	public static void main(String[] args) {

		Sort1(0);
		System.out.println(Arrays.toString(Arr));
	}//main
	public static void Sort1(int i) {
		// 범위의 시작 위치를 정하는 for문
		if(i==Arr.length) {
			return;
		}// 종료
		else {
			//i~끝까지 범위, 범위내의 최소값위치 찾기 교환
			min = i;
			Sort2(i);
			int temp = Arr[min];
			Arr[min] = Arr[i];
			Arr[i] = temp;
			Sort1(i+1);
		}// 반복
	}
	
	public static void Sort2(int i) {
		if(i==Arr.length) {
			return;
		}// 종료
		else {
			if(Arr[min]> Arr[i]) min = i;
			Sort2(i+1);
		}// 반복
	}
}//class
