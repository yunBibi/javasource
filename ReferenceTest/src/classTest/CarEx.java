package classTest;

public class CarEx {
	public static void main(String[] args) {
		
		Car car = new Car();   // ��� ������ ���� ��� ��������?
		
		car.company = "����";
		car.model = "KONA";
		car.color = "red";
		car.maxSpeed = 200;
		
	// Car(){} => �⺻������(default)
	// Ŭ���� ���� ����� �����ڰ� �ϳ��� ������
	// �����Ϸ��� �ڵ����� �⺻ �����ڸ� ������ش�. 
		
		car.forward();  // �޼ҵ� ȣ��
		
	}

}
