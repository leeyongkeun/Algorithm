import java.util.Arrays;
import java.util.Scanner;

public class Solution_1208 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int TC=10;
		
		for (int tc = 1; tc <= TC; tc++) {
			int shift = sc.nextInt();
			int [] arr = new int[100];
			int [] brr = new int[100];
			int cnt=0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				
			}//블록 갯수 입력받기
			//System.out.println(Arrays.toString(arr));
			for (int i = 0; i < brr.length; i++) {
				Arrays.sort(arr);
				brr[i] = arr[i];
			}
			
			//System.out.println(Arrays.toString(brr));
			// 오름차순으로 정렬까지 했어
			
			while(cnt<shift) {
				
				brr[brr.length-1]-=1;
				brr[0]+=1;
				cnt++;
				Arrays.sort(brr);
							
					
			}// while문으로 맨뒤의 값을 1 감소, 맨앞 값 1 증가
			System.out.print("#"+tc+" ");
			System.out.print(brr[brr.length-1]-brr[0]);
			System.out.println("");
			
			
		}//tc
		
		

	}// main

}// class
