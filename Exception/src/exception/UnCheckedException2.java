package exception;

public class UnCheckedException2 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

//		int value1 = Integer.parseInt(data1);
		// NumberFormatException
//		int value1 = Integer.parseInt(data1);

//		System.out.println(value1 + value2);

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {   // exception ���ο� ������� ������ �����
			System.out.println("�ٽ� �����ϼ���");
		}

	}

}
