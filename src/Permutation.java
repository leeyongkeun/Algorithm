
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] brr = {2,4,7};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(i==j) continue;
				for (int k = 0; k < brr.length; k++) {
					if( i ==k || j ==k) continue;
					System.out.println(brr[i]+","+brr[j]+","+brr[k]);
				}				
			}
		} // 반복문으로 순열 표현하기
		// 재귀 함수가 필요함을 느낌
		
		
		
	} // main

}// class
