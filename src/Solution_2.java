import java.util.Arrays;
import java.util.Scanner;

public class Solution_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 또는 bufferedreader
		Scanner sc = new Scanner(System.in);
		// BufferedReader br : 속도가 빠르지만 불편함 형변환을 해야한다
		
		 int N = sc.nextInt();
		 int[] arr = new int[N];		 
		 for (int i = 0; i < N; i++) {
			 arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);//오름차순으로 정렬
		//System.out.println(Arrays.toString(arr));
		System.out.println(arr[N/2]);
		
	} //end of main
}// end of class
