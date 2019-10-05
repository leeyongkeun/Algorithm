import java.util.Arrays;
import java.util.Scanner;

public class Z05_Flatten {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		for (int tc = 0; tc <= 10; tc++) { //alt shift r
			int dump_cnt= sc.nextInt();
			int [] arr = new int[100];// 상자의 개수
			
			int sum = 0; // 전체 상자들의 개수의 합
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			int target = 1; // 평탄화 작업 후 최대와 최소의 차이 
			if(sum % 100 ==0) {
				target =0;
				
			}
			
			Arrays.sort(arr);
			for (int i = 0; i < dump_cnt && (arr[99]-arr[0])>target; i++) {
				arr[99]--; //가장 높은 박스를 하나 감소
				arr[0]++; // 가장 낮은 박스에 하나 추가
				Arrays.sort(arr);
			}
			System.out.println("# " +tc +"   "+(arr[99]-arr[0]));
			
			
			
			
		}//tc
		
		
	}//main

}// class
