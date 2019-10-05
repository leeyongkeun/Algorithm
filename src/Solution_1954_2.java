import java.util.Scanner;

public class Solution_1954_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(src);
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int [][] map = new int [N][N];
			int r = 0 , c = -1;
			int cnt = 1, step = N;
			System.out.println("#"+tc+" ");
			while(step>=0) {
				for (int i = 0; i < step; i++) {
					++c;
					map[r][c] = cnt++;
				}
				step--;
				for (int i = 0; i < step; i++) {
					++r;
					map[r][c] = cnt++;
				}
				for (int i = 0; i < step; i++) {
					--c;
					map[r][c] = cnt++;
				}
				step--;
				for (int i = 0; i < step; i++) {
					--r;
					map[r][c] = cnt++;
				}
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					System.out.print(map[i][j]+" ");
				}
				System.out.println();
			}
			
			
			
		}//tc

	}//main
	public static String src = "2\r\n" + 
			"3\r\n" + 
			"4\r\n" + 
			"";
}
