import java.io.BufferedReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Z39_배열돌리기 {
	public static int [][] A;
	public static int [][] Acopy;
	public static int [] arr; // 순열시 사용할 배열
	public static int min = Integer.MAX_VALUE;
	public static int [][] cycle; // 회전 연산 정보
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken()); //  A배열의 행 
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken()); // 회전 연산개수
				
		A = new int [N+1][M+1]; 
		Acopy = new int [N+1][M+1];
		for (int i = 1; i <=N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for (int j = 1; j <= M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken()); // 1<= A[i][j] <= 100
			}
		}
		cycle = new int [K][3];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cycle[i][0] = Integer.parseInt(st.nextToken());
			cycle[i][1] = Integer.parseInt(st.nextToken());
			cycle[i][2] = Integer.parseInt(st.nextToken());
		}
		arr= new int [K]; // 명령문의 개수만큼 배열크기를 지정
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		Perm(K, 0);
		System.out.println(min);
		
	}
	public static void cycleA(int[] cycle) { //  3 4 2 
		for (int s = cycle[2]; s > 0 ; s--) {
			int size = s*2 +1; // 회전할 사각형의 한변의 길이 
			int r = cycle[0] - s;
			int c = cycle[2] - s;
			
			int temp  =Acopy[r][c];
			for (int i = 1; i < size; i++) { // 하
				Acopy[r][c] = Acopy[r+1][c];
				r++;
			}
			for (int i = 1; i < size; i++) {  // 우
				Acopy[r][c] = Acopy[r][c+1];
				c++;
			}
			for (int i = 1; i < size; i++) {  // 상
				Acopy[r][c] = Acopy[r-1][c];
				r--;
			}
			for (int i = 1; i < size; i++) {  // 좌
				Acopy[r][c] = Acopy[r][c-1];
				c--;
			}
			Acopy[r][c+1] = temp;
		}
	}
	public static String src = "5 6 2\r\n" + 
			"1 2 3 2 5 6\r\n" + 
			"3 8 7 2 1 3\r\n" + 
			"8 2 3 1 4 5\r\n" + 
			"3 4 5 1 1 1\r\n" + 
			"9 3 2 1 4 3\r\n" + 
			"3 4 2\r\n" + 
			"4 2 1";
	
	public static void Perm (int K, int step) {
		if(step ==K ) {
			//System.out.println(Arrays.toString(arr));
			
			// 1. 순열 
			// 2. 회전을 시키기 (원본 배열을 하나 복사해서 사용)
			
			for (int i = 0; i < A.length; i++) {
				Acopy[i] = A[i].clone(); // 1차원 배열의 깊은 복사 
			}
			
			for (int i = 0; i < arr.length; i++) {
				cycleA(cycle[arr[i]]); 
			}
			
			// 3. 각 행의 합 구하기
			// 4. 각 행의 합 중 최소값 구하기 
			
			for (int i = 0; i < Acopy.length; i++) {
				int sum = 0;
				for (int j = 0; j < Acopy.length; j++) {
					sum += Acopy[i][j];
				}
				if(min > sum) min = sum;
			}
			
		}else {
			// swap -> Perm() -> swap
			for (int i = step; i < K; i++) {
				int temp = arr[step];
				arr[step] = arr[i];
				arr[i] = temp;
				Perm(K, step+1);
				temp = arr[step];
				arr[step] = arr[i];
				arr[i] = temp;
				
			}
		}
	}
}
