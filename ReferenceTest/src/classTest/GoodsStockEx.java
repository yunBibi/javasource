package classTest;

public class GoodsStockEx {
	public static void main(String[] args) {
		
		// 첫번째 상품 재고관리
		GoodsStock product1 = new GoodsStock();
		product1.code = "p12345";
		product1.stockNum = 30;
		
		// 상품 판매 => 재고 감소
		product1.subtrackStock(15);
		
		// 호출 -> 리턴값이 있다면 리턴값을 받기
		
		// 1. syso 안에 넣어서 처리
		// System.out.println("현재 재고 수량: " + product1.subtrackStock(15));
		
		// 2. 변수로 받기 - 재사용성 좋아짐
		// int stockNum = product1.subtrackStock(15);
		// System.out.println("현재 재고 수량: "+ stockNum);
		
		
		
		// 반품 => 재고 증가
		// 메소드 호출 => 리턴 타입이 없으면 호출만 하면 됨
		product1.addStock(5);
		System.out.println("현재 재고 수량: "+product1.stockNum);
		// 리턴값이 없기 때문에 이렇게 호출한다.
	}

}
