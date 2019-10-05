/**
 *  단순 연결리스트 
 */
public class Z29_SinglyLinkedList {

	public static class Node {
		int data;
		Node link;
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static Node head; // 첫번째 노드
	public static int size; // 노드 개수
	
	
	public static void main(String[] args) {
		
		
	}//main
	
	
	public static void delete (int index) {
		
		if(index < 0 || index >= size) {
			System.out.println("범위를 벗어남 오류");
			return;
		}
		Node preNode = head; // 삽입할 한칸 전 노드를 저장할 변수
		
		for (int i = 0; i < index; i++) {
			preNode = preNode.link;
			
		}
		Node delNode = preNode.link;
		Node nextNode = delNode.link;
		preNode.link = nextNode;
		size--;
		
	}
	
	
	//첫 번째 노드로 삽입하는 메서드 
	public static void addtoFirst(int item) {
		
		Node newNode = new Node(item);
		newNode.link = head;
		head = newNode;
		size++;
		
		
	}
	
	// 인덱스 위치에 노드를 삽입
	public static void add(int index, int item) {
	
		if (index==0) {
			addtoFirst(item);
			return;
		}
		Node newNode = new Node(item);
		// 이전 칸의 노드 정보
		
		Node preNode = head;
		
		for (int i = 0; i < index -1; i++) {
			preNode= preNode.link;
			
		}
		
		// 다음 칸의 노드 정보
		Node nextNode = preNode.link;
		
		preNode.link = newNode; // 이전 노트에 연결된 것을 새로운 노드에 연결시켜준다
		
		newNode.link = nextNode; // 새로운 노드에 연결된 것을 다음 노드에 연결시켜준다 
		
		size++;
		
	}
	
	//마지막 노드로 삽입
	public static void addtoLast (int item) {
		Node newNode = new Node(item);
		if(size==0) {
			head = newNode; // head에다가 newnode를 넣어 
			size++;
			return;
		}
		Node lastNode = head;
		
		while (lastNode.link!=null) {
			lastNode = lastNode.link;
		}
		lastNode.link = newNode;
		
		size++;
	}
}//class











