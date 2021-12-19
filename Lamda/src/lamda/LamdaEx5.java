package lamda;

public class LamdaEx5 {
	// �Ű������� �����ϴ� ���ٽ�
	public static void execute(LamdaTest5 lamda) {
		lamda.run();
	}
	
	// ��ȯ������ ���̴� ���ٽ�
	public static LamdaTest5 getRun() {
		LamdaTest5 obj1 = () -> System.out.println("�Լ��� �������̽� ����");
		return obj1;
	}
	
	public static void main(String[] args) {
		// ���ٽ�
		LamdaTest5 lamda = () -> System.out.println("Lamda!!!! run");
		lamda.run();
		
		System.out.println("---------------------");
		execute(lamda);
		System.out.println("---------------------");
	}
}
