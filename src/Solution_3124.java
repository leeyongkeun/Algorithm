import java.util.Arrays;
import java.util.Scanner;
 
public class Solution_3124 {
 
    public static int [] p;
    public static int [] rank;
     
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(src);
        int TC = sc.nextInt();
        for (int tc = 1; tc <= TC; tc++) {
             
            int V = sc.nextInt();
            int E = sc.nextInt();
             
            Edge[] G = new Edge[E]; // 간선의 갯수를 저장할 배열
            for (int i = 0; i < G.length; i++) {
                G[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
                 
            }
            System.out.print("#"+tc+" ");
            Arrays.sort(G); // 정렬
             
            p = new int[V]; // 부모 정점을 저장할 배열
            rank = new int[V]; // 깊이를 저장할 배열
             
            for (int i = 1; i <= V; i++) {
                Makeset(i); // 각 정점을 각각 하나의 집합으로 생성 
            }
             
            int cnt = 0;
            long MST = 0; // 가중치의 합
            for (int i = 0; i < E; i++) {
                Edge e = G[i]; //작은 가중치의 간선부터 꺼낸다
                int px = Findset(e.a); // 대표자를 찾는다 
                int py = Findset(e.b); // 대표자를 찾는다 
                if (px != py) {
                    // 사이클이 생기지 않을 경우만 합치기
                    Union(px,py);
                    //System.out.println(e.a +"-"+e.b+" "+e.val);
                    MST = MST+ e.val;
                    cnt++;
                    if(cnt == V-1) break;
                }
            }
            System.out.println(MST);
             
        }
    }//main
     
    public static class Edge implements Comparable<Edge>{
        int a; // 정점1
        int b; // 정점2
        int val; // 가중치 
        public Edge(int a, int b, int val) {
            this.a = a;
            this.b = b;
            this.val = val;
        }
        public Edge() {
            super();
        }
        @Override
        public String toString() {
            return "Edge [a=" + a + ", b=" + b + ", val=" + val + "]";
        }
        @Override
        public int compareTo(Edge o) {
            // 가중치를 기준으로 오름차순 정렬
            return this.val - o.val;
        }
         
    }
     
    public static void Makeset(int x) {
        p[x] = x; // 자기 자신을 부모로 표시 (대표자)
        rank[x] = 0;
    }
     
    // 멤버 x를 포함하는 집합을 찾아서 대표자를 리턴
    public static int Findset(int x) {
        if(x == p[x]) return x;
        else {
            p[x] = Findset(p[x]);
            return p[x];
        }
             
    }
     
    // 멤버 x , 멤버 y를 포함하는 두 집합을 통합하는 메서드
       public static void Union(int x, int y) {
            int px = Findset(x);
            int py = Findset(y);
            // 같은 집합일 경우에는 stackoverflow 발생
            if(px != py) {
                Link(px, py);
            }
        }
    // px, py는 각각 x,y의 대표자 
    public static void Link(int px, int py) {
        if(rank[px] > rank[py]) {
            p[py] = px; // 작은쪽을 큰쪾에 붙인다
        }else {
            p[px] = py;
            if(rank[px] == rank[py]) {
                rank[py]++;
            }
        }
         
    }
    public static String src ="1\r\n" + 
            "3 3\r\n" + 
            "1 2 1\r\n" + 
            "2 3 2\r\n" + 
            "1 3 3\r\n" + 
            "";
}
