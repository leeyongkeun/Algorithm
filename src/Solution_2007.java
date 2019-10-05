import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class Solution_2007 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			String[] str = br.readLine().split("");
			System.out.print("#"+tc+" ");
			for (int i = 1; i < str.length; i++) {
				if(str[0].equals(str[i]) && str[1].equals(str[i+1])) {
					System.out.print(i);
					break;
				}
			}
			System.out.println();
		}//tc
	}//main
	public static String src ="10\r\n" + 
			"KOREAKOREAKOREAKOREAKOREAKOREA\r\n" + 
			"SAMSUNGSAMSUNGSAMSUNGSAMSUNGSA\r\n" + 
			"GALAXYGALAXYGALAXYGALAXYGALAXY\r\n" + 
			"EXOEXOEXOEXOEXOEXOEXOEXOEXOEXO\r\n" + 
			"B1A4B1A4B1A4B1A4B1A4B1A4B1A4B1\r\n" + 
			"APINKAPINKAPINKAPINKAPINKAPINK\r\n" + 
			"BLACKPINKBLACKPINKBLACKPINKBLA\r\n" + 
			"TWICETWICETWICETWICETWICETWICE\r\n" + 
			"REDVELVETREDVELVETREDVELVETRED\r\n" + 
			"ABCABCABCABCABCABCABCABCABCABC";
}//class
