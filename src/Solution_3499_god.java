import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3499_god {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.valueOf(br.readLine());
        
        for(int testcase=1; testcase<=loop; testcase++) {
            int N = Integer.valueOf(br.readLine());
            String str[] = br.readLine().split(" ");
            
            System.out.print("#" + testcase + " ");
            if(str.length%2 == 0) {
                for(int i=0; i<str.length/2; i++) {
                    System.out.print(str[i] + " ");
                    System.out.print(str[i+str.length/2] + " ");
                }
                System.out.println();
            }
            
            else {
                for(int i=0; i<str.length/2; i++) {
                    System.out.print(str[i] + " ");
                    System.out.print(str[i+str.length/2+1] + " ");
                }
                System.out.println(str[str.length/2]);
            }
        }
    }
}