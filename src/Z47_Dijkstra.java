import java.util.Arrays;

/**
 * 
 * 다익스트라 - 최단 경로 알고리즘
 * 선택한 특정 정점에서 출발해서 각 정점까지 갈 수 있는 최단 경로를 구하는 알고리즘 
 *
 */
public class Z47_Dijkstra {

	public static void main(String[] args) {
		final int M = Integer.MAX_VALUE;
		int [][] G = {
				{0,3,5,M,M,M},
				{M,0,2,6,M,M},
				{M,1,0,4,6,M},
				{M,M,M,0,2,3},
				{3,M,M,M,0,6},
				{M,M,M,M,M,0}
		};
		
		int s = 0; // 시작 정점
		// 가중치 배열 (최종 목표 ), 시작정점에서 각 정점까지 갈 수 있는 최단거리 배열
		int[] D = G[s];
		// .clone(); 배열을 깊은 복사를하는것이 바람직 하지만, 
		// 시작 정점의 진출정보는 더이상 사용하지 않으므로 깊은 복사를 하지 않아도 됨

		boolean[] visited = new boolean[G.length];
		
		for (int i = 0; i < G.length; i++) {
			//사용하지 않은 정점 중 가중치가 최소인 정점을 찾아서 추가 
			int minindex = -1;
			int min = M;
			for (int j = 0; j < D.length; j++) {
				if(!visited[j] && D[j] < min) {
					minindex = j;
					min = D[j];
				}
			}
			visited[minindex] = true;
			// 선택한 정점을 표시 
			// 선택한 정점을 통해 갈 수 있는 정점의 가중치를 갱신하기 
			for (int j = 0; j < D.length; j++) {
				// 사용하지 않은 정점 && 인접한 정점 && 가중치가 D배열보다 작으면 업데이트
				if(!visited[j] && G[minindex][j]!=M 
						&& D[j] > D[minindex] + G[minindex][j]){
					D[j] = D[minindex] + G[minindex][j];
				}
			}
			System.out.println(Arrays.toString(D));
		}
	}//main

}//class
