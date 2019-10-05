import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_6730 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int TC = Integer.parseInt(st.nextToken());
		for (int tc = 1; tc <= TC ; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int [] arr = new int [N];
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			System.out.print("#"+tc+" ");
			int up = 0;
			int down = 0;
			for (int i = 0; i < N-1; i++) {
				if(arr[i+1]-arr[i]>=0 && up < arr[i+1]-arr[i]) {
					up = arr[i+1]-arr[i];
				}
				if(arr[i]-arr[i+1]>=0 && down < arr[i]-arr[i+1]) {
					down = arr[i]-arr[i+1];
				}
			}
			System.out.println(up +" "+down);
		}//tc
	}//main
}//class
