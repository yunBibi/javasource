package classTest;

public class Car2 {
	// �Ӽ�
	private String company;  // �ܺο����� �� ���̵����ϴ� �� private
	private String model;
	private String color;
	private int maxSpeed;
	
	// ������ - Ŭ���� �̸��� ���� / ���� Ÿ�� ���� / �ߺ� ����(������ �����ε�)
	
	
//  ������ �����ε�   <- ��ȣ ���� Ÿ���� �޶����� ���� (�̸�X)
	Car2(){
		System.out.println("Car2 �⺻ ������");
	}
//	Car2(){  //Duplicate method Car2() in type Car2
//		System.out.println("Car2 �⺻ ������");
//	}
	
	Car2(String model){
		System.out.println("Car2 ������ - model �ʱ�ȭ");
	}
	
	Car2(String model, String color){
		System.out.println("Car2 ������ - model, color �ʱ�ȭ");
	}
	
	Car2(String company, String model, String color, int maxSpeed){
		System.out.println("Car2 ������ - �Ӽ� ��� �ʱ�ȭ");
	}
	
	
	// ���� - �޼ҵ�
	// ����Ÿ�� �޼ҵ��(){}
	// ����Ÿ�� �޼ҵ��(Ÿ�� ������, ...){}
	void forward() {
		System.out.println("�����ϴ�");
	}
	void backword() {
		System.out.println("�����ϴ�");
	}
}