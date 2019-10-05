/**
 * 비선형자료구조 에서 모든 정점을 빠짐없이 순회 하는 방법 중 하나
 * BFS 너비우선 탐색
 */
public class Z28_BFS {

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
		int [] queue = new int [100];//부족하지 않게 스택의 크기를 지정
		int front = -1; 
		int rear = -1;
		
		// 각 정점의 방문여부
		boolean [] visited = new boolean [8];  // 0번 정점은 안씀 

		// 시작 정점을 지정, 큐에 넣기, 방문표시
		int v = 1;
		queue[++rear] = v;
		visited[v] = true;
		
		while(front!=rear) { // 큐가 비어있을때 까지 반복
			
			// 큐에서 꺼내기 ,  방문 여부 
						
			v = queue[++front];
			System.out.print(v +" "); // 방문해서 출력하기

			// 인접한 정점 중 방문하지 않은 정점을 큐에 넣고 방문표시 

			for (int i = 0; i < graph[v].length; i++) { // 인접한 정점에 대해
				if(!visited[graph[v][i]]) { //  방문하지 않은 정점
					queue[++rear] = graph[v][i];
					visited[graph[v][i]] = true;
				// 1 2 3 4 5 7 6 
				}
			}
		
			
		}// while
		
	}// main

}// class












