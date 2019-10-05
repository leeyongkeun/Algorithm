
public class Prac_DFS {

	public static void main(String[] args) {
		int [][] graph = {{},{2,3},{1,4,5},{1,7},{2,6},{2,6},{4,7},{3,6}};
		boolean [] visited = new boolean [8];
		int [] stack = new int [20];
		int top = -1;
		
		int v = 1;
		visited[v] = true;
		System.out.print(v+ " ");
		stack[++top] = v;
		
		while(top>-1) {
			int w = -1;
				for (int i = 0; i < graph[v].length; i++) {
					if(!visited[graph[v][i]]) {
						w = graph[v][i];
						stack[++top] = w;
						visited[w] = true;
						System.out.print(w+" ");
						v = w;
						break;
					}
				}
				if (w == -1) {
					v = stack[top--];
				}
			
		}//while
		
	}//main

}//class
