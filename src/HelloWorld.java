import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str1 = sc.next();
		String str2 = sc.next();
		
		char key1 = '0';
		char key2 = '0';
		int cnt = 0;
		
		
		for(int i=0; i<str1.length(); i++) {
			
			if(key1 != str1.charAt(i)) 
				cnt++;
			
			
			key1 = str1.charAt(i);
			System.out.printf("%d %d %c %c \n", i, cnt, str1.charAt(i), key1);
			
		}
		
		System.out.println("#1"+" "+cnt);
		cnt=0;
		
		for(int i=0; i<str2.length(); i++) {
			
			if(key2 != str2.charAt(i)) 
				cnt++;
			
			
			key2 = str2.charAt(i);
			System.out.printf("%d %d %c %c \n", i, cnt, str2.charAt(i), key2);
			
		}
		System.out.println("#2"+" "+cnt);
		
		
	}

}
