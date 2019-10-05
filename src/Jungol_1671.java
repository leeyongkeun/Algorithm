import java.util.Scanner;

public class Jungol_1671 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(src);
		int N = sc.nextInt();
		int [] xrr = new int [N];
		int [] yrr = new int [N];
		int [][] map = new int [101][101];
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			xrr[i] = sc.nextInt();
			yrr[i] = sc.nextInt();
		}//N
		
		for (int k = 0; k < N; k++) {
			for (int i = yrr[k]; i < yrr[k]+10; i++) {
				for (int j = xrr[k]; j < xrr[k]+10; j++) {
					map[i][j] = 1;
				}
			}
		}// 
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if(map[i][j] != map[i][j+1]) {
					cnt++;
				}
			}
		}//
		for (int j = 0; j < 100; j++) {
			for (int i = 0; i < 100; i++) {
				if(map[i][j] != map[i+1][j]) {
					cnt++;
				}
			}
		}//
		System.out.println(cnt);
		
	}//main
	
	public static String src="4 \r\n" + 
			"3 7 \r\n" + 
			"5 2 \r\n" + 
			"15 7 \r\n" + 
			"13 14\r\n"+
			"";

}//class
