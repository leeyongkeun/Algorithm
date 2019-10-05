
public class Z18_Calculator4 {

	
	public static void main(String[] args) {
		
		String str = "( 6 + 5 * ( 2 - 8 ) / 2 )";
		String[] strr=str.split(" ");
		char [] stack = new char [strr.length];
		int [] stack2;
		int top = -1;
		
		for (int i = 0; i < strr.length; i++) {
			 char c =strr[i].charAt(0);
			 switch (c) {
			case '(': // 가장 우선순위가 높기 때문에 넣어준다 스택에 추가
				stack[++top] = c;
				
				break;
			
			case '*':
			case '/':
				while(top>=0 && (stack[top]=='*' || stack[top]=='/')) {
					
					System.out.print(stack[top--]+ " ");
				}
				stack[++top] = c;
				break;
				
			case '+':
			case '-':
				while (top>=0 && stack[top]!='(') {
					System.out.print(stack[top--]+" ");
				}
				stack[++top]=c;
				
				
				break;
			case ')': 
				while(top>=0 && stack[top]!='(') {
					System.out.print(stack[top--]+ " ");
					
				}
				if (stack[top] == '(') { // () 라면 top 감소
					top--;
				}
				break;
				
				
			default:
				System.out.print(strr[i]+" ");
				
				break;
			}//switch
		}// for
		
		
		
	}//main
}//class
