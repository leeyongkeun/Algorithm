import java.io.BufferedReader;
import java.io.StringReader;
import java.util.StringTokenizer;
 
public class Prac {
    public static int[] arr;
    public static int N;
    public static int result;
 
    public static void main(String[] args) throws Exception {
 
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new StringReader(src));
 
        StringTokenizer st;
 
        int TC = Integer.parseInt(br.readLine());
 
        for (int tc = 1; tc <= TC; tc++) {
        	
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            N = Integer.parseInt(st.nextToken());
            arr = new int[str.length()];
            
            System.out.print("#"+tc+" ");
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = str.charAt(i) - '0';
                //System.out.print(arr[i]);
            }
           // System.out.println();
            result = 0;
            Check(0, 0);
            System.out.println(result);
            
        } // tc
        
    }// main
 
    public static void Check(int current, int cnt) {
    	if (cnt == N) {
    		int temp = 0, digit = 1;
    		for (int i = arr.length-1; i >= 0; i--) {
    			temp += arr[i] * digit;
    			digit = digit*10;
    		}
    		if(result < temp) {
    			result = temp;
    		}
    		
    		return;
    	}
    	for (int i = current; i < arr.length; i++) {
    		for (int j = i + 1; j < arr.length; j++) {
    			if (arr[i] <= arr[j]) {
    				Swaping(i, j);
    				Check(i, cnt+1);
    				Swaping(i,j);
    			}
    		}
    	}
    }
    
    public static void Swaping(int a, int b) {
    	int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
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
	
}// class


