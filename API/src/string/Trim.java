package string;

public class Trim {

	public static void main(String[] args) {
		// 문자열 앞, 뒤 공백 없애주기
		String str1 = "     abc     ";
		String str2 = "abc";
		String newstr1 = str1.trim();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(newstr1);
		System.out.println(newstr1.equals(str2));
	}

}
