
public class MyChuPrac {

	public static int[] que = new int [100];
	public static int front = -1;
	public static int rear = -1;
	
	public static void main(String[] args) {

		int chu = 20;
		int num = 1;
		
		int[] cnt = {1,1,1,1,1,1,1,1,1,1,1,1};
		
		while(true) {
			
			que[++rear] = num++;
			
			int back = que[++front];
			chu = chu - cnt[back];
			
			if(chu <=0) {
				System.out.println("20번째는 "+ back);
				break;
			}
			cnt[back]++;
			que[++rear] = back;
			
		}
		
	}//main

}//class
