/**
 * 문자열 :String 으로 관리한다. 
 * java에서는 유니코드 utf-16 체계를 사용한다
 * min: 2Btye ~ max : 4Byte
 * @author student
 *
 */
public class Z12_String {

	public static void main(String[] args) {
		
		String s1 = "hi";
		String s2 = "hi";
		String s3 = new String("hi");
		String s4 = new String("hi");
		System.out.println(s1 == s2); // true 주소비교 - constant pool
		System.out.println(s3 == s4); // false
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	
		s3=s3.intern(); // constant Pool 영역으로 넣어버린다 
		s4=s4.intern(); // constant Pool 영역으로 넣어버린다 
		
		System.out.println(s1 == s2); // true 주소비교 - constant pool
		System.out.println(s3 == s4); // false
				 // 0123456789
		String s = "abcdefghij";
		p("문자열 길이 : "+ s.length());
		p("해당 인덱스의 글자  : "+ s.charAt(3));
		p("해당 문자열에 시작위치  "+ s.indexOf("efg")); // 좌측부터 검색
		p("해당 문자열에 시작위치  "+ s.lastIndexOf("fgh")); // 우측 부터 검색
		p("부분 문자열 추출 "+ s.substring(3,6)); // 우측 부터 검색
		p("부분 문자열 추출 "+ s.substring(3)); // 우측 부터 검색
		System.out.println("");
		p("소문자로 변환 : "+s.toLowerCase());
		p("대문자로 변환 : "+s.toUpperCase());
		p("내용물 비교(대소문자 무시)  : " + s.equalsIgnoreCase("abcdefghij"));
		p("문자열 앞뒤의 whilteSpace를 제거 " +s.trim())	;
		p("문자열 교체 : "+ s.replace("def", "xxxx"));
		p("문자열 출력 : " + s.toString());
		
		// String의 메서드는 변경 후 저장을 안한다. 
		System.out.println(s);
		s=s.substring(3,6);
		System.out.println(s);
		
		String ss = "abcdefghij";
		
		for (int i = ss.length()-1; i >=0; i--) {
			System.out.print(ss.charAt(i));
		}
		
		String str = "";
		System.out.println();
		System.out.println("=======");
		//ss 역순으로 출력 
		
		for (int i = 0; i < ss.length(); i++) {
			str = ss.charAt(i)+str;
		}
		System.out.println(str);
		
		//String
		String s5 = "";
		for (int i = 0; i < 10; i++) {
			s5 +="a"; // 배열을 새로 만들어서 저장하므로 오래걸린다 
		}
		System.out.println(s5);
		
		// StringBuilder : 단일 thread 용, thread : 각각의 작업 
		// StringBuffer : 멀티 thread 용, thread가 여러개 가 멀티 thread....synchronized 처리가 되어있따.
		
		
		
		
		StringBuilder sb = new StringBuilder("abc"); // 3+16(여유공간)
		System.out.println(sb.reverse());
		System.out.println(sb);
		sb.append("a"); // 배열을 새로 만드는 회수가 줄어듦
		System.out.println(sb);
		
		String s6 = "abcdefghij";
		StringBuilder sb6 = new StringBuilder(s6);
		sb6.reverse();
		sb6.append("a").append("b").append("c");
		System.out.println(sb6);
		System.out.println(sb6.toString());
		
		//StringBuilder, StringBuffer 는 변경 메서드 실행하며
		// 직접 원본이 변경되어 저장 된다. 
		
		StringBuilder sb7 = new StringBuilder();
		int TestCase = 1;
		sb7.append('#').append(TestCase).append(' ');
		System.out.println(sb7);
		
		
		
	}//main
	
	public static void p (String str)
	{
		System.out.println(str);
	}
}//class
