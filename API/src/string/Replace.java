package string;

// StringŬ���� <= Immutable(������ �ʴ´�)

public class Replace {

	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";

		// �ڹ� => Java
		System.out.println(str1.replace("�ڹ�", "Java"));

		System.out.println(str1);    // StringŬ������ Immutable�̱� ������ �ٲ��� �ʴ´�.
		str1 = str1.replace("�ڹ�", "Java");  // str1�� �ٲ��� �� �ְ� ���ο� ���� �� �� �ٽ� ������ �Ѵ�.

		System.out.println(str1);
		
		str1 = str1.replaceFirst("�ڹ�", "Java");
		System.out.println(str1);
	}

}
