package string;

public class SubString {

	public static void main(String[] args) {
		String ssn = "880515-1220146";
		
		// 문자열 잘라내기
		ssn.substring(7);
		System.out.println(ssn.substring(7));    // 1220146
		
		System.out.println(ssn.substring(0,6));  // 880515 0부터 6개 잘라줘
	}

}
