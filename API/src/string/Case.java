package string;

public class Case {

	public static void main(String[] args) {
		// ��ҹ��� ����
		String str1 = "Java programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		System.out.println(str2.toLowerCase());
	}

}
