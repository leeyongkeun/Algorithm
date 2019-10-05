import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public class Z40_회의실배정 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(br.readLine());
		boolean [] index = new boolean[15];
		
		int max = 0; 
		int [][] arr = new int[N][2];
		String [] str;
		int cnt = 0;
		str = br.readLine().split(" ");
		
		for (int i = 0, j = 0 ; i < N; i++) {
			arr[i][0] = Integer.parseInt(str[j++]);
			arr[i][1] = Integer.parseInt(str[j++]);
			
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int i = 0; i <= index.length; i++) {
			index[i] = false;
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				if(!index[i]) {
					index[arr[i][j]] = true;
					index[i++] = true;
					System.out.print(index[i]+ " ");
					cnt++;	
					
				}
				
			}
			
			
		}
		
		
	}//main
	public static String src = "10\r\n" + 
			"1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14";
}
