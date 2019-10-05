import java.util.Scanner;

/**
 * 
 * 사다리사용
 * 
 * Scanner - 367ms
 * BufferedReader " 123" = 123 " 0 1 1 1  0 0 0 "
 *  
 * 
 * @author student
 *
 */
public class Solution_1210_Review {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		for (int tc = 1; tc <=10 ; tc++) {
//			int N = sc.nextInt();
			int N = sc.nextInt();
			int [][] m = new int [100][102]; // 인덱스를 넘어가지 않도모서리를 위해
			
			for (int i = 0; i < m.length; i++) {
				for (int j = 1; j <=100; j++) {
					m[i][j]=sc.nextInt();
					
					
				}
			}
			
			int r= 99;
			int c= 100;
			for (int i = 1; i <= 100; i++) {// find 2 after last row
				if(m[99][i]==2) {
					c=i;				
				}
			}

			final int up = 1;
			final int left = 2;
			final int right = 3;
			int dir = up; // up
			
			while(r>0) {
				if(dir !=right  && m[r][c-1]==1) { //go to left
					dir = left;
					c--;
					
				}else if (dir != left && m[r][c+1]==1) { //right 
					dir = right;
					c++;
					
				}else { //up
					dir = up;
					r--;
					
				}
				
			}
			System.out.println("# "+tc+" " +(c-1));
			
			
		}// tc
		
	}//main

}// class
