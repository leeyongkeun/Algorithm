
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 버블 정렬
		int[] x = {55,7,78,12,42};
		for (int i = x.length; i >=0 ; i--) {
			// i : 검색 영역의 끝 숫자를 표시
			// 0~ i번째 범위
			for (int j = 0; j < i; j++) {
				if (x[j] > x[j+1]) {
					int temp = x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					
				}// 버블 정렬
			}
		}
		
	}

}
