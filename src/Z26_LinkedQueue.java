/**
 * 선형 큐는 메모리를 재활용할 수가 없다 - 낭비이다
 * 삭제 연산시 마다 쉬프트 하면 성능이 떨어진다
 * 
 * 원형 큐는 나머지 연산자 때문에 성능이 떨어진다 - 속도가 느림
 * 삭제 연산보다는 가볍지만 성능이 떨어짐
 * 
 * 연결 큐는 안쓰는 메모리는 없지만
 * 다음 링크를 위한 메모리가 낭비된다 .
 * 삽입 시 마다 노드 객체를 생성하는 시간이 걸린다
 *
 */

public class Z26_LinkedQueue {

	public static class Node { 
		// 데이터와 다음노드의 링크를 알아야
		int data;
		Node link; // 다음 노드 
		
		public Node(int data) {
			this.data = data;
		}
		
	}
	
	public static Node front;
	public static Node rear;
	
	public static boolean isEmpty()  {
		return front == null;
		
	}
	
	public static void enQueue(int item) {
		Node node = new Node(item); // 새로운 노드 객체
		if(isEmpty()) {
			front = node;
			rear = node;
			
		}else {
			rear.link = node;
			rear = node;
		}
		
	}
	
	public static int deQueue () {
		if(isEmpty()) {
			System.out.println("underflow error");
			return -1;
		}else {
			int data = front.data; // 리턴할 데이터
			front = front.link;
			if(isEmpty()) {
				rear = null;
			}
			return data;
		}
	}
	
	public static void main(String[] args) {

		enQueue(6);
		enQueue(7);
		enQueue(8);
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		
	}// main

}//class
