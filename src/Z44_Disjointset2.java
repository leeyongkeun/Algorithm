import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
public class Z44_Disjointset2 {
	
	public static int [] p;
	public static int [] rank;
	
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new StringReader(src));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		p = new int [N];
		rank = new int [N];
		for (int i = 0; i < N; i++) {
			Makeset(i);
		}
		
		if(M == 0) {
			System.out.println(N);
		}else {
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				Union(a,b);
				//Printset();
			}
			
			Set <Integer> set = new HashSet<>();
			for (int i = 0; i < p.length; i++) {
				set.add(Findset(i));
			}
			
			System.out.println(set.size());
		}
		
	}// main 
	
	// 멤버 x를 포함하는 새로운 집합을 생성
	// 자기 자신을 부모로 표시
	public static void Makeset(int x) {
		p[x] = x;	// 자기 자신을 부모로 표시 (대표자)
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
		// 서로 다른 집합일때만 합쳐야한다.
		// 같은 집합일 경우 stack over flow Error 발생
		if (Findset(x)!=Findset(y)) {
			Link(Findset(x),Findset(y));
			//p[Findset(x)] = Findset(y);
			
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
	
	public static void Printset() {
		System.out.print("index : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", i);
			// 배열의 인덱스를 출력
		}
		System.out.println();
		System.out.print("Parent :");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ", p[i]);
		}
		System.out.println();
		System.out.print("Rank :  ");
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%2d ", rank[i]);
		}
		
		System.out.println("\n");
//		Arrays.sort(rank);
//		System.out.println(rank[rank.length-1]);
		
	}
	public static String src ="10 9\r\n" + 
			"1 2\r\n" + 
			"1 3\r\n" + 
			"1 4\r\n" + 
			"1 5\r\n" + 
			"1 6\r\n" + 
			"1 7\r\n" + 
			"1 8\r\n" + 
			"1 9\r\n" + 
			"1 10";
}// class
