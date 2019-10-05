import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		System.out.println((arr[99]));
		
		
		
			
			
			
		
		
		
	}

}
