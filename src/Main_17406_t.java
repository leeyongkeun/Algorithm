import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_17406_t {
	public static int [] arr;
	private static int[][] A;
	private static int[][] Acopy;
	private static int[][] cycle;
	public static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
	// 입력처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // A배열의 행 3~50
		int M = Integer.parseInt(st.nextToken()); // A배열의 열 3~50
		int K = Integer.parseInt(st.nextToken()); // A배열의 회전 연산의 개수 1~6
		
		A = new int [N+1][M+1]; // 0번째 행렬을 안씀
		Acopy = new int [N+1][M+1]; // 0번째 행렬을 안씀
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 1; j <= M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		cycle = new int [K][3]; // 회전 연산의 개수
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cycle[i][0] = Integer.parseInt(st.nextToken());
			cycle[i][1] = Integer.parseInt(st.nextToken());
			cycle[i][2] = Integer.parseInt(st.nextToken());
		}
		arr = new int [K];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		Perm (0,K);
		
	// 배열의 값 : 각 행의 합을 구함, 합들의 최소값
		
	}//main
	
	// 배열 회전시키는 메서드
	public static void cycleA(int [] cycle) { // r, c, s
		for (int s = cycle[2] ; s > 0 ; s--) {
			int size = s*2 + 1 ; // 한 행의 움직일 크기 
			int r = cycle[0] - s;
			int c = cycle[1] - s;
			int temp = Acopy[r][c]; // 백업
			for (int i = 1; i < size; i++) { // 하
				Acopy[r][c] = Acopy[r+1][c];
				r++;
				
			}
			for (int i = 1; i < size; i++) { // 우
				Acopy[r][c] = Acopy[r][c+1];
				c++;
				
			}
			for (int i = 1; i < size; i++) { // 상
				Acopy[r][c] = Acopy[r-1][c];
				r--;
				
			}
			for (int i = 1; i < size; i++) { // 좌
				Acopy[r][c] = Acopy[r][c-1];
				c--;
			}
			Acopy[r][c+1] = temp;
			
		}
	}
	
	public static void Perm (int step, int K) {
		// 순열 - Swap으로 하자 
		if(step == K) { // 종료
			for (int i = 0; i < A.length; i++) { // 회전 작업시 원본이 손상되므로, 배열 복사
				Acopy[i] = A[i].clone();
			}
		
		// 회전
		for (int i = 0; i < arr.length; i++) {
			cycleA(cycle[arr[i]]);
		}
		
		// 배열의 값 : 각 행의 합을 구하고 합들의 최소값
		
		for (int i = 1; i < A.length; i++) {
			int sum = 0;
			for (int j = 1; j < A[i].length; j++) {
				sum += Acopy[i][j];
			}
			if(min > sum) min = sum;
		}
		
		System.out.println(min);
	
		
		
	}else { // 재귀
			// step 이전 칸은 이미 확정된 값, step 이후 칸에 들어있는 숫자 (아직 no사용)
			for (int i = step; i < K; i++) {
				int temp = arr[step];
				arr[step] = arr[i];
				arr[i] = temp;
				
				Perm(step+1, K);
				
				temp = arr[step];
				arr[step] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
	
}//class
