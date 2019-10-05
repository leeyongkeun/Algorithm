import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution_4672_felindrom {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int TC = Integer.parseInt(br.readLine());
        int [] num = {0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55}; 
        //글자수 index에 해당하는 팰린드롬의 개수
        
        //글자수가 1이면 팰린드롬의 개수가 1개 3이면 6개
        
        for (int tc = 1; tc <= TC; tc++) {
        	
            String W = br.readLine(); //단어 W, 1<= W <= 10 , 소문자
            int [] cnt = new int[26]; //소문자의 각 개수를 저장할 배열
            
            for (int i = 0; i < W.length(); i++) {
            	
                cnt[W.charAt(i)-'a']++; //각 소문자 방에 갯수 ++
            }
            int sum = 0; //팰린드롬의 개수의 합
            
            for (int i = 0; i < cnt.length; i++) {
                sum += num[cnt[i]]; //누적
            }
            
            System.out.println("#"+tc+" "+sum);
            
        }//tc
        
    }//main
    
}//class