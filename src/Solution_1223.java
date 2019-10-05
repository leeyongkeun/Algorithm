import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution_1223 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		int TC = 10;
		String str1 = "";
		for (int tc = 1; tc <= TC; tc++) {
			
			int N = Integer.parseInt(br.readLine());
			str1 = br.readLine();
			
			char [] stack1 = new char [str1.length()];
			int top =-1;
			char [] stack2 = new char [str1.length()]; // 배열에 저장
			
			int top2 =-1;
			int [] stack3 = new int [str1.length()]; // 계산 
			
			for (int i = 0; i < str1.length(); i++) {
				char c =str1.charAt(i);
				switch (c) {
				case '(': //무조건 넣는다
					stack1[++top]= c;
					break;
					
				case '*':
				case '/':
					
					while(top >=0 && (stack1[top]=='*' || stack1[top]=='/')) {

						//System.out.print(stack1[top]+ " ");
						stack2[++top2] = stack1[top--];
					}
						
					stack1[++top] = c;
					break;
				case '+':
				case '-':
					while (top>=0 && stack1[top]!='(') {
						
						//System.out.print(stack1[top]+ " ");
						stack2[++top2] = stack1[top--];
					}
					stack1[++top] = c;
					break;

				case ')':
					
					while (top>=0 && stack1[top]!='(') {
						
						//System.out.print(stack1[top]+ " ");
						stack2[++top2] = stack1[top--];
					}
					if(stack1[top] == '(') {
						top--;
					}
					break;
				default:
					//System.out.print(str1.charAt(i)+" ");
					stack2[++top2]=c;
					break;
					
					
					
				}//switch
				
			}//for
			while(top>-1) {
				stack2[++top2]=stack1[top--];
				
			}
			
		
			
//			for (int i = 0; i < stack2.length; i++) {
//				System.out.print(stack2[i] +" ");
//			}
			

			top = -1;
			for (int i = 0; i <= top2; i++) {
				char c1 = stack2[i];
				int num1, num2;
				switch (c1) {
				case '+':
					num2 = stack3[top--];
					num1 = stack3[top--];
					stack3[++top]=num1 + num2;
					
					break;
				case '-':
					num2 = stack3[top--];
					num1 = stack3[top--];
					stack3[++top]=num1 - num2;
					
					break;
				case '*':
					
					num2 = stack3[top--];
					num1 = stack3[top--];
					stack3[++top]=num1 * num2;
					break;
				case '/':
					
					num2 = stack3[top--];
					num1 = stack3[top--];
					stack3[++top]=num1 / num2;
					break;
					
				default: // 숫자일 경우
					stack3[++top] = c1-'0';
					
					break;
				}
				
				
				
			}//for
			
			
			System.out.println("#"+tc+" "+stack3[top--]);
			
			
		}// tc
		
		
	}//main

	public static String src = "101\r\n" + 
			"9+5*2+1+3*3*7*6*9*1*7+1+8*6+6*1*1*5*2*4*7+4*3*8*2*6+7*8*4*5+3+7+2+6+5+1+7+6+7*3*6+2+6+6*2+4+2*2+4*9*3\r\n" + 
			"79\r\n" + 
			"4+4*3*4*9+2+7*4*7+7*7*9*5*2+8*8+2*6*7*3*7*9*3*4+8+8*9+3+9+6+9+4*1+6*3+5+1+7+5*1\r\n" + 
			"113\r\n" + 
			"2+3+9*9+8+2*1+3*2*3*1+3*3+1+2+3*6*2*7*4+9+1+4+6+9*9*5+7+8+6+3+9*2+1+7+4+3+9*3*1+4*4+4*3*1+9*3+9*5*1*7*8+2+8+8*7+9\r\n" + 
			"89\r\n" + 
			"4*9+1+1*8+8*9*7+1*4*5*2*5+8*3*5+5+2*4+2+8+6*2*2+9+3*1*2+2*5+9*2*3*9+6+7*9+9*4+7+6+6*6+3+8\r\n" + 
			"77\r\n" + 
			"5+4+9+9*9*2+6*6*5+9+3*5+5*7*8*3*7*1*9*9+8+3+8*9*6+2*9*3+6*5+6*7*2+5+5*3+4*6+7\r\n" + 
			"119\r\n" + 
			"5+7+1+6+3+6*7+7+5*5*3*5*6*9+5*9*5*9+8+8+5*1*6*2+3+2+8+6+2+2*3*4+5*8*3*6*2*9+1*7*7*4*2+2*5+6+7+2*7*4+9*6*4*3*1*3*5+3*7+8\r\n" + 
			"115\r\n" + 
			"8*6+3*9*8*7*6*3+5*7*6*6+3*5+2*4*9*3+5+2+1*4*1*7+6*8+9+3+2+8*3+8*2+6*9+2*2*7+8*1*2+9*3+1+5*5*8+4*1*2*4*2*6*3*8*8+4+1\r\n" + 
			"91\r\n" + 
			"5*8*4+5*7+9*2+6+5*7+1*7*9+8+6*1*2+7+5*9*6*3+4*8*9*6*1*3+7*1+2+5+1*4*9+6*4+7*1*2*4*2+3+3*4+9\r\n" + 
			"107\r\n" + 
			"7*1+7+5+3*7*1*7+8*3*8+7+3*2*6*2+3+6*4+3+8+9*4+1+5*7*8+9+1+2+5+6*7+4*5*2+4+8*4+7+9*1*3*1+1*2*8+3+2+9*1*5*9+7\r\n" + 
			"109\r\n" + 
			"1+1+7+3*2+1+3*7*8+9*6+1+8*3*7+8*5*7*7+4*3*7*4+7+3+2*2+7+8*8*6+6*6*7+7*1*5*7+3+1*5+1*8*4+9+6+7*5+3+1*8*8*9+4+7\r\n" + 
			"";
	
	
}//class
