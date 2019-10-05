/**
 * 
	과제
	int[] a = {0,1,2,3,4,5,6,7,8,9}; // 정렬이 되어있는 상태
	int key = 8; // 8은 존재, 20 은 존재하지 않음 출력;
	이진검색 - 반복문, 재귀 방법으로 작성
	
 */
import java.util.Scanner;


public class BinarySearch {

	static int [] a = {0,1,2,3,4,5,6,7,8,9};
	static boolean ser=false;
	static int low=0;
	static int mid=0;
	static int high=a.length-1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		//aa(key);
		bb(key);
	} //main

	public static void aa (int n) { // 반복문으로 작성
		while(low<=high) {
			mid = (low+high)/2;
			//System.out.println(low+" "+high+" "+a[mid]);
			if(a[mid] == n) {
				ser = true;
				break;
			}			
			if(a[mid] < n) 	low = mid +1;
			else  high = mid -1;
			
		}//while
		if(ser) System.out.println(n+"은 존재");
		else  	System.out.println(n+"은 존재하지 않음");
		
		
		
	} //aa
	
	public static void bb (int n) {
		if(a[mid]==n) {// 종료
			ser = true;
			if(ser) System.out.println(n+"은 존재");
			else  	System.out.println(n+"은 존재하지 않음");
			
		}else {// 반복 
			mid = (low+high)/2;
			if(a[mid]<n) {
				if(low == high) {
					System.out.println(n+"은 존재하지 않음");
					return;
				}
				
				low= mid+1;
				bb(n);
				
			}
			
			else {
				if(low == high) {
					System.out.println(n+"은 존재하지 않음");
					return;
				}
				high = mid -1;
				bb(n);
			}
			
		}
		
		
	} // bb
	
	
} //class
