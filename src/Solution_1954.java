import java.util.Arrays;
import java.util.Scanner;

public class Solution_1954 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for (int tc = 1; tc <= TC; tc++) {
			
			int N = sc.nextInt();
			int [][] arr = new int[N][N];
			int r=0,c=-1,index=0,step=N;

			int [] data = new int[N*N];
			
			for (int i = 0; i < data.length; i++) {
				data[index++]=i+1;
			}
			 
			//System.out.println(Arrays.toString(data));
			
			index = 0;
			while(step>0) {
				for (int i = 0; i < step; i++) {
					c++;
					arr[r][c]=data[index++];
				}	//우
				step--;
				for (int i = 0; i < step; i++) {
					r++;
					arr[r][c]=data[index++];
				}	//하
				for (int i = 0; i < step; i++) {
					c--;
					arr[r][c]=data[index++];
				}	//좌
				step--;
				for (int i = 0; i < step; i++) {
					r--;
					arr[r][c]=data[index++];
				}	//상
			}
			System.out.printf("#%d\n",tc );
		
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%d ",arr[i][j]);
				}
				System.out.println();
			}
			
		}// tc
		
		
	} // main

}// class
