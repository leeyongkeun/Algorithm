/*
 * 	동적계획법 : 점화식을 찾기, 작은해부터 구해서 작은해를 기반으로 큰해를 구한다
 */
public class Z51_DP_Stick {

	public static void main(String[] args) {

		int [] memo = new int [10];
		memo[1] = 2;
		memo[2] = 5;
		
		for (int i = 3; i <=6; i++) {
			memo[i] = 2* memo[i-1] + memo[i-2];
		}
		System.out.print(memo[6]);
		
	}//main

}//class
