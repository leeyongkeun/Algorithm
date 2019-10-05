import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2630_make_a_colorpaper {
	public static int [][] map;
	public static int N;
	public static int totalWhite, totalBlue;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int [N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				//System.out.print(map[i][j]+" ");
			}
			//System.out.println();
		}// input
		
		Cut(0, 0, N-1, N-1);
		System.out.println(totalWhite);
		System.out.println(totalBlue);
		
	}//main
	public static void Cut (int startX, int startY, int endX, int endY) {
		
		int bCnt = 0;
		int wCnt = 0;
		for (int i = startY; i <= endY; i++) {
			for (int j = startX; j <= endX; j++) {
				if(map[i][j] == 0 ) wCnt ++;
				else bCnt++;
			}
		}
		
		if(wCnt == 0 ) totalBlue++;
		else if(bCnt ==0 ) totalWhite++;
		else {
			
			Cut(startX, startY, (startX+endX)/2, (startY+endY)/2); 		// 왼쪽 위
			
			Cut(startX, (startY+endY)/2 +1, (startX+endX)/2, endY); 	// 왼쪽 아래 
			 
			Cut((startX+endX)/2 +1, startY, endX, (startY+endY)/2); 	// 오른쪽 위
			
			Cut((startX+endX)/2 +1, (startY+endY)/2 +1, endX, endY); 	// 오른쪽 아래 
			
		}
		return;
	}
	

	public static String src ="8\r\n" + 
			"1 1 0 0 0 0 1 1\r\n" + 
			"1 1 0 0 0 0 1 1\r\n" + 
			"0 0 0 0 1 1 0 0\r\n" + 
			"0 0 0 0 1 1 0 0\r\n" + 
			"1 0 0 0 1 1 1 1\r\n" + 
			"0 1 0 0 1 1 1 1\r\n" + 
			"0 0 1 1 1 1 1 1\r\n" + 
			"0 0 1 1 1 1 1 1\r\n" + 
			"";
}
