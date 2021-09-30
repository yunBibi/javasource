package exception;

public class CatchByExeption4 {
	public static void main(String[] args) {

		try {
			// ArrayIndexOutOfBoundException 
			String data1 = args[0];
			String data2 = args[1];

			// NumberFormatException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			System.out.println(value1 + value2);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�Է°��� Ȯ���� �ּ���");
		}

		catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally { // exception ���ο� ������� ������ �����
			System.out.println("�ٽ� �����ϼ���");
		}

	}

}
