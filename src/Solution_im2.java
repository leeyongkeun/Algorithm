import java.util.Scanner;

public class Solution_im2 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(src);
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		for (int tc = 1; tc <= TC; tc++) {
			int N = sc.nextInt();
			int [] arr = new int [N+1];  //  정답
			int [] brr = new int [N+1];  //  초기 상태
			int cnt=0; int result = 0;
			System.out.print("#"+tc+" ");
			for (int i = 1; i <= N; i++) {
				arr[i] = sc.nextInt();
			}
			for (int i = 1; i <= N; i++) {
				if(arr[i]==brr[i]) {
					//System.out.println(Arrays.toString(brr)+"/"+(i+1)+"번방");
					continue;
				}
				else {
					cnt++;
					for (int j = 1; j <= N/i ; j++) {
						if(brr[i*j]==0) brr[i*j]=1;
						else if(brr[i*j]==1) brr[i*j]=0;
					}
					//System.out.println(Arrays.toString(brr)+" : "+"cnt : "+ cnt+"///"+(i+1)+"번방");
				}
				for (int x = 1; x <= N; x++) {
					if(arr[x]==brr[x]) {
						result++;
					}
				}
				if(result==N) break;
			}
			System.out.println(cnt);
		}//tc
	}//main

	public static String src = "3\r\n" + 
			"6\r\n" + 
			"0 1 1 0 0 1\r\n" + 
			"7\r\n" + 
			"1 1 1 1 1 1 1\r\n" + 
			"8\r\n" + 
			"1 0 0 1 0 1 0 1\r\n" + 
			"";
}//class
