import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Prac_1 {
	public static int[] tree = new int [1<<5];
	public static String src ="13\r\n" + 
			"1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13";
	public static void preorder(int index) {
		System.out.print(tree[index]+" ");
		
		if(index*2 < tree.length && tree[index*2] != 0) {
			preorder(index*2);
			
		}if(index*2+1 < tree.length && tree[index*2+1]!=0) {
			preorder(index*2+1);
		}
		
	}
	public static void inorder(int index) {
		
		if(index*2 < tree.length && tree[index*2] != 0) {
			preorder(index*2);
		}	
			System.out.print(tree[index]+" ");
		if(index*2+1 < tree.length && tree[index*2+1]!=0) {
			preorder(index*2+1);
		}
		
	}
	public static void nextorder(int index) {
		
		if(index*2 < tree.length && tree[index*2] != 0) {
			preorder(index*2);
			
		}if(index*2+1 < tree.length && tree[index*2+1]!=0) {
			preorder(index*2+1);
		}
		
		System.out.print(tree[index]+" ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new StringReader(src));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			int parent = Integer.parseInt(st.nextToken());
			int child = Integer.parseInt(st.nextToken());
			int i;
			
			for (i = 0; i < tree.length; i++) {
				if(parent == tree[i]) break;
			}
			
			if(tree[i*2]== 0) {
				tree[i*2] = child;
			}else {
				tree[i*2+1] = child;
			}
			
		}
		System.out.println("===입력값===");
		for (int j = 0; j < tree.length; j++) {
			if(tree[j]!=0) {
				
				System.out.print(tree[j]+ " ");
				
			}
		}
		
		
		System.out.println("\n====전위 순회 ====");
		preorder(1);
		
		System.out.println("\n====중위 순회 ====");
		inorder(1);
		
		System.out.println("\n====후위 순회 ====");
		nextorder(1);
		
	}//main
	

}//class
