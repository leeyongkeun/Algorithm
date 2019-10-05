import java.util.Scanner;

public class Jungol_1127 {
	public static int [][] materials = null;
	static int Size = 0;
	static boolean[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Size = sc.nextInt();
		materials = new int [Size][2];
		check = new boolean[Size];
		
		for (int i = 0; i < Size; ++i) {
			materials[i][0] = sc.nextInt();
			materials[i][1] = sc.nextInt();
			
		}
		//makeFood(0);
		makeFood2(0,1,0,0);
		System.out.println(min);
	}//main
	
	static int min = Integer.MAX_VALUE;
	
	public static void makeFood(int index) {
		if(index==Size) {
			int sSum = 1, bSum = 0, cnt=0;
			for (int i = 0; i < Size; ++i) {
				if(!check[i]) continue; 
				cnt++;
				sSum *= materials[i][0];
				bSum += materials[i][1];
			}
			if(cnt>0) {
				int temp = Math.abs(sSum-bSum);
				if(temp< min) min = temp;
			}
			return;
		}
			check[index] = true;	
			makeFood(index+1);
			check[index] = false; 	
			makeFood(index+1);
		
	
	}
	
	public static void makeFood2(int index, int sSum, int bSum, int cnt) {
		if(index==Size) {
			if(cnt>0) {
				int temp = Math.abs(sSum-bSum);
				if(temp < min) min = temp;
			}
			return;
		}
		makeFood2(index+1, sSum*materials[index][0], bSum+materials[index][1] ,cnt+1);
		makeFood2(index+1, sSum, bSum ,cnt);
	}
	public static String src = "4\r\n" + 
			"1 7\r\n" + 
			"2 6\r\n" + 
			"3 8\r\n" + 
			"4 9";
}//class
