package classTest;

public class GoodsStockEx {
	public static void main(String[] args) {
		
		// ù��° ��ǰ ������
		GoodsStock product1 = new GoodsStock();
		product1.code = "p12345";
		product1.stockNum = 30;
		
		// ��ǰ �Ǹ� => ��� ����
		product1.subtrackStock(15);
		
		// ȣ�� -> ���ϰ��� �ִٸ� ���ϰ��� �ޱ�
		
		// 1. syso �ȿ� �־ ó��
		// System.out.println("���� ��� ����: " + product1.subtrackStock(15));
		
		// 2. ������ �ޱ� - ���뼺 ������
		// int stockNum = product1.subtrackStock(15);
		// System.out.println("���� ��� ����: "+ stockNum);
		
		
		
		// ��ǰ => ��� ����
		// �޼ҵ� ȣ�� => ���� Ÿ���� ������ ȣ�⸸ �ϸ� ��
		product1.addStock(5);
		System.out.println("���� ��� ����: "+product1.stockNum);
		// ���ϰ��� ���� ������ �̷��� ȣ���Ѵ�.
	}

}
