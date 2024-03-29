import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_1226 {

	public static int [][] dirs = {{1,0},{-1,0},{0,-1},{0,1}};
	public static int [][] map = new int [16][16];
	public static boolean [][] visited = new boolean [16][16];
	public static int result;
	public static int sx,sy,fx,fy;
	
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int tc = 1; tc <= 10; tc++) {
			int TC = Integer.parseInt(br.readLine());
			result = 0;
			for (int i = 0; i < 16; i++) {
				String [] str = br.readLine().split("");
				for (int j = 0; j < 16; j++) {
					map[i][j] = str[j].charAt(0)-'0';
					//System.out.print(map[i][j]+" ");
				}
				//System.out.println();
			}
			
			System.out.print("#"+tc+" ");
			
			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 16; j++) {
					if(map[i][j]==2) {
						sx = j; sy = i;
						//System.out.print("["+sx+","+sy+"]");
					}
					if(map[i][j]==3) {
						fx = j; fy = i;
						//System.out.print("["+fx+","+fy+"]");
					}
				}
			}
			
			DFS(sx,sy);
			System.out.println();
			System.out.println(result);
			
		}//tc
	}//main
	public static void DFS(int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int dx = x + dirs[i][0];
			int dy = y + dirs[i][1];
			if(dx>=0 && dy>=0 && dx<16 && dy<16 && !visited[dx][dy] && map[dx][dy]!=1) {
				//System.out.print("["+dx+" "+dy+"]");
				if(dx==fx && dy==fy) {
					result = 1;
				}else {
					DFS(dx,dy);
				}
				
			}
		}
		visited[x][y] = false;
		
		
	}//DFS
	
	public static String src="1\r\n" + 
			"1111111111111111\r\n" + 
			"1210000000100011\r\n" + 
			"1010101110101111\r\n" + 
			"1000100010100011\r\n" + 
			"1111111010101011\r\n" + 
			"1000000010101011\r\n" + 
			"1011111110111011\r\n" + 
			"1010000010001011\r\n" + 
			"1010101111101011\r\n" + 
			"1010100010001011\r\n" + 
			"1010111010111011\r\n" + 
			"1010001000100011\r\n" + 
			"1011101111101011\r\n" + 
			"1000100000001311\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"2\r\n" + 
			"1111111111111111\r\n" + 
			"1200000010000011\r\n" + 
			"1011111011111011\r\n" + 
			"1000001010000011\r\n" + 
			"1110101010111011\r\n" + 
			"1010101010100011\r\n" + 
			"1011111010111111\r\n" + 
			"1000001010000011\r\n" + 
			"1011101011111011\r\n" + 
			"1010101010000011\r\n" + 
			"1010101010111111\r\n" + 
			"1010100000130011\r\n" + 
			"1010111111111011\r\n" + 
			"1000000000000011\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"3\r\n" + 
			"1111111111111111\r\n" + 
			"1210001000100011\r\n" + 
			"1010101010101011\r\n" + 
			"1000100010101011\r\n" + 
			"1011111110101011\r\n" + 
			"1000001010101011\r\n" + 
			"1111101010101011\r\n" + 
			"1010001000001011\r\n" + 
			"1010111111111011\r\n" + 
			"1010000000100011\r\n" + 
			"1011111110101111\r\n" + 
			"1000001010100011\r\n" + 
			"1011101010111011\r\n" + 
			"1000100000130011\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"4\r\n" + 
			"1111111111111111\r\n" + 
			"1200100000000011\r\n" + 
			"1011101110111011\r\n" + 
			"1000001010101011\r\n" + 
			"1111111011101011\r\n" + 
			"1000100010000011\r\n" + 
			"1010101010111111\r\n" + 
			"1010001010001011\r\n" + 
			"1011111011101011\r\n" + 
			"1000100010100011\r\n" + 
			"1110101110111111\r\n" + 
			"1010100000130011\r\n" + 
			"1010111111111011\r\n" + 
			"1000000000000011\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"5\r\n" + 
			"1111111111111111\r\n" + 
			"1210000000100011\r\n" + 
			"1010111011101011\r\n" + 
			"1010100010001011\r\n" + 
			"1011101010111011\r\n" + 
			"1000001010001011\r\n" + 
			"1111111011111011\r\n" + 
			"1000100010000011\r\n" + 
			"1011101010111011\r\n" + 
			"1010001000001011\r\n" + 
			"1010101011111111\r\n" + 
			"1010101000000011\r\n" + 
			"1010101110111011\r\n" + 
			"1000100010001311\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"6\r\n" + 
			"1111111111111111\r\n" + 
			"1210001010000011\r\n" + 
			"1010101010111111\r\n" + 
			"1010100000100011\r\n" + 
			"1010111111101011\r\n" + 
			"1000100000001011\r\n" + 
			"1110101111111011\r\n" + 
			"1000100000001011\r\n" + 
			"1011101111101011\r\n" + 
			"1000101000101011\r\n" + 
			"1110101010111011\r\n" + 
			"1010100010100011\r\n" + 
			"1010111110101111\r\n" + 
			"1000000000100311\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"7\r\n" + 
			"1111111111111111\r\n" + 
			"1210000000000011\r\n" + 
			"1011101111111011\r\n" + 
			"1000101010000011\r\n" + 
			"1110101010111011\r\n" + 
			"1000001000101011\r\n" + 
			"1010111111101111\r\n" + 
			"1010100000100011\r\n" + 
			"1011101110101111\r\n" + 
			"1000001000100011\r\n" + 
			"1111111011111011\r\n" + 
			"1000100010001011\r\n" + 
			"1010101110111011\r\n" + 
			"1010001300000011\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"8\r\n" + 
			"1111111111111111\r\n" + 
			"1200000010000011\r\n" + 
			"1111111010111011\r\n" + 
			"1000000010001011\r\n" + 
			"1011111111111011\r\n" + 
			"1010000000000011\r\n" + 
			"1010111111101011\r\n" + 
			"1010000000001011\r\n" + 
			"1010111011111011\r\n" + 
			"1000100010001011\r\n" + 
			"1111111011101011\r\n" + 
			"1000001000100011\r\n" + 
			"1110111110101011\r\n" + 
			"1000000000101311\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"9\r\n" + 
			"1111111111111111\r\n" + 
			"1200000000001011\r\n" + 
			"1011111111101011\r\n" + 
			"1000000010001011\r\n" + 
			"1111111010111011\r\n" + 
			"1000100010000011\r\n" + 
			"1011101111111011\r\n" + 
			"1010001000001011\r\n" + 
			"1010111011101011\r\n" + 
			"1010000010101311\r\n" + 
			"1011111110101111\r\n" + 
			"1000100000100011\r\n" + 
			"1011101011111011\r\n" + 
			"1000001000000011\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111\r\n" + 
			"10\r\n" + 
			"1111111111111111\r\n" + 
			"1200001000100011\r\n" + 
			"1111101110101011\r\n" + 
			"1000100010001011\r\n" + 
			"1011101111101111\r\n" + 
			"1000100000000011\r\n" + 
			"1110111111101011\r\n" + 
			"1000000010001011\r\n" + 
			"1110111011101011\r\n" + 
			"1010001000001011\r\n" + 
			"1010101111111011\r\n" + 
			"1000101010000011\r\n" + 
			"1010101010101111\r\n" + 
			"1010100000100311\r\n" + 
			"1111111111111111\r\n" + 
			"1111111111111111";
}
