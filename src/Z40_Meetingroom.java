import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Z40_Meetingroom {
	public static class Meet{
		int stime;
		int etime;
		public Meet(int stime, int etime) {
			super();
			this.stime = stime;
			this.etime = etime;
		}
		@Override
		public String toString() {
			return stime + " : " + etime ;
		}
	}
	
	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(br.readLine());
		Meet[] mrr = new Meet[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			mrr[i] = new Meet(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		// 정렬, 기준 : 종료 시간
		
		Arrays.sort(mrr, new Comparator<Meet>() {
			public int compare(Meet o1, Meet o2) {
				return o1.etime - o2.etime;
				// 종료시간 기준으로 오름차순 정렬 
			}
		});
		
		for (int i = 0; i < mrr.length; i++) {
			System.out.println(mrr[i]+" ");
		}
		
		System.out.println("=========");
		// 빨리 끝나는 회의부터 선택, 선택된 회의와 겹치는 시간은 제거 
		// 회의가 겹치지 않도록, 선택된 회의의 가장 마지막 종료 시간 보다 먼저 시작한 회의는 제거 
		
		int end = mrr[0].etime;
		System.out.println(mrr[0]);
		for (int i = 1; i < mrr.length; i++) {
			if(end <= mrr[i].stime) {
				System.out.println(mrr[i]);
				end = mrr[i].etime;
			}
		}
		
		
	}//main
	public static String src = "10\r\n" + 
			"1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14";
	
}//class
