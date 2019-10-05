import java.util.Stack;

public class examine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "()()((()))";
		char [] arr = new char[20];
		int top =-1;
		boolean check = true;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)=='(') {
				arr[++top]=str1.charAt(i);
			}else { //')'라면
				if(top ==-1 || arr[top--]!='(') {
					check = false;
					break;
				}
			}
		}//for
		
		if(top!=-1) check = false;
			System.out.println(check ? "올":"땡");
	}//main

}//class
