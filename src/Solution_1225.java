import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_1225 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new StringReader(src));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int tc = 1; tc <= 10; tc++) {
			
			tc = Integer.parseInt(br.readLine());
			String [] str = br.readLine().trim().split(" ");
			
			int [] queue = new int [100000];
			int front = -1;
			int rear = -1;
			
			for (int i = 0; i < 8; i++) {
				queue[++rear] = Integer.parseInt(str[i]);
			}
			
			outer:while(queue[front+1]>0) {
				
//				System.out.print(queue[i] + " ");
				for (int i = 1; i <= 5; i++) {
					if(queue[rear]>0) {
						queue[++rear] = queue[++front]-i;
					}else {
						queue[rear]=0;
						break outer;
					}
					
				} 
				
				
			}//while
			
			System.out.print("#" +tc+" ");
			
			for (int i = 7; i >= 0 ; i--) {
				System.out.print(queue[rear-i]+" ");
			}
			System.out.println();
			
			
		}// tc
		
	}//main
	public static String src = "1\r\n" + 
			"9550 9556 9550 9553 9558 9551 9551 9551 \r\n" + 
			"2\r\n" + 
			"2419 2418 2423 2415 2422 2419 2420 2415 \r\n" + 
			"3\r\n" + 
			"7834 7840 7840 7835 7841 7835 7835 7838 \r\n" + 
			"4\r\n" + 
			"4088 4087 4090 4089 4093 4085 4090 4084 \r\n" + 
			"5\r\n" + 
			"2945 2946 2950 2948 2942 2943 2948 2947 \r\n" + 
			"6\r\n" + 
			"670 667 669 671 670 670 668 671 \r\n" + 
			"7\r\n" + 
			"8869 8869 8873 8875 8870 8872 8871 8873 \r\n" + 
			"8\r\n" + 
			"1709 1707 1712 1712 1714 1710 1706 1712 \r\n" + 
			"9\r\n" + 
			"10239 10248 10242 10240 10242 10242 10245 10235 \r\n" + 
			"10\r\n" + 
			"6580 6579 6574 6580 6583 6580 6577 6581 \r\n" + 
			"";
}//class
