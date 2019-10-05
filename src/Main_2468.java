import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class Main_2468 {

	public static boolean [][] visited;
	public static int[][] arr;
	public static int[][] temp;
	public static int xx =0, yy=0, d=0;
	public static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}}; //상 하 좌 우
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(br.readLine());
		arr = new int [N][N];
		temp = new int [N][N];
		visited= new boolean[N][N]; 
		int cnt = 0 , height = 5;
		
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(arr[i][j] > height) {
					temp[i][j] = arr[i][j];
				}
				System.out.print(temp[i][j]+ " ");
			}
			System.out.println();
		}

		System.out.println("=========");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(!visited[i][j] && temp[i][j]!=0) {
					DFS(i,j,N);
					++cnt;
					System.out.println("cnt : "+cnt+" ["+i+","+j+"]");
				}
			}
		}
		
		System.out.println("최대값: "+cnt);
	
		
	}//main

	public static String src="5\r\n" + 
			"6 8 2 6 2\r\n" + 
			"3 2 3 4 6\r\n" + 
			"6 7 3 3 2\r\n" + 
			"7 2 5 3 6\r\n" + 
			"8 9 5 2 7";
	
	public static void DFS(int y, int x, int N) {
		visited[y][x] = true;
		for (d = 0; d < 4; d++) {
			int xx = x + dir[d][0];
			int yy = y + dir[d][1];
			
			if(yy>=0 && yy<N && xx>=0 && xx<N) {
				if(!visited[yy][xx] && temp[yy][xx]!=0) {
					DFS(yy,xx,N);
				}
			}
		}
	} //DFS
	
}//class
