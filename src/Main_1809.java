import java.util.Scanner;

public class Main_1809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (src);
		int N = sc.nextInt();
		int[] top = new int [N+1]; // 탑에 대한 높이를 나타냄
		int[] sig = new int [N+1]; // 몇번째 탑인지 신호 받는 배열
		int[] stack = new int [N+1]; // 스택
		
		for (int i = 1; i <= N; i++) {
			top[i] = sc.nextInt(); // 입력받은 탑의 높이를 받음
		}
		int edge = 0;
		
		for (int i = N; i >=2 ; i--) {
			if(top[i-1] >= top[i]) {// 왼쪽과 오른쪽의 탑을 비교
				sig[i]= i-1;		// 왼쪽탑>오른쪽 탑 바로 옆을 sig배열에 넣음 
			
			while (edge>=1 && top[stack[edge-1]] <= top[i-1]) {
				// 스택에 있는 탑중에 이전 탑보다 작은게 있으면 스택에서 꺼냄 
				sig[stack[edge-1]] = sig[i];
				edge--;
				}
			}	else { // 왼쪽탑 < 오른쪽 탑 일때 스택에 넣음
			stack[edge++] = i;
			}
		}
		
		for (int j = 1; j <= N; j++) {
			System.out.print(sig[j] + " ");
		}
		
	}//main

	public static String src ="5\r\n" + "6 9 5 7 4\r\n";
}//class
