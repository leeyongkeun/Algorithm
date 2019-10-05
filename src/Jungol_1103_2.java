import java.util.Scanner;

public class Jungol_1103_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(src);
		//Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int N = sc.nextInt();
		int [][] arr = new int[N+1][2];
		int sum = 0, left = 0, right = 0;
		for (int i = 0; i <= N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0] == arr[arr.length-1][0]) {
				sum = Math.abs(arr[i][1] - arr[arr.length-1][1]);
			}else {
				if(arr[i][0]==1) {
					sum = arr[i][1] + arr[arr.length-1][1] + y;
				}
				if(arr[i][0]==2) {
					sum = y - arr[i][1] + arr[arr.length-1][1];
				}
				if(arr[i][0]==3) {
					sum = arr[i][1] + arr[arr.length-1][1] + y;
				}
				if(arr[i][0]==4) {
					sum = y - arr[i][1] + x - arr[arr.length-1][1];
				}
				
			}
			
			
		}
		System.out.println(sum);
	}
	public static String src ="10 5\r\n" + 
			"3\r\n" + 
			"1 4\r\n" + 
			"3 2\r\n" + 
			"2 8\r\n" + 
			"2 3";
}
