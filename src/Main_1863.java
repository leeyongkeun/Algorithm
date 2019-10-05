import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1863 {
	public static ArrayList<Integer>[] list;
	public static int N, M;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new StringReader(src));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N+1];
		
		for (int i = 0; i <= N; i++) {
			list[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].size(); j++) {
				System.out.print(list[i].get(j)+" ");
			}
			System.out.println();
		}
		BFS(1);
		System.out.println();
	}//main
	
	public static void BFS(int node) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean [] visited = new boolean [N+1];
		int v = node;
		queue.offer(v);
		visited[v] = true;
		
		while(!queue.isEmpty()) {
			v = queue.poll();
			System.out.print(v+" ");
			
			for (int i = 0; i < list[v].size(); i++) {
				
				if(!visited[list[v].get(i)]) {
					queue.offer(list[v].get(i));
					visited[list[v].get(i)] = true;
				}
			}
		}// while
		
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
}//class
