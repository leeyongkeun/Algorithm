import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1494 {
	public static int [] arr , trr;
	public static int [] wormX, wormY;
	public static long sumX, sumY;
	public static long result, min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			arr = new int [N];
			trr = new int [N/2];
			wormX = new int [N];
			wormY = new int [N];
			sumX = 0 ; sumY = 0;
			result = 0;
			min = Long.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				wormY[i] = Integer.parseInt(st.nextToken());
				wormX[i] = Integer.parseInt(st.nextToken());
			}
			//System.out.println(Arrays.toString(wormY));
			//System.out.println(Arrays.toString(wormX));
			
			for (int i = 0; i < N; i++) {
				sumY += wormY[i];
				sumX += wormX[i];
				arr[i] = i;
			}
			//System.out.println(sumX +" "+sumY);
			Comb(N,N/2);
			System.out.print("#"+tc+" ");
			System.out.println(min);
			
		}//tc
		
	}//main
	
	public static void Comb (int n, int r) {
		if(r==0) {
			//System.out.println(Arrays.toString(trr));
			long tSumY = sumY; 
			long tSumX = sumX;
			for (int i = 0; i < trr.length; i++) {
				tSumY -= wormY[trr[i]]*2;
				tSumX -= wormX[trr[i]]*2;
				
			}
			result = (tSumX * tSumX) + (tSumY * tSumY);
			if(min > result) min = result;
			return;
			
		}else if(n<r) {
			return;
		}else {
			trr[r-1] = arr[n-1];
			Comb(n-1, r-1);
			Comb(n-1, r); 
		}
	}
	
}