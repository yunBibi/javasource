package classTest;

public class GoodsStockEx2 {
	public static void main(String[] args) {
		
		GoodsStock2 product1 = new GoodsStock2("p12345", 30);
		// �Ʒ��� ���� private�� �ɸ� �Ӽ��� ���� �����Ϸ��� �ϸ�
		// The field GoodsStock2.code is not visible �̷� ������ ���.
		// product1.code = "p12345";  
		// product1.stockNum = 30;
		
		// ������� �ʱ�ȭ�� '������'�� �����ش�. 
		
		// ��ǰ �Ǹ� => ��� ����
		product1.subtrackStock(15);
		
		// ��ǰ => ��� ����
		// �޼ҵ� ȣ�� => ���� Ÿ���� ������ ȣ�⸸ �ϸ� ��
		product1.addStock(5);
		System.out.println(product1.getStockNum());
		
	}

}
