package shop;

import java.util.Set;

public class ShopEx {

	public static void main(String[] args) {
		MyShop shop = new MyShop();
		
		// �����̸� ����
		shop.setTitle("�ڹټ�");
		
		// �� ����
		shop.genUser();
		
		// ��ǰ ����
		shop.genProduct();
		
		// ���� ����
		shop.start();
	}

}
