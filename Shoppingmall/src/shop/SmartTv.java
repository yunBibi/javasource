package shop;

public class SmartTv extends Product {

	private String resolution; // �ػ�

	public SmartTv(String pname, int price, String resolution) {
		super(pname, price);
		this.resolution = resolution;
	}

	@Override
	public void printExtra() {
		System.out.println("�ػ� : "+resolution);
	}
}
