import java.util.Arrays;
import java.util.Scanner;

public class Solution_5431 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int TC = sc.nextInt();
				
		for (int tc = 1; tc <= TC ; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int cnt=0;
			boolean[] arr = new boolean[N];
			int [] brr= new int[N-K];
			for (int i = 1; i <= K; i++) {
				arr[sc.nextInt()-1] = true;
				
			}
			
			System.out.println(Arrays.toString(arr));
			
			for (int i = 0; i < N; i++) {
				if (arr[i]==false){
					cnt++;
					brr[cnt-1]=i+1;
				
				
					//System.out.print(brr+" ");
				}
				
			}									
			System.out.printf("#"+tc+" ");
			for (int i = 0; i < cnt; i++) {
				System.out.print(brr[i]+" ");
				
				
			}
			System.out.println();
		}//tc
		
		
	}//main

}//class
