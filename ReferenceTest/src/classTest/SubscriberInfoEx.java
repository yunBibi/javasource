package classTest;
public class SubscriberInfoEx {
	public static void main(String[] args) {
		SubscriberInfo info1 = new SubscriberInfo("홍길동", "hong123", "hong1234");
		SubscriberInfo info2 = new SubscriberInfo("성춘향", "sung123","sung1234","010-1234-5678","서울시 종로구");
		
		//  홍길동 전화번호 추가
		info1.setTel("010-5678-1234");   
		
		info2.setAdrr("서울시 성동구");
		
	}
}
 