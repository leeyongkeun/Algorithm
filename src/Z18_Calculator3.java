/**
 * 
 * 계산기 - 중위 표기식의 문자열을 후위 표기식으로 변환하기
 *         ( 6 + 5 * ( 2 - 8 ) / 2) = -9
 *         토큰 isp icp
 *       )      -   -
 *      *, /    2   2
 *		+, _    1   1
 *		(       0   3  무조건 넣음. 스택 안에 있으면 무조건 위로 쌓을 수 있다 
 * 						마지막엔 스택에 남아있는 연산자를 모두 출력해야한다. 
 *         
 */

public class Z18_Calculator3 { // 후위 표기식을 계산한 결과 

	public static void main(String[] args) {
		
		String s = "6 5 2 8 - * 2 / + ";
		String[] srr = s.split(" ");
		
		int [] stack = new int [srr.length] ;
		int top = -1;
		for (int i = 0; i < stack.length; i++) {
			char c =  srr[i].charAt(0); // 숫자는 스택
			//숫자이면 스택에 넣고       연산자이면 숫자 2개 꺼네서 연산 후 계산한 결과를 다시 스택에 넣어줌
			int num1, num2;
			switch (c) {
			case '+':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1 + num2;
				
				break;
			case '-':
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1 - num2;
				
				break;
			case '*':
				
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1 * num2;
				break;
			case '/':
				
				num2 = stack[top--];
				num1 = stack[top--];
				stack[++top]=num1 / num2;
				break;

			default: // 숫자일 경우
				stack[++top] = Integer.parseInt(srr[i]);
				
				break;
			}//switch
			
			
			
			
			
		}//for
		
		System.out.println(stack[top--]);
		
	}//main

}//class
