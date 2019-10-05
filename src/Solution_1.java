import java.util.Scanner;

public class Solution_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BufferedReader br; -> 더 빠르다

//		
//		System.out.println("나이를 입력하세요");
//		int age = Integer.valueOf(sc.nextLine());
//		System.out.println("당신의 나이는  " + age);
//				
//		System.out.println("이름을 입력하세요"); // 서민규
//		String name = sc.next(); // nextLine 엔터가 입력될때 까지 한줄을 받아옴, 엔터는 버림
//		System.out.println("당신의 이름은 " + name);
//		System.out.println("프로그램 종료 =====");
//		
//		// nextLine() 의 메서드와 next기본형() 계열의 메서드를 혼용하지 말자
//		
//		String ss = "123";
//		int a = Integer.valueOf(ss); // 123의 문자열을 정수 int으로 만들어 준다.
//		
//		
				
		// abc 3.14 5엔터 치면 엔터 전까지 다 받아옴
		
		
		
		// next() : 스트링 리턴
		// nextInt() : 쓰레기 데이터 (White Space공백,엔터,탭)를 지우고 뒤 123을 받아옴
		// nextLong()
		// nextDouble()
		
		//2 : 테스트 케이스 개수
		// 0011 => 문자열 String로 취급해야한다!!
		// 100
			//메모리의 길이가 1이상 50이하 -> int형이 아니다!
			// 입력받기 문자열의 해당 글자 얻기
			// 어떤 아이디어가 있는지
			
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for (int i = 1; i <= TC; i++) {
			
			String str = sc.next();
			
			int cnt = 0; //변경횟수
			char c = '0'; // 초기 비교할 글자
			
			
			for (int j = 0; j < str.length(); j++) {
				
			
				if (c != str.charAt(j))
					cnt++;
					c = str.charAt(j);
			}
			
			System.out.println("#"+i+" "+cnt);
			
			
			
			
			
			
		}// end of for testcase
		
		
		
		
		
		
		
	}

}
