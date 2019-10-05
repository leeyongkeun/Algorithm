import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int tst = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) System.out.println("#1 >");
		else if(num1 == num2) System.out.println("#1 =");
		else if(num1 < num2) System.out.println("#1 <");
		
		
		
	}

}
