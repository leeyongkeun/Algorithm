import java.util.Arrays;

/*
 * LIS - 최장 증가 수열
 * 		다음 코드는 DP 접근 방법 , O[n^2] 
 * 		LIS를 구성하는 수열을 출력하고 싶다면, DP 외의 별도의 작업이 필요하다 - path
 */
public class Z55_LIS {
	public static void main(String[] args) {
		int [] a = {3,2,6,4,5,1};
		int [] LIS = new int [a.length];
		// i번째 숫자를 마지막글자로 사용할 경우의 최장 증가 수열의 길이
		int [] path = new int [a.length];
		 // pass는 LIS를 추적할 경로 . 부모의 인덱스를 저장하겠다
		for (int i = 0; i < a.length; i++) {
			LIS[i] = 1;
			path[i] = -1; // 부모가 없는 루트를 의미 
			// 내꺼 하나만 가지고 있는 수열도 있으니까 초기값으로 1
			for (int j = 0; j < i; j++) {
				// 내 앞쪽의 범위에서 
				if(a[j] < a[i] && LIS[i] < LIS[j] + 1 ){
					// 나보다 작은 숫자중, 최장 증가 수열 +1 최대값으로 갱신
					LIS[i] = LIS[j] + 1;
					// j 번째 숫자 다음에 i번째 숫자를 붙여서 수열을 만든다
					path[i] = j;
					// 누구 다음에 붙여는지를 저장 
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(LIS));
		int maxLISIndex = 0;
		for (int i = 0; i < LIS.length; i++) {
			if(LIS[maxLISIndex] < LIS[i]) {
				maxLISIndex = i; // 인덱스만 저장
			}
		}
		System.out.println("LIS의 길이 : "+LIS[maxLISIndex]+"개");
		System.out.println(Arrays.toString(path));
		
		String result = "";
		for (int i = maxLISIndex; i!=-1 ; i = path[i]) {
			result = a[i] +" "+ result;
		}
		System.out.println("최장증가수열 : "+result);
		
	}//main
}//class






















