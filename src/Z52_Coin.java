import java.util.Arrays;

/**
 *	동적 계획법 DP (2차원 배열을 사용) 
 */
public class Z52_Coin {

	public static void main(String[] args) {
	
		//System.out.println(f(8));
		//System.out.println(g(8));
		//System.out.println(h(8));
		System.out.println(ff(8));
		
	}//main
	
	// 동전의 개수가 동적으로 변경되는 경우
	public static int ff (int n) {
		int[] coin = new int [n+1];
		
		// 첫번째 동전만 고려
		final int M = Integer.MAX_VALUE;
		int[] D = {3,4,6};
		
		for (int i = 0; i <= n; i++) {
			if(i%D[0] == 0 ) { // 거슬러 줄 수 있다
				coin[i] = i/D[0];
			}else { // 거슬러 줄 수 없다
				coin[i] = M;
			}
		}
		System.out.println(Arrays.toString(coin));
		
		// D 원소만큼 반복해준다
		for (int k = 1; k < D.length; k++) {
			for (int i = D[k]; i <= n; i++) {
				
				if(coin[i-D[k]] != M && coin[i] > coin[i-D[k]] +1) {
					coin[i] = coin[i-D[k]] +1;
				}
			}
			System.out.println(Arrays.toString(coin));
		}
		
		
		return coin[n] == M ? -1: coin[n];
	}
	
	
	// 1원짜리가 없는 경우라면?
	public static int h (int n) {
		int[] coin = new int [n+1];
		// 3원 동전만 고려
		// 거슬로 주지 못하는 경우에 M으로 표현
		final int M = Integer.MAX_VALUE;
		
		for (int i = 0; i <= n; i++) {
			if(i%3 == 0 ) { // 거슬러 줄 수 있다
				coin[i] = i/3;
			}else { // 거슬러 줄 수 없다
				coin[i] = M;
			}
		}
		// coin[i] = min (coin[i], coin[i-4] +1);
		// 					M		M 		기존값을 그대로 놓기
		// 					!M		M 		기존값을 그대로 놓기
		// 					M		!M 		없데이트 작은 값으로 놓기
		// 					!M		!M 		없데이트 작은 값으로 놓기
		for (int i = 4; i <= n; i++) {
			
			if(coin[i-4] != M && coin[i] > coin[i-4] +1) {
				coin[i] = coin[i-4] +1;
			}
		}
		System.out.println(Arrays.toString(coin));
		
		return coin[n] == M ? -1: coin[n];
	}
	
	// 1차원 배열을 사용하여 동전의 최소 갯수를 리턴하는 메서드
	public static int g (int n) {
		int[] coin = new int [n+1];
		
		// 1원 동전만 고려
		for (int i = 1; i <= n; i++) {
			coin[i] = i;
		}
		System.out.println(Arrays.toString(coin));
		// 1,4 원 동전만 고려
		
		for (int i = 4; i <= n; i++) {
			if(coin[i] > coin[i-4] + 1) {
				coin[i] = coin[i-4] + 1;
			}
		}
		System.out.println(Arrays.toString(coin));
		
		// 1,4,6 원 동전만 고려
		
		for (int i = 6; i <= n; i++) {
			if(coin[i] > coin[i-6] + 1) {
				coin[i] = coin[i-6] + 1;
			}
		}
		System.out.println(Arrays.toString(coin));
		
		return coin[coin.length-1];
	}// g - 1차원 배열 사용 메서드
	
	
	// 2차원 배열을 사용하여 동전의 최소 갯수를 리턴하는 메서드
	public static int f(int n) {
		int [][] coin = new int[3][n+1];
		
		// 1원 동전만 고려
		for (int i = 0; i <= n; i++) {
			coin[0][i] = i;
		}
		
		// 1,4 원 동전 고려
		for (int i = 0; i <= n; i++) {
			if(i<4 || coin[0][i]< coin[1][i-4]+1 ) {// 거스름돈이 동전 금액보다 작은 경우
				coin[1][i] = coin[0][i];
			}else { // 4원 동전을 고려했을 때 최적이면 반영
				//coin[1][i-4] + coin[0][i]
				coin[1][i] = coin[1][i-4] + 1;
			}
		}
		
		// 1,4,6 원 동전 고려
		
		for (int i = 0; i <= n; i++) {
			if(i<6 || coin[1][i]< coin[2][i-6]+1 ) {// 거스름돈이 동전 금액보다 작은 경우
				coin[2][i] = coin[1][i];
				
			}else { // 6원 동전을 고려했을 때 최적이면 반영
				coin[2][i] = coin[2][i-6] + 1;
			}
		}
		for (int i = 0; i < coin.length; i++) {
			System.out.println(Arrays.toString(coin[i]));
		}
		
		return coin[2][n];
	}// f - 2차원 배열 사용 메서드 
}//class
