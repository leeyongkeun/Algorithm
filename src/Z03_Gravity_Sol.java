
public class Z03_Gravity_Sol {

	public static void main(String[] args) {
		int[] a = {7,4,2,0,0,6,0,7,0};
		int maxcnt=0;
		for (int i = 0; i < a.length; i++) {
			int cnt=0;// 빈공간의 개수 = 나보다 작은 수의 갯수
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) cnt++;
			}
			System.out.print(cnt+ " ");
			if (maxcnt <cnt) maxcnt = cnt;
		}
		System.out.println();
		System.out.println("======");
		System.out.println(maxcnt);
		
		// 1차원 배열
		// 2차원 배열
		// 회전
		// 중력 발생
		// 낙차가 발생
		// 낙차 중의 최대값을 출력
		// 		
	}// main

}// class
