import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_5432 {

	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			String str = br.readLine();
					
			int sum =0, cnt=0; //sum 조각난 총 갯수 // cnt 쇠 막대기
			for (int i = 0; i < str.length(); i++) {
				// ( ) ( ( ( ( ) ( ) ) ( ( ) ) ( ) ) ) ( ( ) )
				// 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
				if(str.charAt(i)=='(' && str.charAt(i+1)==')') {
					// 레이져를 만났을 때
					sum += cnt;
					i++;
				}else if(str.charAt(i)=='(') { // 쇠 막대기가 추가
					cnt++;
				}else if(str.charAt(i)==')') { // 쇠 막대기가 끝남 
					cnt--;
					sum++;
				}
				
			}//실행 조건문 
			System.out.println("#"+tc+" " +sum);
			
		}//tc
		
		
		
	}//main

	
	public static String src = "2\r\n" + 
			" ()(((()())(())()))(())\r\n" + 
			" (((()(()()))(())()))(()())";
}//class
