import java.util.Arrays;
import java.util.Scanner;

public class Solution_1209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [][] arr = new int [100][100];
		
		for (int tc = 1; tc <= 10 ; tc++) {
			
			int TC = sc.nextInt();
			int index=0;
			int [] sum = new int[202];
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] =sc.nextInt();
					
				}
			}// 입력받은 값을 배열에 넣기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					
					sum[index] += arr[i][j];
				}
				index++;
			}//행의 합
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					
					sum[index] += arr[j][i];
				}
				index++;
			}//열의 합
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(i==j) sum[index]+= arr[i][j];
					
				}
			}//한쪽 대각선의 합
			index++;
			
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(i+j==99) sum[index]+= arr[i][j];
					
				}
			}//다른쪽 대각선의 합
			Arrays.sort(sum);
			System.out.println("#"+TC+" "+sum[sum.length-1]);
			
		}//tc
		
		
	}//main

	
}//class
