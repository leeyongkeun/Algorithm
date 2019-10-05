
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Solution_1111 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new StringReader(book));
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for (int tc = 1; tc <= TC; tc++) {
			String str = br.readLine();
			String str1 = str.toLowerCase();
			System.out.print("#"+tc+" ");
			//System.out.println(str1);
			int spaceNum = 0;
			for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i)==' ') {
					spaceNum++;
				}
			}
			//System.out.println(spaceNum);
			String [] book = new String [spaceNum];
			int [] index = new int [spaceNum];
			StringTokenizer st = new StringTokenizer(str1, " ");
			
			for (int i = 0; i < book.length; i++) {
				book[i] = st.nextToken();
				//System.out.print(book[i]+" ");
			}
			//입력
			//System.out.println(Arrays.toString(book));
			Arrays.sort(book);
			//System.out.println(Arrays.toString(book));
			int max = 0; int cnt = 1; int maxIndex = 0;
			for (int i = 0; i < book.length-1; i++) {
				if(book[i].equals(book[i+1])){
					cnt++;
					if(max < cnt ) {
						max = cnt;
						maxIndex = i;
					}
				}else {
					cnt = 1;
				}
			}
			System.out.println(book[maxIndex]);
		}


	}//main
	public static String book1 ="Can Danny and his father outsmart the villainous Mr. Hazell? Danny has a life any boy would love - his home is a gypsy caravan, he's the youngest master car mechanic around, and his best friend is his dad, who never runs out of wonderful stories to tell. But one night Danny discovers a shocking secret that his father has kept hidden for years. "; 
	public static String book2 ="Soon Danny finds himself the mastermind behind the most incredible plot ever attempted against nasty Victor Hazell, a wealthy landowner with a bad attitude. Can they pull it off? If so, Danny will truly be the champion of the world.";
	public static String book3 ="I like cat. I like cat. I like cat. ";
	
	public static String book = "3\r\n" + 
			"Can Danny and his father outsmart the villainous Mr. Hazell? Danny has a life any boy would love - his home is a gypsy caravan, he's the youngest master car mechanic around, and his best friend is his dad, who never runs out of wonderful stories to tell. But one night Danny discovers a shocking secret that his father has kept hidden for years. \r\n" + 
			"Soon Danny finds himself the mastermind behind the most incredible plot ever attempted against nasty Victor Hazell, a wealthy landowner with a bad attitude. Can they pull it off? If so, Danny will truly be the champion of the world. \r\n" + 
			"I like cat. I like cat. I like cat. /r/n" +
			"";
}//class
