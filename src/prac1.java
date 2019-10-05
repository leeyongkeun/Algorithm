
public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] graph = { // 정점에 연결된 정보를 저장
				{}, // 0번 정점에 인접한 정점 - 0번 정점은 안쓴다 .
				{2,3}, // 1번 정점에 인접한 정점
				{1,4,5}, // 2번 정점에 인접한 정점
				{1,7}, // 3번 정점에 인접한 정점
				{2,6}, // 4번 정점에 인접한 정점
				{2,6}, // 5번 정점에 인접한 정점
				{4,5,7}, // 6번 정점에 인접한 정점
				{3,6}, // 7번 정점에 인접한 정점
			};
		
		int [] queue = new int [100];
		int front = -1;
		int rear = -1;
		boolean [] visited = new boolean [8];
		
		int v = 1;
		queue[++rear] = v;
		visited[v] = true;
		
		
		while(front!=rear) {
			
			v = queue[++front];
			System.out.print(v+ " ");
			
			for (int i = 0; i < graph[v].length; i++) {
				if(!visited[graph[v][i]]) {
					queue[++rear]  = graph[v][i];
					visited[graph[v][i]] = true;
				}
				
			}
			
		}//while
		
	}// main

}// class
