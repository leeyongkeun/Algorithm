/**
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
public class Z18_Calcultator2 { // 중위 표기식을 후위 표기식으로 바꾸기 

	public static void main(String[] args) {
		String str = "( 6 + 5 * ( 2 - 8 ) / 2 )";
		// 문자열을 쪼갠다
		String[] strr = str.split(" ");
		char [] stack = new char [strr.length];
		int top = -1;
		for (int i = 0; i < strr.length; i++) {
			char c = strr[i].charAt(0);
					switch (c) {
					case '(': //넣을때는 3 무조건 넣는다 
						stack[++top]= c;
						break;
						//"1" strr[0] = "("(o) '('(x)
					case '*': // 2 스택 내에 우선순위가 2 2 라면 빼서 출력 1이나 0이 나올때까지 
					case '/': // 2
						while(top >=0 && (stack[top] == '*' || stack[top] =='/')) {
							
							System.out.print(stack[top--] + " ");
						}
						stack[++top] = c;
						break;
						
					case '+': // 1 스택 내에 맨 위 연산자가 우선선위가 0이면 넣기, 아니면 빼서 출력
					case '-': // 1
						while(top >= 0 && stack[top] != '(') {
							
						System.out.print(stack[top--]);
						}
						stack[++top] = c;
						break;
						
					case ')': // ( 나올때까지 연산자 스택에서 모두 빼서 출력
						while (top >=0 && stack[top]!='('){
							System.out.print(stack[top--] + " ");
							
						}
						if(stack[top] == '(') { // 여는 괄호는 들어있겠지만 , 확인차 
							top--;
						}
						break;
					default:
						System.out.print(strr[i]+" ");
						break;
					}
					
		}//for
		while(top> -1) {
			System.out.print(stack[top--]+" ");
		}
		
		
		
	}//main

}//class
