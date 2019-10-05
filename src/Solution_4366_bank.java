import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4366_bank {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			
			String sys2 = br.readLine(); //2진수
			String sys3 = br.readLine(); //3진수
			String temp;
			long result = -1;
			
			for (int i = 0; i < sys2.length(); i++) {
				
				int digit2 = sys2.charAt(i)-'0';
				temp = sys2.substring(0, i) + (1 - digit2) + sys2.substring(i+1);
				long bNum = Long.valueOf(temp, 2);
				
				for (int j = 0; j < sys3.length(); j++) {
					
					int digit3 = sys3.charAt(j)-'0';
					for (int k = 0; k < 3; k++) {
						
						if(digit3 == k) continue; //같은 숫자 빼고 진행
						temp = sys3.substring(0, j) + k + sys3.substring(j+1);
						long tNum = Long.valueOf(temp, 3);
						
						if(bNum == tNum) {//한자리씩 바꿔서 같은 값이 나온 경우, 답을 찾음
							result = bNum;
							break;
						}
					}
					
				}//3진수 반복
				
			}//2진수 반복
			
			System.out.println("#" + tc + " " + result);
			
		}//tc
		
	}//main
	
}//class
