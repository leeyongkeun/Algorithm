import java.util.Arrays;
import java.util.Scanner;

public class Z01_Array {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		// swap
		// temp 만들고 해보기
//		int temp;
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
		
		// 변수 안만들고 어떻게 할까?
		
//		a = a + b; //8
//		b = a - b; //3
//		a = a - b; //5
//		System.out.println(a);
//		System.out.println(b);
//		
		
		int[] arr = {3,7,5};
		//최대값을 출력
		Arrays.sort(arr);
		//System.out.println(arr[arr.length-1]);
		
		
		// 최대값을 출력 : 3개 이상의 데이터의 최대/최소를 구할 경우 변수 하나를 만들자
		
		int max=Integer.MIN_VALUE; // 최대값을 저장해 놓을 변수 (지역변수는 초기값이 없다)
		// 초기값이 중요
		// 1. 이세상에서 존재하는 가장 작은 값으로 초기화, 초기값 중요
		// 2. 비교하고자 하는 원소 중의 하나의 값으로 초기화, 초기값 중요
			// int max = arr[0]
		// 		
		
		for (int i = 0; i < arr.length; i++) {
			
			if(max<arr[i])  max = arr[i];
		}
		
		//System.out.println("최대값 : " + max);
		
		
		// 원소 출력
		int [] brr = {1,2,3,4,5};
		
		for (int i = 0; i < brr.length; i++) {
			//System.out.print(brr[i]+",");
		
		}
		//System.out.println();
		//System.out.println(Arrays.toString(brr));
		
		
		// 누적하여 더하기 
		
		int[] crr = {1,2,3,4,5,6,7,8,9,10};
		int sum=0; // 연산자에 대한 항등원 
		for (int i = 0; i < crr.length; i++) {
			sum += crr[i];
		}
		//System.out.println("누적합 : "+sum);
		
		
		
		// 존재 유무
		int[] drr = {3,2,1,6,5,4,7};
		int key = 1; // 1: 있다 , 8:없다
		
		boolean check = false; // 존재 유무를 파악하기 위한 flag 변수
		for (int i = 0; i < drr.length; i++) {
			if(key== drr[i]) {
				check = true; 
				break;								
			}			
		}
		//if(check) System.out.println("있다");
		//else System.out.println("없다");
		
		
		// flag 변수 사용하는것이 더 빠르고, 알고리즘 측면에서 더 좋은 코드
		
		
		
		
		// 빈도
		
		int [] frr = {3,1,1,2,3,1,2,1,3,1,0,0,3};
		// 3이 몇번 나왔는가?
		int [] cnt = new int[4];
		
		for (int i = 0; i < frr.length; i++) {
			cnt[frr[i]]++;
					
		}
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				//System.out.println(i+" ");
				
				
			}
		}
		
		System.out.println(Arrays.toString(cnt));
		
		// 정렬 가운데 가장 빠른정렬이 카운팅 정렬	 : 카운팅 정렬 알고리즘
		// 카운팅 정렬 알고리즘
		// 장점 : 가장 빠름 , 코드도 간단
		// 단점 : 메모리를 낭비 , 정렬할 데이터가 0, 양의 정수이어야 함
//		System.out.println("0의 회수: "+cnt[0]);
//		System.out.println("1의 회수: "+cnt[1]);
//		System.out.println("2의 회수: "+cnt[2]);
//		System.out.println("3의 회수: "+cnt[3]);
		
		//
		
		int[] grr = {3,5,1,9,7,2,6,4,8};
		Arrays.sort(grr); // 오름차순으로 정렬
		//System.out.println(Arrays.toString(grr));
		
		
		// 코딩 잘하려면     1. 프로그램 언어 문법을 알아야
		// 			  2. IDE 통합개발툴 (이클립스) - 단축키, 템플릿, 디버깅
		//			  3. 문제 분석
		//			  4. 남의 소스 분석 능력
		//			  5. 구현 능력
		//			  6. 알고리즘 설계 기법
		//			  7. 수학
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// end of main

}// end of class
