package classTest;

public class GoodsStock {
	// 속성 : 상품코드(p12345), 재고수량(100개)
	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음), 재고수량 감소(입력값 수량, 출력값은 현재 재고수량 리턴)
	
	String code;
	int stockNum;
	
	void addStock(int amount) {
		stockNum += amount;
	} 
	
	int subtrackStock (int amount) {
		if (stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}
	
}
