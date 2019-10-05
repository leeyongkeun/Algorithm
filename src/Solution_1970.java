import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1970 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			int result = 0;
			System.out.println("#"+tc);
			if(N>=50000) {
				result = N/50000;
				System.out.print(result + " ");
				N = N-result*50000;
			}else if(N<50000) {
				System.out.print(0+ " ");
			}if(N>=10000) {
				result = N/10000;
				System.out.print(result+" ");
				N = N-result*10000;
			}else if (N<10000){
				System.out.print(0+ " ");
			}if(N>=5000) {
				result = N/5000;
				System.out.print(result+" ");
				N = N-result*5000;
			}else if(N<5000) {
				System.out.print(0+ " ");
			}if(N>=1000) {
				result = N/1000;
				System.out.print(result+" ");
				N = N-result*1000;
			}else if(N<1000){
				System.out.print(0+ " ");
			}if(N>=500) {
				result = N/500;
				System.out.print(result+" ");
				N = N-result*500;
			}else if(N<500) {
				System.out.print(0+ " ");
			}if(N>=100) {
				result = N/100;
				System.out.print(result+" ");
				N = N-result*100;
			}else if(N<100) {
				System.out.print(0+ " ");
			}if(N>=50) {
				result = N/50;
				System.out.print(result+" ");
				N = N-result*50;
			}else if(N<50){
				System.out.print(0+ " ");
			}if(N>=10) {
				result = N/10;
				System.out.print(result+" ");
				N = N-result*10;
			}else if(N<10) {
				System.out.print(0+ " ");
			}
			System.out.println();
	
			
		}//tc
	}//main
	public static String src="10\r\n" + 
			"32850\r\n" + 
			"160\r\n" + 
			"562413\r\n" + 
			"148951\r\n" + 
			"1000000\r\n" + 
			"16549\r\n" + 
			"32\r\n" + 
			"10\r\n" + 
			"66666\r\n" + 
			"999999";
}
