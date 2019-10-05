import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_8016 {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			long N = Integer.parseInt(br.readLine());
			System.out.print("#"+tc+" ");
			long x = 2*N*N-4*N+3;
			long y = 2*N*N-1;
			System.out.print(x+" ");
			System.out.println(y);
		}//tc
	}//main
	public static String src = "3\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"3";
}//class
