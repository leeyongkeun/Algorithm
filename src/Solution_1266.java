import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1266 {
	public static int [] index = {2,3,5,7,11,13,17};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new StringReader(src));
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int masterA = Integer.parseInt(st.nextToken());
			int masterB = Integer.parseInt(st.nextToken());
			System.out.print("#"+tc+" ");
			System.out.printf("%.6f \n",1-(1-(Calc(masterA)*Calc(masterB))));
		}//tc
		
	}//main
	public static double Calc (int num) {
		double result = 0;
		double A;
		for (int i : index) {
			A = 1;
			// nCr 뒷부분을 처리하는 코드 
			for (int j = 0; j < i; j++) {
				A *= ((double)num/100);
			}
			for (int j = 0; j < 18 - i; j++) {
				A *= 1 - ((double)num/100);
			}
			// nCr 을 곱해주는 코드 
			A *= Comb(18, i);
			result += A;
			
		}
		
		return result;
	}
	public static double Comb (int n, int r) {
		double result = 1;
		for (int i = n; i > n-r; i--) {
			result = result * i;
		}
		for (int i = 1; i <= r; i++) {
			result = result / i;
		}
		return result;
	}
	
	public static String src = "10\r\n" + 
			"0 0\r\n" + 
			"80 90\r\n" + 
			"10 20\r\n" + 
			"1 2\r\n" + 
			"100 100\r\n" + 
			"60 23\r\n" + 
			"70 23\r\n" + 
			"80 32\r\n" + 
			"90 32\r\n" + 
			"100 32";
}
