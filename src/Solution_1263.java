import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_1263 {

	static final int M = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int TC = Integer.parseInt(st.nextToken());
		
		
		for (int tc = 1; tc <= TC; tc++) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int [][] arr = new int [N][N];
			System.out.print("#"+tc+" ");
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
					if(arr[i][j] == 0) arr[i][j] = M;
					//System.out.print(arr[i][j] +" ");
					
				}
				//System.out.println();
			}
			
			for (int k = 0; k < arr.length; k++) {
				for (int i = 0; i < arr.length; i++) {
					if(k == i) continue;
					for (int j = 0; j < arr.length; j++) {
						if(k==j || i==j) continue;
						if(arr[i][k] !=M && arr[k][j] != M
								&& arr[i][j] > arr[i][k] + arr[k][j]) {
							arr[i][j] = arr[i][k] + arr[k][j];
						}
					}
				}
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					//System.out.print(arr[i][j] == M ? "M ": arr[i][j]+ " ");
				}
				//System.out.println();
			}
			
			int min = M;
			
			for (int i = 0; i < N; i++) {
				int sum = 0;
				for (int j = 0; j < N; j++) {
					if(i == j) continue;
					sum += arr[i][j]; 
				}
				if(min > sum) min = sum;
			}
			System.out.println(min);
			
		}//tc
		
	}//main
}//class
