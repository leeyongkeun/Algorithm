
public class Z27_MyChu {

	public static int[] que = new int [100];
	public static int front = -1;
	public static int rear = -1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chu = 20;
		int num  = 1;
		int[] cnt = {1,1,1,1,1,1,1,1,1,1,1,1,1,1}; // 각 index 사람이 받을 마이쮸 개수
		
		while(true) {
			
			// 새로운 사람이 줄을 선다 (큐에 넣기), num 을 증가해주기;
			que[++rear] = num++;
			print(num-1 + "진입");
			
			// 줄에서 나와서 마이쮸 받기 (큐에서 빼기), 다음 받을 마이쮸 개수 증가 시키기;
			
			int x = que[++front]; //  줄에서 나온 사람
			chu -= cnt[x]; // 마이쮸 받기 
			print(x + " 나옴 : "+ cnt[x] +" 개 받음, 남은 마이쮸 : " + chu);
			if(chu <= 0 ) {
				System.out.println("20번째 는 " +x +"가 받음 ");
				break;
			}
			cnt [x]++; // 다음 받을 마이쮸 갯수 증가 시키기 
			
			// 마이쮸 받은 사람은 다시 줄 서기 ( 큐에 넣기 )
			
			que[++rear] = x;
			print(x + "진입 : ");
			
		}
		
		
	}// main
	
	public static void print(String str) {
		System.out.print(str+ " [");
		for (int i = front+1 ; i < rear; i++) {
			System.out.print(que[i]+ " ");
			
		}
		System.out.println("]");
		System.out.println();
	}
}// class
