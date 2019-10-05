import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Solution_4366 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new StringReader(src));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String sys2 = br.readLine();
			String sys3 = br.readLine();
			String temp;
			int result = -1;
			System.out.print("#"+tc+" ");
			for (int i = 0; i < sys2.length(); i++) {

				int digit2 = sys2.charAt(i)-'0';
				temp = sys2.substring(0,i) + (1-digit2) + sys2.substring(i+1);
				int bNum = Integer.valueOf(temp, 2);
				
				for (int j = 0; j < sys3.length(); j++) {
					int digit3 = sys3.charAt(j)-'0';
					
					for (int k = 0; k < 3; k++) {
						if(digit3==k) continue;
						temp = sys3.substring(0,j) + k + sys3.substring(j+1);
						int tNum = Integer.valueOf(temp, 3);
						if(bNum == tNum) {
							result = bNum;
							break;
						}
						
					}//sys3.length
				}
			}//sys2.length
			System.out.println(result);
		}//tc
	}//main
	public static String src="1\r\n" + 
			"1010\r\n" + 
			"212";
}//class
