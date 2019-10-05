import java.util.Arrays;

/**
 * 
 * 이진검색 : 정렬이 된 데이처 군에서 검색하는 방법
 * 
 * 1. 반복문
 * 2. 재귀함수
 * 
 * 
 * @author student
 *
 */
public class Z09_BinarySerach_Review {

	public static int [] a = {1,2,3,4,5,6,7,8,9}; // 정렬이 된 데이터
	public static int key = 8;
	
	public static void main(String[] args) {
//		int index = Arrays.binarySearch(a, key);
//		System.out.println(index);
		int start = 0; // 검색 범위의 첫 번째
		int end = a.length-1;
		as(0, a.length-1);
		bs(0, a.length-1);
		
	}//main
	public static void as (int start, int end) {
		while(start<=end) {//검색할 범위가 남아있으면 반복 없으면 종료
			int mid = (start + end)/2; // 중간위치의 값
			if(a[mid] == key) {// 찾은 경우
				System.out.println("찾음");
				break;
				
				
			}else if(a[mid] > key){ // 작은쪽으로 재조정
				end = mid -1;
			}else { // 큰쪽으로 재조정
				start = mid +1;
			}
			
		if(start>end) {
			System.out.println("못찾음");
		}
			
			
		}//while
		
		
	}
	public static int bs (int start, int end) {
		
		if(start>end) { // 종료
			
			System.out.println("못찾음");
			return -1;
			
		}else { // 반복
			int mid = (start+end)/2;
			if(a[mid] > key) { // 작은쪽으로
				return bs(start, mid-1);
				
			}else if(a[mid] < key) { // 큰쪽으로
				return bs( mid+1, end);
				
			}else {
				System.out.println("찾음");
				return mid;
				
			}
				
		}
		
	}
	
	
	

}//class
