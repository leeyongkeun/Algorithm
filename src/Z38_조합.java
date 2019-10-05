import java.util.Arrays;

public class Z38_조합 {
	public static int[] arr = {5,6,7,8,9};
	public static int[] trr ;
	
	public static void main(String[] args) {
		int r = 3; //nCr 에서 n은 전체 개수 r은 뽑을 갯수
		trr = new int [r]; // 뽑을 수를 저항할 배열
		Comb(arr.length,r);
		
	}//main
	public static void Comb (int n, int r) {
		if(r==0) {
			System.out.println(Arrays.toString(trr));
			
		}else if(n<r) {
			return;
		}else {
			trr[r-1] = arr[n-1];
			Comb(n-1, r-1); // n-1 번째 숫자를 사용한 경우
			Comb(n-1, r); // n-1 번째 숫자를 사용 안 한 경우
		}
	}
}//class
