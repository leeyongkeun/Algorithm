import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
 
public class Solution_2805 {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new StringReader(src));
        int TC = Integer.parseInt(br.readLine()); 
        String str;
         
        for (int tc = 1; tc <= TC; tc++) {
     
            int N = Integer.parseInt(br.readLine());  
            int right = N/2;
            int left = N/2;
            int sum = 0;
             
            for (int i = 0 ; i < N/2; i++) {
                str = br.readLine().trim();
                for (int j = left; j <= right; j++) {
                    sum += str.charAt(j)-'0';
                }
                left--;
                right++;
            }
             
            for (int i = N/2; i <N; i++) {
                str = br.readLine().trim();
                for (int j = left ; j <= right; j++) {
                    sum += str.charAt(j)-'0';
                }
                left++;
                right--;
            }
            System.out.println("#" + tc+ " "+ sum);
        }
         
    }//main
 
}//class
