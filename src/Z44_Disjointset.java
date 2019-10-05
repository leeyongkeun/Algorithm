/**
 *  서로 소 집합 = 상호 배타 집합 = disjointset
 *  각 원소가 같은 집합인지 다른 집합인지 쉽게 구분할 수 있다
 *  연결리스트
 *  트리 - 연결리스트 , 배열
 *
 */
public class Z44_Disjointset {
	
	public static int [] p = new int [10];
	public static int [] rank = new int [10];
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			Makeset(i);
		}
		Printset();
		Union(0,1); Printset();
		Union(2,3); Printset();
		Union(0,3); Printset();
		Union(4,5); Printset();
		Union(6,7); Printset();
		Union(4,7); Printset();
		Union(3,5); Printset();
		Union(1,8); Printset();
		Union(0,9); Printset();
		
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
		
	}
	
}// class
