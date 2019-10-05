
public class Z57_AllPairsShortest {

	public static void main(String[] args) {

		final int M = Integer.MAX_VALUE;
		int [][] D = {{ 0 , 4 , 2 , 5 , M},
					  { M , 0 , 1 , M , 4},
					  { 1 , 3 , 0 , 1 , 2},
					  { -2 , M , M , 0 , 2},
					  { M , -3 , 3 , 1 , 0},
		};
		
		for (int k = 0; k < D.length; k++) {
			for (int i = 0; i < D.length; i++) {
				if(k == i) continue;
				for (int j = 0; j < D.length; j++) {
					if (k == j || i == j ) continue;
					// 기존 값		경유 정점으로 가는 새로운 경로
					// D[i][j] = D [i][k] + D[k][j]; // 점화식
					//	 M			 M 				// 그냥 놔둠
					// 	!M			 M 				// 그냥 놔둠
					// 	 M			!M 				// 업데이트
					// 	 M			!M 				// 업데이트
					if(D[i][k] != M && D[k][j] != M 
							&& D[i][j] > D [i][k] + D[k][j]) {
						// 뒤에있는 값이 더 크면 업데이트 
						D[i][j] = D [i][k] + D[k][j];
					}
				}
			}
		}
		for (int i = 0; i < D.length; i++) {
			for (int j = 0; j < D[i].length; j++) {
				System.out.printf("%2s,",(D[i][j] == M ? "M": D[i][j]));
				
			}
			System.out.println();
		}
		System.out.println("1->2 최단경로 : "+ D[0][1]);
		System.out.println("1->4 최단경로 : "+ D[0][4]);
		
	}//main
	
}//class










