package string;

public class IndexOf {

	public static void main(String[] args) {

		String str1 = "�ڹ� ���α׷���";
		
		// �Ű������� �־��� ���ڿ��� ���۵��� ��ġ�� ����
		int index = str1.indexOf("���α׷���");
		System.out.println(index);
		
		System.out.println("�� ã�� ��� "+str1.indexOf("���̽�"));    // -1 ��ȯ
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));     // �빮�� A
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el",2)); // el�� 2��° ��ġ���� ã���ÿ�
		// indexOf�� �����ε� �Ǿ� �ֱ� ������ �پ��� ������� ã�ƺ� �� �ִ�.
		
		System.out.println("lã��: "+str2.lastIndexOf("l"));   // ������ lã��
		
		// str1�� '��'��� ���ڰ� �ִ��� Ȯ���ϰ�, ����ִٸ� '�����ϰ� ����', ���ٸ� '�����ϰ� ���� ����
		System.out.println(str1.indexOf("��") > -1 ? "�����ϰ� ����":"�����ϰ� ���� ����");
	}

}
