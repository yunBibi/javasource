package exception;

// Exception ó��
// �� try ~ catch

public class UnCheckedException {

	public static void main(String[] args) {
		
//		if (args.length == 2) {
			
//			// java.lang.ArrayIndexOutOfBoundsException ������ ���Ѻ��� �ϴ� ����
//			String data1 = args[0];
//			String data2 = args[1];
			
//			System.out.println("args[0] "+data1);
//			System.out.println("args[1] "+data2);
//		}
	
		String data1 = null;
		String data2 = null;
		
		try {  // ���ܰ� �߻��� �� �ִ� ����
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			// ���ܰ� �߻��ϸ� ��� ó���� ������ �ۼ�
			System.out.println("���� �Ű� ���� ���� �����մϴ�.");
		}
		
	}

}
