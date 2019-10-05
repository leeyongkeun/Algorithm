import java.util.Scanner;

/**
 * MST 최소신장트리를 구하는 알고리즘
 * Prim    : 간선의 개수가 많으면 성능이 빠르다, 우선순위 큐를 확용하면 유리함
 * Kruskal : 간선의 개수가 적으면 성능이 빠르다,
 * <p>
 * [input] 정점의 개수 V, 간선의 개수 E, 간선정보(정점1, 정점2, 가중치)
*/

public class Z45_Prim {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(src);
        int V = sc.nextInt();       // 정점개수
        int E = sc.nextInt();       // 간선개수
        int[][] G = new int[V][V];  //인접행렬
        for (int i = 0; i < E; i++) {
            int s = sc.nextInt();   // 시작정점
            int e = sc.nextInt();   // 도착정점
            int val = sc.nextInt(); // 가중치

            // 무향그래프, 진입/진출 모두 저장
            G[s][e] = val;
            G[e][s] = val;
        }

        int[] p = new int[G.length];    // 부모의 index를 저장할 배열
        int[] val = new int[G.length];  // 최소 가중치를 저장할 배열

        boolean[] selected = new boolean[V];
        int r = 0;  // 시작정점
        // 시작 정점에서 자신으로 가는 가중치 0으로 세팅, 시작 정점을 기준으로 갈 수 있는 경로의 가중치 초기화.
        for (int i = 0; i < selected.length; i++) {
            if (G[r][i] > 0) {    //인접함
                val[i] = G[r][i];
                p[i] = r;
            } else {
                val[i] = Integer.MAX_VALUE;
            }
        }

        val[r] = 0; // 자기자신 가중치 0
        p[r] = r;   // 부모 저장
        selected[r] = true; // 시작 정점 선택 표시

        for (int i = 1; i < V; i++) {   // 정점의 개수V, MST 간선의 개수 V-1개, 한 사이클마다 1개의 간선을 선택
            // 선택하지 않은 정점중에서 가중치의 최소 정점을 선택학.
            int minIndex = -1;   // 최소값의 방번호
            int min = Integer.MAX_VALUE;        // 최소값
            for (int j = 0; j < val.length; j++) {
                if (!selected[j] && min > val[j]) {
                    min = val[j];
                    minIndex = j;
                }
            }
            r = minIndex;
            selected[r] = true; // 선택한 정점 표시
            System.out.println(p[r] + "-" + r + " " + val[r]);

            // 선택한 정점을 기준으로 개척된 새로운 간선 가중치를 업데이트(가중치가 작아질 경우만) (부모,가중치)
            for (int j = 0; j < G[r].length; j++) {
                // 선택안한 정점 중, 인접하고, 가중치가 더 작으면 업데이트
                if (!selected[j] && G[r][j] != 0 && val[j] > G[r][j]) {
                    val[j] = G[r][j];   // 가중치 업데이트
                    p[j] = r;   // 부모 업데이트
                }
            }
        }

        // MST 최소 신장트리의 목적 : 전체 가중치의 합을 구하기
        int MST = 0;
        for (int i = 0; i < val.length; i++) {
            MST += val[i];
        }
        System.out.println(MST);

    }
    public static String src ="7 11\r\n" + 
    		"5 3 18\r\n" + 
    		"1 2 21\r\n" + 
    		"2 6 25\r\n" + 
    		"0 2 31\r\n" + 
    		"0 1 32\r\n" + 
    		"3 4 34\r\n" + 
    		"5 4 40\r\n" + 
    		"2 4 46\r\n" + 
    		"0 6 51\r\n" + 
    		"4 6 51\r\n" + 
    		"0 5 60\r\n" + 
    		"";
}
