package exam;

public class PrintTest {
	public static void main(String[] args) {
		
		int a = 3;
		
		System.out.print(true);
		// + : 문자열과 같이 사용을 하게 되면 연결의 의미로 사용됨
		System.out.println("여기는 마음대로" + a);  // 괄호 안에 공백 허용 => 엔터 치는 용으로 단독 사용 가능
		//System.out.printf();
		
		String str = "abc"+3;   // 문자열과 숫자가 함께 쓰였을 때 +는 '연결'  
		System.out.println(str);
	}
}
