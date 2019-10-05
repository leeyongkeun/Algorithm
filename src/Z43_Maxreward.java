import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 
 * 	최대상금 그리디 빠르다. 답을 찾지 못할 수도 있다. 위험한 설계 방법 이다
 * 		  완전 탐색 은 시간이 많이 걸린다. 반드시 답을 찾을 수 있다
 * 		  백트랙킹 가지치기를 해서 반드시 답을 찾지만, 시간을 절약할 수 있다 
 *
 */
public class Z43_Maxreward {
	private static int max;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new StringReader(src));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			String str = st.nextToken();
			int [] num = new int [str.length()];
			for (int i = 0; i < num.length; i++) {
				num[i] = str.charAt(i) - '0';
			}
			int N = Integer.parseInt(st.nextToken());
			max = 0;
			Find(num , N);
			System.out.println("#"+tc+" "+max);
		}
	}
	
	public static Set <String> set = new HashSet <>();
	
	
	// num : 숫자판 배열, N : 교환횟수
	public static void Find(int [] num, int N) {
		int val = 0; // 숫자판 배열을 숫자 값을 변환 
		for (int i = 0; i < num.length; i++) {
			val = val *10 + num[i];
		}
		//가지치기
		String strr = "" + val + N; // 숫자 , 교환 회수를 붙여서 문자열로 저장 
		if(set.contains(strr)) return;
		else set.add(strr);
		
		if(N == 0){ // 종료 파트 , 최대값이 되었는지를 확인
			if(max < val) max = val;
			
		}else { // 교환을 1번 바꿀 수 있는 모든 경우를 만들어서 재귀 호출
			for (int i = 0; i < num.length; i++) {
				for (int j = i+1; j < num.length; j++) {
					// i 위치와 j 위치를 스왑!
					if(num[i]<=num[j]) {
						
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
						
						Find(num, N-1);
						
						temp = num[i];
						num[i] = num[j];
						num[j] = temp;
						
					}
				}
			}
			
		}
		
	}

	public static String src ="10\r\n" + 
			"123 1\r\n" + 
			"2737 1\r\n" + 
			"757148 1\r\n" + 
			"78466 2\r\n" + 
			"32888 2\r\n" + 
			"777770 5\r\n" + 
			"436659 2\r\n" + 
			"431159 7\r\n" + 
			"112233 3\r\n" + 
			"456789 10";
	
}
