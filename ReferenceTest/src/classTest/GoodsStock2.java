package classTest;

public class GoodsStock2 {
	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100��)
	
	private String code;
	private int stockNum;
	// private : Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�
	
	// ������� �ʱ�ȭ�� '������'�� �����ش�. 
	// �⺻ ������
	GoodsStock2(){}
			
	// ������ �����ε�
	GoodsStock2(String code, int stockNum){
		this.code = code;
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	} 
	
	// ��� : ������ ����(�Է°� ����, ��°��� ����), ������ ����(�Է°� ����, ��°��� ���� ������ ����)
	int subtrackStock (int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	// ���� ��� ������ �����ϴ� ���
	int getStockNum(){
		return stockNum;
	}
	
}
