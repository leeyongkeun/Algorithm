
/**
 *  선형 자료 구조 : 배열, 리스트, 
 *  Queue 큐 : FIFO 선입선출
 *  	1. API 사용
 *  	2. 메서드를 작성
 *  	3. 배열 인덱스 관리 
 *  		- front , rear 변수 두개가 필요하다 
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Z25_원형Queue {

	public static void main(String[] args) {

		//1 . API 사용
		Stack stack = new Stack(); // 클래스임, 객체를 만들 수 있다
		Queue que = new LinkedList(); // 인터페이스이다 , 객체 생성 불가 
		System.out.println("====API 사용======");
		
		que.offer(6); // 삽입
		que.offer(7); // 삽입
		que.offer(8); // 삽입
		

		System.out.println(que.poll()); // 삭제
		System.out.println(que.poll()); // 삭제
		System.out.println(que.poll()); // 삭제
		
		//2. 메서드 작성
		System.out.println("====메서드 작성======");
		enQueue(6);
		enQueue(7);
		enQueue(8);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		//3. 배열 인덱스 관리
		System.out.println("====배열 인덱스 관리======");
		int [] queue = new int [5];
		int front = -1;
		int rear = -1;
		
		queue[++rear] = 6;
		queue[++rear] = 7;
		queue[++rear] = 8;
		System.out.println(queue[++front]);
		System.out.println(queue[++front]);
		System.out.println(queue[++front]);
		
	
		
	}//main

	public static int[] queue = new int[5]; // 부족하지 않게 선언 
	
	public static int front = -1;
	public static int rear = -1;
	
	public static boolean isFull() {
		return rear == queue.length -1;
	}
	private static boolean isEmpty() {
		return front == rear;
	}
	
	public static void enQueue(int item) {
		if(isFull()) {
			System.out.println("overflow error");
		}
		queue[++rear] = item;
	}
	public static int deQueue() {
		if(isEmpty()) { // 공백 큐인가?
			System.out.println("underflow error");
			return -1; 
		}
		else {
			++front;
			if (front == queue.length) {
				front = 0;
			}
			return queue[front];
		}
	}
	

	
}// class













