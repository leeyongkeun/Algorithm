import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1986 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			int N = Integer.parseInt(br.readLine());
			int index = 1;
			int result = 0;
			System.out.print("#" +tc+" ");
			if(N%2==0) {
				result = -(N/2);
				System.out.println(result);
			}else {
				result = ++N/2;
				System.out.println(result);
			}
		}//tc
	}// main
	public static String src = "10\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"3\r\n" + 
			"4\r\n" + 
			"5\r\n" + 
			"6\r\n" + 
			"7\r\n" + 
			"8\r\n" + 
			"9\r\n" + 
			"10";
}//class
