
public class Z03_Gravity {

	public static void main(String[] args) {
		
		int[] a = {7,4,2,0,0,6,0,7,0};
		int cnt=0;
		
		// 2차원 배열을 사용
		
		// 회전하는 알고리즘 
		// 회전하는 알고리즘을 하지말고, 회전된 상태로 출발한다면?
		
		int [][] square = {
			{ 2 , 2 , 2 , 2 , 2 , 2 , 2 , 0},
			{ 2 , 2 , 2 , 2 , 0 , 0 , 0 , 0},
			{ 2 , 2 , 0 , 0 , 0 , 0 , 0 , 0},
			{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
			{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
			{ 2 , 2 , 2 , 2 , 2 , 2 , 0 , 0},
			{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0},
			{ 2 , 2 , 2 , 2 , 2 , 2 , 2 , 0},
			{ 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0}
		};
		//System.out.println(square.length);
		//System.out.println(square[0].length);
			
		// 중력작용하는 알고리즘
		while(cnt<9) {
			for (int i = 7; i >= 0; i--) {
				for (int j = 0; j < square[i].length; j++) {
					if(square[i+1][j]==0) {
						
						square[i+1][j]=square[i][j];
						square[i][j]=0;
					}
				
				}
			}
			cnt++;
		}
		
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println("");
		}
		// 낙차를 계산하는 알고리즘
		
		// A의 위치는 square[0][6] 
		// B의 위치는 square[0][5]
		// c의 위치는 square[7][6]
		
		//System.out.printf("회전 결과, B상자의 낙차는 %d, C상자의 낙차는 %d",,);
		
	}// end of main

}// end of class
