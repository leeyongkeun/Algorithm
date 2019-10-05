import java.util.Arrays;

/*
 *  배낭 문제 Knapsack
 *  	Fractional Knapsack - 그리디
 *  	 : 물건 여러개, 1개씩
 *  
 *  	0-1 Knapsack - 완탐, DP, 백트랙킹
 *  	: 물건 여러개, 1개씩 
 *		 
 */

public class Z54_Knapsack_BagPack {

	public static void main(String[] args) {

		// DP 동적 계획법
		int n = 10;
		int[][] item = {{10,5},{40,4},{30,6},{50,3}};
		// [가격][무게]
		int[][] K = new int [item.length+1][n+1];
		// K는 최대 가치를 저장할 배열
		// 행 : 고려할  물건의  개수, 열 : 배열의 임시무게
		
		// 첫행 ( 물건을 아무것도 고려하지 않는 경우의 가치),
		// 첫열 ( 배낭의 임시무게가 0kg일 경우의 가치) 0으로 초기화
		
		// 물건의 무게보다 배낭의 무게가 적은 경우
		// 	: 이전 행의 데이터를 그대로 복사 
		// 5kg 보다 적은 경우 
		
		for (int i = 0; i < item.length; i++) {
			// i번 물건을 추가로 고려한 경우
			for (int w = 0; w < item[i][1]; w++) {
				K[i+1][w] = K[i][w];
				
			}
			for (int w = item[i][1] ; w <= n; w++) {
				int now = K[i][w-item[i][1]] + item[i][0]; // 1번 물건을 고려한 경우
				int pre = K[i][w]; // 1번 물건을 고려하지 않은 경우
				
				K[i+1][w] = now >= pre ? now : pre;
			}
			System.out.println(Arrays.toString(K[i+1]));
		}
		
		System.out.println(K[item.length][n]);
		
	}//main

}//class





















