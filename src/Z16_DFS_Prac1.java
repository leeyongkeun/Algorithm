/**
 * 
 * 비선형 자료 구조에서 그래프 문제에서 모든 정점을 빠짐없이 순회하는 방법
 * DFS 깊이 우선 탐색 : 스택의 자료 구조가 필요하다
 * BFS 너비 우선 탐색 : 큐 자료 구조가 필요하다 
 * 
 *
 */



public class Z16_DFS_Prac1 {

	public static void main(String[] args) {

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
		/**2차원 배열 안에 i의 순서는 번호의 순서이고 내부 배열의 순서는
		 해당 정점에 인접한 정점을 모두 표시 
		*/
		
		int [] stack = new int [20];
		// 스택의 크기를 설정해 준다 부족하지 않게 스택의 크기를 지정해 준다
		int top = -1; // 스택 내부에 index를 관리할 변수를 지정한다
		// 처음에는 -1이 기준이다
		boolean [] visited = new boolean [8];
		// 각  정점의 방문 여부
		
		// 시작 정점을 하나 지정하여, 시작 정점을 방문하여 , 스택에 시작정점을
		// 넣고 반복을 시작한다.
		int target=1; // 시작 정점의 타겟을 지정한다 이때 1A를 의미 한다
		visited[target] = true;
		// 시작 정점의 타겟을 선언과 동시에 해당 지점을 방문했다는 true 표시를 한다
		System.out.println(target+ " "); // 방문하면 정점을 출력
		
		stack[++top] = target; // 마지막 갈림길을 스택에 저장한다.
		//top을 먼저 증가 시킨다음에 스택에 넣어준다
		// target값을 스택에 넣어주는데 top을 먼저 증가 시키면서 넣어줌
		
		while(top>-1) {
			int nextTarget = -1;// 다음 정점을 저장할 변수를 미리 선언
			// 플레그 변수 역할도 한다.
			for (int i = 0; i < graph.length; i++) {
				//처음 이차원 배열에 저장해둔 그래프를 반복문 돌려준다
				if(!visited[graph[target][i]]) {
					nextTarget = graph[target][i];
					// 반복문들 돌려서 배열 내부에 있는 숫자를 확인
					// 방문한 지역이 아니면 if문을 실행한다
					// 선택된 타겟 지점이 새로운 지점이면 다음 타겟으로 설정한다.
					stack[++top] = nextTarget;
					// 다음 타켓 정점을 스택에도 넣어준다
					// 이때 스택에 넣어줌과 동시에 방문했다는 true 표시도 한다
					visited[nextTarget]= true;
					System.out.print(nextTarget + " ");
					// 이제 다음 타겟은 처음 타겟이 된다
					target=nextTarget;
					break;
				}
			}
			if(nextTarget == -1) {
				
				target = stack[top--];
				// 인접한 정점중에 방문하지 않은 정점이 없다 .
			
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}//main
	
	

}//class
