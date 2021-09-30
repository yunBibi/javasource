package classTest;

public class GoodsStock2 {
	// 속성 : 상품코드(p12345), 재고수량(100개)
	
	private String code;
	private int stockNum;
	// private : 클래스 외부에서 속성을 직접 변경하는 것은 안됨
	
	// 멤버변수 초기화는 '생성자'로 시켜준다. 
	// 기본 생성자
	GoodsStock2(){}
			
	// 생성자 오버로딩
	GoodsStock2(String code, int stockNum){
		this.code = code;
		this.stockNum = stockNum;
	}
	
	void addStock(int amount) {
		stockNum += amount;
	} 
	
	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음), 재고수량 감소(입력값 수량, 출력값은 현재 재고수량 리턴)
	int subtrackStock (int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
	// 현재 재고 수량을 리턴하는 기능
	int getStockNum(){
		return stockNum;
	}
	
}
