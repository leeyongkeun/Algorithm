import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_3499 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			
			int N = Integer.parseInt(br.readLine());
			
			String [] str = br.readLine().split(" ");
			String [] ans = new String [str.length];
			int cnt = 0;
			int k = 0;
			int j = 0;
			while(cnt!=str.length) {
				if(str.length%2==0) {
					
					for (int i = 0; i < str.length; i++) {
						ans[j++] = str[k];
						cnt++;
						
						if(k<str.length/2) {
							k = k+(str.length/2);
							break;
						}else {
							k = k-(str.length/2)+1;
							break;
						}
					}
					
				}else {
					
					for (int i = 0; i < str.length; i++) {
						ans[j++] = str[k];
						cnt++;
						
						if(k<(str.length/2)+1) {
							k = k+(str.length/2)+1;
							break;
						}else {
							k = k-(str.length/2);
							break;
						}
					}
					
					
				}
			}

			System.out.print("#"+ tc+ " ");
			
			for (int i = 0; i < ans.length; i++) {
				System.out.print(ans[i] +" ");
			}
			
			System.out.println();
			
		}// tc
		
	}//main
	
	
	public static String src = "3\r\n" + 
			"6\r\n" + 
			"A B C D E F\r\n" + 
			"4\r\n" + 
			"JACK QUEEN KING ACE\r\n" + 
			"5\r\n" + 
			"ALAKIR ALEXSTRASZA DR-BOOM LORD-JARAXXUS AVIANA";

}// class
