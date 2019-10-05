import java.io.BufferedReader;
import java.io.StringReader;

public class Main_2999 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new StringReader(src));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split("");
		int N = str.length;
		int R = 0; int C = 0; int max = 0;
		for (int i = 1; i <= N; i++) {
			R = i; C = N/i;
			if(N%i==0 && R<=C && max < i) max = i;
		}
		System.out.println(max);
		char [][] map = new char [max][max];
		int cnt = 0;
		for (int i = 0; i < max ; i++) {
			for (int j = 0; j < max ; j++) {
				map[i][j] = str[cnt++].charAt(0);
			}
		}
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max; j++) {
				System.out.print(map[j][i]);
			}
		}
	}//main
	public static String src = "boudonuimilcbsai";
}//class
