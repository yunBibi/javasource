package shop;

public class Cellphone extends Product {

	private String carrier; // ��Ż� ����

	public Cellphone(String pname, int price, String carrier) {
		super(pname, price);
		this.carrier = carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("��Ż� ���� : "+carrier);
	}

}
