package string;

public class IndexOf {

	public static void main(String[] args) {

		String str1 = "자바 프로그래밍";
		
		// 매개값으로 주어진 문자열이 시작되은 위치를 리턴
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		System.out.println("못 찾는 경우 "+str1.indexOf("파이썬"));    // -1 반환
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));     // 대문자 A
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2)); // el을 2번째 위치부터 찾으시오
		// indexOf가 오버로딩 되어 있기 때문에 다양한 방식으로 찾아볼 수 있다.
		
		System.out.println("l찾기: "+str2.lastIndexOf("l"));   // 마지막 l찾기
		
		// str1에 '그'라는 문자가 있는지 확인하고, 들어있다면 '포함하고 있음', 없다면 '포함하고 있지 않음
		System.out.println(str1.indexOf("그") > -1 ? "포함하고 있음":"포함하고 있지 않음");
	}

}
