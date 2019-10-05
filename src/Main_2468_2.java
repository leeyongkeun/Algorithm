import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2468_2 {
 
	public static boolean [][] visited;
	public static int[][] arr;
	public static int N;
	public static int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}}; //상 하 좌 우
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new StringReader(src));
		N = Integer.parseInt(br.readLine());
		arr = new int [N][N];
		visited= new boolean[N][N]; 
		int maxheight = 0;
		
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
				if(maxheight < arr[i][j]) { //최대 높이를 저장
					maxheight = arr[i][j];
				}
			}
		}
		int maxcnt = 1;
		int cnt = 0;

		System.out.println("=========");
		
		for (int height = 1; height <= maxheight; height++) { // 최대 높이 만큼 최대 개수 찾기 
			visited= new boolean[N][N]; 
			cnt = 0;
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(!visited[i][j] && arr[i][j]>height) {
						cnt++;
						DFS(i,j,height);
					}
				}
			}
			if (maxcnt < cnt) maxcnt = cnt;
		}


		System.out.println("최대값: "+maxcnt);
	
		
	}//main

	public static String src="5\r\n" + 
			"6 8 2 6 2\r\n" + 
			"3 2 3 4 6\r\n" + 
			"6 7 3 3 2\r\n" + 
			"7 2 5 3 6\r\n" + 
			"8 9 5 2 7";
	
	public static void DFS(int x, int y, int height) {
		visited[x][y] = true;
		for (int d = 0; d < 4; d++) {
			int xx = x + dir[d][0];
			int yy = y + dir[d][1];
			
			if(yy>=0 && yy<N && xx>=0 && xx<N) {
				if(!visited[xx][yy] && arr[xx][yy]>height) {
					DFS(xx,yy,height);
				}
			}
		}
	} //DFS
	
}//class
