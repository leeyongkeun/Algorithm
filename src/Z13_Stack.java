import java.util.Stack;

/**
 * 
 * LIFO 후입선출의 선형 자료 구조 1:1 관계 
 * top : 마지막으로 삽입된 데이터의 index를 가리키는 변수
 *
 */
public class Z13_Stack {
	public static void main(String[] args) {
//		Stack<Integer> stack = new Stack<Integer>(); // Collection Framework 내 존재
//		stack.push(5);
//		stack.push(7); // AutoBoxing 기본형타입값을 자동으로 객체로 바꿔준다 
//		stack.push("HI");
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println(stack);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
		
		System.out.println("===메서드 직접 작성 ===");
		push(5);
		push(9);
		push(7);
		System.out.println(pop());
		System.out.println(pop());
		
		//t스택 사용
		// 1. API 사용 : 현업에서
		// 2. 메서드 구현
		// 3. 직접 작성 : 알고리즘
		
		
		System.out.println("=====직접작성 =====");
		int [] ss = new int[5];
		int t = -1;
		System.out.println(t);
		ss[++t]=5;
		ss[++t]=9;
		ss[++t]=7;
		
		System.out.println(ss[t--]);
		System.out.println(ss[t--]);
		System.out.println(ss[t--]);
		if(t==-1) {
			
			System.out.println("비어있음 ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
	public static int[] s = new int[5];//크기는 초기에 지정
	public static int top = -1; // 마지막에삽입된 데이터의  인덱스를 가르킴
	
	//스택이 비어있는 지 여부를 리턴하는 메서드
	public static boolean isEmpty() {
		if(top== -1) return true; else return false;		
	}
	
	
	
	
	
	//스택 꼭대기에 있는 데이터를 반환 삭제하는 메서드 
	public static int pop() {
		if(isEmpty()) {
			//데이터가 없으면?
			System.out.println("스택이 비었어요");
		}
		return s[top--];
	}
	
	
	/** 스택에 값을 삽입하는 메서드 */
	public static void push(int data) {
		if(isFull()) {
			System.out.println("스택이 꽉찼어요 stackOverflow Error");
			
		}
		s[++top] = data;
		
	}
	//스택이 꽉찼는지 여부를 리턴
	public static boolean isFull(){
		if(top == s.length-1) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//class
