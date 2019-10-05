import java.util.Scanner;

public class Solution_1289 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for (int i = 1; i <= TC; i++) {
			
			String str = sc.next();
			
			int cnt = 0; //변경횟수
			char c = '0'; // 초기 비교할 글자
			
			
			for (int j = 0; j < str.length(); j++) {
				
			
				if (c != str.charAt(j))
					cnt++;
					c = str.charAt(j);
			}
			
			System.out.println("#"+i+" "+cnt);
			
			
			
			
			
			
		}// end of for testcase
		
		
	}

}
