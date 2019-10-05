import java.util.Arrays;

/*
 * LIS = 최장 증가 수열
 * 		DP + Greedy O[NlonN]
 * 		이진 검색 활용
 */

public class Z56_LIS_DPGreedy {
	public static void main(String[] args) {
		int [] a = {8,2,4,3,6,11,7,10,14,5};
		int [] C = new int [a.length];
		int size = 0; // LIS의 갯수를 관리할 인덱스 
		// LIS 로 사용 가능성이 높은 숫자를 저장 (LIS 로 사용되지 않을 수도 있음)
		// C 배열에서 의미있는 데이터는 마지막 숫자 , C 배열에서 저장한 숫자의 갯수
		
		int [] path = new int[a.length];
		// LIS 수열을 추적하기 위한 경호 인덱스를 저장
		
		path[size] = -1; // 첫번째 수열 (루트임을 표시)
		C[size++] = 0; // 첫번째 숫자의 인덱스는 바로 반영
		
		for (int i = 1; i < a.length; i++) { // 주어진 배열을 순회
			if(a[C[size-1]] < a[i]) { // LIS 마지막 숫자보다 크면, LIS 뒤에 붙인다 
				path[i] = C[size-1];
				// LIS의 마지막 숫자의 인덱스를 나의 부모로 저장
				C[size++] = i;
				
			}else { // LIS 마지막 숫자보다 작으면, LIS 값 업데이트 (이진탐색)
				// 이진 탐색 코드
				int temp = binarySearch(a, C, 0, size , a[i]);
				if(temp < 0) {
					// temp가 음수라면 찾지 못했다는 말
					temp = -temp -1;
					path[i] = path[C[temp]];
					C[temp] = i;
				}
			}
		}
		System.out.println("a : "+ Arrays.toString(a));
		System.out.println("C : "+ Arrays.toString(C));
		System.out.println("최장증가수열 갯수 : "+size+"개");
		System.out.println("path : "+ Arrays.toString(path));
		String result = "";
		for (int i = C[size-1] ; i != -1 ; i = path[i]) {
			result = a[i] + " " + result;
		}
		System.out.println("최장증가수열 : " + result);
		
		
	}//main
	
	 private static int binarySearch(int[] a ,int[] C, int fromIndex, int toIndex, int key) {
		int low = fromIndex;
		int high = toIndex - 1;
		
		while (low <= high) {
			int mid = (low + high) >>> 1;
			int midVal = a[C[mid]];
		
			if (midVal < key) low = mid + 1;
			else if (midVal > key)
				high = mid - 1;
			else
				return mid; // key found
		}
		
		return -(low + 1);  // key not found.
	}
	
}//class
