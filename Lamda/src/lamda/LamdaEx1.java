package lamda;

public class LamdaEx1 {
	public static void main(String[] args) {
//		// �������� �͸��� ���
//		LamdaTest1 obj1 = new LamdaTest1() {
//		@Override
//		public void methd1() {
//			System.out.println("�Լ��� �������̽�");
//			int i = 10;
//			System.out.println(i*i);
//			}
//		};
//		obj1.methd1();
		
		
		
		LamdaTest1 obj = () -> System.out.println("�Լ��� �������̽�");
		obj.methd1();
		
		obj = () -> {
			int i = 10;
			System.out.println(i*i);
			
		};
		obj.methd1();
	}

}
