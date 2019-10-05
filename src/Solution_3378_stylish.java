import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_3378_stylish {
	private static int[][] m;
	private static int[][] ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase <= T; testcase++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int p = Integer.parseInt(st.nextToken()); //스타일리쉬 코드 줄 수 1 <= p,q <= 10
			int q = Integer.parseInt(st.nextToken()); //당신의 코드 줄 수
			
			m = new int[p][4]; //위에서부터 누적한 괄호의 개수, [0]:. , [1]:소, [2]:중, [3]:대
			for (int i = 0; i < p; i++) { //스타일리쉬 코드 분석 결과
				String line = br.readLine();
				int index = 0; // . 이 몇개 있는지
				
				while(line.charAt(index)=='.') {
					index++;
				}
				//while문이 끝나면 .이 끝남을 의미, 업데이트된 index는 .의 개수를 의미
				m[i][0] = index; // .의 개수
				
				if(i > 0) { //누적한 괄호의 개수
					m[i][1] = m[i-1][1]; //소괄호의 개수 -> 이전 줄까지 누적된 소괄호의 개수
					m[i][2] = m[i-1][2]; //중
					m[i][3] = m[i-1][3]; //대
				}
				
				for (int j = index; j < line.length(); j++) {
					switch (line.charAt(j)) {
					case '(':	m[i][1]++;	break;
					case ')':	m[i][1]--;	break;
					case '{':	m[i][2]++;	break;
					case '}':	m[i][2]--;	break;
					case '[':	m[i][3]++;	break;
					case ']':	m[i][3]--;	break;
					}
				}
				
			}
//			for (int i = 0; i < m.length; i++) {
//				System.out.println(Arrays.toString(m[i]));
//			}
			
			//당신의 코드
			ans = new int[q][4]; //위에서부터 누적한 괄호의 개수, [0]:. , [1]:소, [2]:중, [3]:대
			for (int i = 0; i < q; i++) {
				String line = br.readLine();
				
				int index = 0; // . 이 몇개 있는지
				
				if(i > 0) { //누적한 괄호의 개수
					ans[i][1] = ans[i-1][1]; //소괄호의 개수 -> 이전 줄까지 누적된 소괄호의 개수
					ans[i][2] = ans[i-1][2]; //중
					ans[i][3] = ans[i-1][3]; //대
				}
				
				for (int j = index; j < line.length(); j++) {
					switch (line.charAt(j)) {
					case '(':	ans[i][1]++;	break;
					case ')':	ans[i][1]--;	break;
					case '{':	ans[i][2]++;	break;
					case '}':	ans[i][2]--;	break;
					case '[':	ans[i][3]++;	break;
					case ']':	ans[i][3]--;	break;
					}
				}
			}
			
			//내 코드를 분석한 배열 ans의 . 의 개수, 열을 사용하지 않는 값 -2 로 초기화하자
			for (int i = 0; i < q; i++) {
				ans[i][0] = -2; //초기화
			}
			for (int R = 1; R <= 20; R++) {
				for (int C = 1; C <= 20; C++) {
					for (int S = 1; S <= 20; S++) {
						if(check(R,C,S)) {	//마스터 코드에서 답이 맞는지 체크
							cal(R,C,S); //구한 R,C,S값을 내 코드에 적용했을 때 각 줄의 답을 구하기
						}
					}
				}
			}
//			for (int i = 0; i < ans.length; i++) {
//				System.out.println(Arrays.toString(ans[i]));
//			}
			System.out.print("#"+testcase+" 0");
			for (int i = 1; i < ans.length; i++) {
				System.out.print(" "+ans[i][0]);
			}
			System.out.println();
			
		}//end of tc
	}//end of main
	/** 내 코드에서 R,C,S 값으로 .의 개수를 구하기 */
	public static void cal(int R, int C, int S) {
		for (int i = 1; i < ans.length; i++) {
			int x = ans[i-1][1]*R + ans[i-1][2]*C + ans[i-1][3]*S; //다음 줄의 .의 개수
			
			if(ans[i][0] == -2) {//처음 들어온 것 이라면
				ans[i][0] = x; //저장
			}else if(ans[i][0] == -1) {
				
			}else if(ans[i][0] != x) { //이전에 답을 구한 적이 있는데, 현재 계산한 결가와 다르면, 해가 여러개
				 ans[i][0] = -1; //유일한 해가 아니다 
				
			}
			
		}
	}
	
	/** 스타일리쉬 코드에서 RCS값이 맞는지 체크 */
	public static boolean check(int R, int C, int S) {
		for (int i = 1; i < m.length; i++) {
			if(m[i][0] != m[i-1][1]*R + m[i-1][2]*C + m[i-1][3]*S) {
				return false; //한번이라도 틀리면 답이 아니다
			}
		}
		
		return true;
	}
}
