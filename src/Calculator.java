import java.io.IOException;
import java.util.Scanner;

/**\
 * 계산기 : 3 + 4 * 2 + 7 * 2  = 25
 */

public class Calculator {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (src);
		int[] stack = new int[10];
		int top = -1;
		
		String[] str = sc.nextLine().split(" ");
		stack[++top]=Integer.parseInt(str[0]);// 첫번째 피연산자
		for (int i = 1; i < str.length; i+=2) { // 연산자, 피연산자
			char op = str[i].charAt(0); //연산자
			int num = Integer.parseInt(str[i+1]); // 숫자 
			if(op =='+') { // 숫자는 스택에 넣기
				stack[++top]= num;
			}else { // *이면 숫자 꺼내서 곱셈연산 후 숫자를 스택에 넣기
				int pre = stack[top--];
				stack[++top]=pre * num;
				
			}
			
		}
		int result =0;
		//덧셈 연산자에 대한 항등원
		for (int i = 0; i <= top; i++) {
			result +=stack[i];
		}
		System.out.println(result);
		
		
	}//main
	
	public static String src ="3 + 4 * 2 + 7 * 2";

}//class
