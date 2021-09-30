package classTest;

public class GoodsStockEx2 {
	public static void main(String[] args) {
		
		GoodsStock2 product1 = new GoodsStock2("p12345", 30);
		// 아래와 같이 private이 걸린 속성을 직접 변경하려고 하면
		// The field GoodsStock2.code is not visible 이런 오류가 뜬다.
		// product1.code = "p12345";  
		// product1.stockNum = 30;
		
		// 멤버변수 초기화는 '생성자'로 시켜준다. 
		
		// 상품 판매 => 재고 감소
		product1.subtrackStock(15);
		
		// 반품 => 재고 증가
		// 메소드 호출 => 리턴 타입이 없으면 호출만 하면 됨
		product1.addStock(5);
		System.out.println(product1.getStockNum());
		
	}

}
