import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3074 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			long M = Integer.parseInt(st.nextToken());
			long [] func = new long [N];
			long max = -1;
			for (int i = 0; i < N; i++) {
				func[i] =  Long.parseLong(br.readLine());
				//System.out.println(func[i] +" ");
				if(max < func[i]) max = func[i];
			}
			System.out.print("#"+tc+" ");
			long minTime = 0;
			long maxTime = max * M;
			//System.out.println(minTime + " "+ maxTime);
			
			while(minTime <= maxTime) {
				
				long num = 0;
				long midTime = (minTime+maxTime)/2;
				for (int i = 0; i < N; i++) {
					num += midTime / func[i]; 
				}
				//System.out.println(num);
				if(num >= M) maxTime = midTime -1;
				else {
					minTime = midTime +1;
				} 
			} // while
			System.out.println(minTime);
		}//tc
	}//main
	public static String src = "2\r\n" + 
			"2 6\r\n" + 
			"7\r\n" + 
			"10\r\n" + 
			"7 10\r\n" + 
			"3\r\n" + 
			"8\r\n" + 
			"3\r\n" + 
			"6\r\n" + 
			"9\r\n" + 
			"2\r\n" + 
			"4\r\n" +
			"";
}//class
