package classTest;

public class ArrayTest5 {
	public static void main(String[] args) {
		// 문자 => char / 'a' 
		// 문자열 => String / "a"
		
		// char 배열 선언, 생성, 초기화
		char chArr[] = {'a','n','s','w','e','r'};
		char[] chArr2 = {'a','n','s','w','e','r'};   // 대괄호의 위치는 상관이 없다. 
		
		for(char ch:chArr) {
			System.out.print(ch);
		}
	}
}
