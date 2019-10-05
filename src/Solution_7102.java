import java.util.Arrays;
import java.util.Scanner;

public class Solution_7102 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(src);
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int cnt = 0, max = 0; int maxindex = 0;
			int [] nrr = new int [N];
			int [] mrr = new int [M];
			int [] index = new int [N+M+1];
			System.out.print("#"+tc+" ");
			for (int i = 0; i < N; i++) {
				nrr[i] = i+1;
			}
			
			for (int i = 0; i < M; i++) {
				mrr[i] = i+1;
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					index[nrr[i]+mrr[j]]++;
				}
			}

			for (int i = 0; i < index.length; i++) {
				if(max < index[i]) {
					max = index[i];
					maxindex = i;
				}
			}
			for (int i = 0; i < index.length; i++) {
				if(max == index[i])
					System.out.print(i+" ");
			}
			System.out.println();
			
			
		}//tc
			
	}//main
	public static String src = "2\r\n" + 
			"6 6\r\n" + 
			"6 4 ";
}//class
