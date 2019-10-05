import java.util.Arrays;
import java.util.Scanner;

public class Solution_1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int TC=sc.nextInt();
		int[] arr = new int[1000];
		
		
		
		for (int tc = 1; tc <= TC; tc++) {
			
			int a = 0;
			int max = Integer.MIN_VALUE;
			int tc1=sc.nextInt();
			int[] cnt = new int[101];
			
			for (int i = 0; i < arr.length; i++) {
								
				arr[i] = sc.nextInt();
									
			}
			for (int j = 0; j < arr.length; j++) 
				cnt[arr[j]]++;
				
			
			for (int i = 0; i < cnt.length; i++) {
				
				if(max <= cnt[i]) {
					max = cnt[i];
					a=i;
				}
				
							
			}
			
			
			System.out.println("#"+tc+" "+ a);
		
			
		}//end of TC
			
		
	} // end of main

} // end of class
