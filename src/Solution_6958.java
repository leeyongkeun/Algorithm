import java.util.Arrays;
import java.util.Scanner;

public class Solution_6958 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(src);
		Scanner sc = new Scanner(System.in);
		
		int TC = sc.nextInt();
		
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int [] score = new int [N];
			int max = 0; int maxindex = 0;
			int cnt = 0;
			
			System.out.print("#"+tc+" ");
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					score[i] += sc.nextInt();
				}
			}
			for (int i = 0; i < score.length; i++) {
				if(max < score[i]) {
					max = score[i];
					maxindex = i;
				}
			}
			for (int i = 0; i < score.length; i++) {
				if(max ==score[i]) cnt++;
			}
			//System.out.println(Arrays.toString(score));
			System.out.println(cnt +" "+ score[maxindex]);
		}//tc
		
	}//main
	public static String src = "4\r\n" + 
			"3 5\r\n" + 
			"1 0 0 1 0\r\n" + 
			"1 1 1 0 0\r\n" + 
			"0 0 0 1 0\r\n" + 
			"4 4\r\n" + 
			"1 1 1 1\r\n" + 
			"1 1 1 1\r\n" + 
			"1 1 1 1\r\n" + 
			"1 1 1 1\r\n" + 
			"4 4\r\n" + 
			"0 1 1 1\r\n" + 
			"1 0 1 1\r\n" + 
			"1 1 0 1\r\n" + 
			"1 1 1 0\r\n" + 
			"1 1\r\n" + 
			"0\r\n" + 
			"";
	
}
