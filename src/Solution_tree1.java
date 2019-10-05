/**
 * 
 *  트리 : 비선형 자료구조 (그래프 일부)
 *  1. 저장
 *  2. 순회 (DFS, BFS, 전위, 중위, 후위)
 *  문제에서 상세하게 설명해 줘야한다
 *  이진트리가 완전인지 포화인지, 루트 노트의 번호 , 트리의 크기, 높이(레벨)
 *  , 최대 정점의 개수, 정점번호 등
 *	
 * 	연습문제 2: 레벨 4의 이진트리 , 루트의 정점은 1
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution_tree1 {

	public static int[] tree = new int [1<<5]; //1<<13 = 2^13개 // 0번 정점은 안씀
	public static void main(String[] args) throws NumberFormatException, IOException {
		//저장방법 : 배열로 저장, 크기 : 정점 13개, 부족하지 않도록 지정 > 2^13
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(br.readLine()); // 입력될 정점 쌍의 개수 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// 입력

		
		while(st.hasMoreTokens()) { // 정점 쌍이 13개 
			int parent = Integer.parseInt(st.nextToken()); // 간선의 시작점 부모
			int child = Integer.parseInt(st.nextToken()); // 간선의 끝 자식
			int i;
			// parent 부모 정점이 tree 배열에 존재하는지 검색
			for (i = 0; i < tree.length; i++) {
				if (parent==tree[i]) break; // 위치 찾기, 순차 검색
			}
			// 검색한 index 에 child 정점을 자식으로 저장,
			// 왼쪽이 없으면 왼쪽자식으로 채우고
			// 왼쪽이 있으면 오른쪽 자식으로 저장
			
			if(tree[i*2] == 0) {// 왼쪽자식이 없으면 왼쪽 자식으로 등록
				tree[i*2] = child;
			}else {// 왼쪽 자식이 있으면, 오른쪽 자식으로 등록
				tree[i*2+1] = child;
			}
			
		}
		System.out.println("\n==입력 값==");
		
		for (int i = 0; i < tree.length; i++) {
			if(tree[i]!=0) {
				System.out.print(tree[i]+ " ");
			}
		}
		// 순회
		System.out.println("\n==전위 순회==");
		preorder(1); // 전위 순회
		System.out.println("\n==중위 순회==");
		inorder(1); // 중위 순회
		System.out.println("\n==후위 순회==");
		postorder(1); // 후위 순회
		

	}//main
	public static String src ="13\r\n" + 
			"1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	public static void preorder(int index) {
		
		System.out.print(tree[index]+ " ") ; // 부모
		if(index*2 < tree.length && tree[index*2] !=0) {
			
			preorder(index*2); // 왼쪽 자식
			
		}if(index*2+1 < tree.length && tree[index*2+1] !=0) {
			
			preorder(index*2+1); // 왼쪽 자식
			
		}
		
	}
	public static void inorder(int index) {
		
		if(index*2 < tree.length && tree[index*2] !=0) {
			
			inorder(index*2); // 왼쪽 자식
			
		}
		System.out.print(tree[index]+ " ") ; // 부모
		
		if(index*2+1 < tree.length && tree[index*2+1] !=0) {
			
			inorder(index*2+1); // 왼쪽 자식
			
		}
		
	}
	public static void postorder(int index) {
		
		if(index*2 < tree.length && tree[index*2] !=0) {
			
			preorder(index*2); // 왼쪽 자식
			
		}if(index*2+1 < tree.length && tree[index*2+1] !=0) {
			
			preorder(index*2+1); // 왼쪽 자식
			
		}
		System.out.print(tree[index]+ " ") ; // 부모
		
	}
}//class

















