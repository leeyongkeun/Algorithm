/**
 * 
 * 사다리사용
 * 
 * Scanner - 367ms 느리다
 * BufferedReader 쪼개기 String split 158ms
 * BufferedReader 쪼개기 StringTokeniser 140ms (원래는 더 빠르다 )
 * BufferedReader String로 안쪼개기 charAt() 130ms
 * 
 * 
 * @author student
 *
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class br_1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//br.readLine(); // 엔터입력까지의 한줄을 받아온다. 엔터는 버림
	
		for (int tc = 1; tc <=10 ; tc++) {
			int N = Integer.parseInt(br.readLine());
			int [][] m = new int [100][102]; // 인덱스를 넘어가지 않도모서리를 위해
			
			for (int i = 0; i < m.length; i++) {
				String s = br.readLine(); // " 1 0 0 0 1 0 1 1 0 0 1 0"
				  							// 0123456789 
				//StringTokenizer st = new StringTokenizer(br.readLine()," ");// 구분자를 넣어주기
				//st.nextToken();
				
				
				//String [] srr = "3".split(" ")
				for (int j = 1; j <=100; j++) {
					m[i][j]= s.charAt(j*2-2); //;   // j : 0 2 3 4 5
												// i : 1 2 3 4 5
					
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
				if(dir !=right  && m[r][c-1]=='1') { //go to left
					dir = left;
					c--;
					
				}else if (dir != left && m[r][c+1]=='1') { //right 
					dir = right;
					c++;
					
				}else { //up
					dir = up;
					r--;
					
				}
				
			}
			System.out.println("# "+tc+" " +(c-1));
			
			
		}
	
	} //main 

}//class
