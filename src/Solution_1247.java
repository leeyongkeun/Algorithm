import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1247 {
	public static int comX, comY;
	public static int homeX, homeY;
	public static int [][] visit;
	public static int N;
	public static int min;
	
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC ; tc++) {
			N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			comX = Integer.parseInt(st.nextToken());
			comY = Integer.parseInt(st.nextToken());
			homeX = Integer.parseInt(st.nextToken());
			homeY = Integer.parseInt(st.nextToken());
			min = Integer.MAX_VALUE;
			visit = new int [N][2];
			for (int i = 0; i < N; i++) {
				visit[i][0] = Integer.parseInt(st.nextToken());
				visit[i][1] = Integer.parseInt(st.nextToken());
			}
			Permutation(0);
			System.out.print("#"+tc+" ");
			System.out.println(min);
		}//tc
		
	}// main 
	public static void Permutation(int k) {
		if(k == N) {
			int distance = 0;
			int tempX = comX;
			int tempY = comY;
			// 처음 시작은 회사부터 시작
			for (int i = 0; i < N; i++) {
				distance += Math.abs(tempX - visit[i][0]) 
						+ Math.abs(tempY -visit[i][1]);
				tempX = visit[i][0];
				tempY = visit[i][1];
			}
			distance += Math.abs(tempX-homeX) 
						+ Math.abs(tempY-homeY);
			// 마지막 고객을 방문하고 집으로감
			if( distance < min ) min = distance;
			// 최소값을 구한다
			return;
		}
		for (int i = k; i < N; i++) {
			
			int temp = visit[k][0];
			visit[k][0] = visit[i][0];
			visit[i][0] = temp;
			temp = visit[k][1];
			visit[k][1] = visit[i][1];
			visit[i][1] = temp;
			
			Permutation(k+1);
			
			temp = visit[k][0];
			visit[k][0] = visit[i][0];
			visit[i][0] = temp;
			temp = visit[k][1];
			visit[k][1] = visit[i][1];
			visit[i][1] = temp;
		}
	}
	public static String src = "10\r\n" + 
			"5\r\n" + 
			"0 0 100 100 70 40 30 10 10 5 90 70 50 20\r\n" + 
			"6\r\n" + 
			"88 81 85 80 19 22 31 15 27 29 30 10 20 26 5 14\r\n" + 
			"7\r\n" + 
			"22 47 72 42 61 93 8 31 72 54 0 64 26 71 93 87 84 83\r\n" + 
			"8\r\n" + 
			"30 20 43 14 58 5 91 51 55 87 40 91 14 55 28 80 75 24 74 63\r\n" + 
			"9\r\n" + 
			"3 9 100 100 16 52 18 19 35 67 42 29 47 68 59 38 68 81 80 37 94 92\r\n" + 
			"10\r\n" + 
			"39 9 97 61 35 93 62 64 96 39 36 36 9 59 59 96 61 7 64 43 43 58 1 36\r\n" + 
			"10\r\n" + 
			"26 100 72 2 71 100 29 48 74 51 27 0 58 0 35 2 43 47 50 49 44 100 66 96\r\n" + 
			"10\r\n" + 
			"46 25 16 6 48 82 80 21 49 34 60 25 93 90 26 96 12 100 44 69 28 15 57 63\r\n" + 
			"10\r\n" + 
			"94 83 72 42 43 36 59 44 52 57 34 49 65 79 14 20 41 9 0 39 100 94 53 3\r\n" + 
			"10\r\n" + 
			"32 79 0 0 69 58 100 31 67 67 58 66 83 22 44 24 68 3 76 85 63 87 7 86\r\n" + 
			"";
	
}
