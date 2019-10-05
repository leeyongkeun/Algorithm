
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_2222 {

	private static int[][] map;
	private static int N;
	private static int M;
	private static int startX;
	private static int startY;
	private static int endX;
	private static int endY;
	private static boolean [][] visited;
	public static int [][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
	private static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int [N][M];
		visited = new boolean [N][M];
		
		startX = 0; startY = 0;
		endX = M-1; endY = N-1;
		cnt = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}//입력
		System.out.println();
		DFS(startX, startY);
		System.out.println(cnt);
		
		
	}//main
	
	
	private static void DFS(int y, int x) {
		
		System.out.print(map[y][x]+" ");
		for (int d = 0; d < 4; d++) {
			int dy = y + dirs[d][1];
			int dx = x + dirs[d][0];
			
			if(dy >=0 && dy <N && dx>=0 && dx< M) {
				if(dy==endY && dx==endX) {
					cnt++;
					System.out.println(map[dy][dx]+" ");
					return;
				}
				if(!visited[dy][dx] && map[y][x] > map[dy][dx] ) {
					visited[dy][dx] = true;
					DFS(dy,dx);
					visited[dy][dx] = false;
				}
			}
		}
		
	}//DFS


	public static String src="4 5\r\n" + 
			"50 45 37 32 30\r\n" + 
			"35 50 40 20 25\r\n" + 
			"30 30 25 17 28\r\n" + 
			"27 24 22 15 10\r\n" + 
			"";
}//class
