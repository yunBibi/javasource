package classTest;

public class Card {
	// 멤버 변수
	private String kind;   // 카드 모양 지정
	private int number;   // 카드 숫자 지정
	
//	int width;
//	int height;
	
	// 카드의 넓이와 높이는 고정된 속성이다.
	// static(정적) : 클래스에 고정된 멤버임
	//    			  객체를 생성하지 않고 사용함
	//                클래스가 메모리에 로드될 때 생성
	
	// 클래스 변수 (static~ )
	static int width = 10;
	static int height = 7;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	
	
	// static메소드 : 객체를 생성하지 않고 사용
	//              : 클래스가 메모리에 로드될 때 생성
	//              : static 메서드 안에서 인스턴스 멤버 사용 불가
	// static이 사용되는 곳 : 멤버변수, 메서드, 초기화블럭
	
	public static int getWidth() {
		// kind = "";   - 불가능
		// getNumber(); - 불가능
		
		//getHeight();  - 가능
		return width;
	}
	public static int getHeight() {
		return height;
	}
	
	
	
}
