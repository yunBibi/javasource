package classTest;

public class TVEx2 {
	public static void main(String[] args) {
		
		// TV라는 클래스를 사용하고 싶다면 선언과 생성부터 해야 한다. 
		// 객체 선언, 생성
		TV2 tv1 = new TV2("black", 8);   // stack에 tv의 주소값이 저장되고, tv가 가리키는 내용이 heap에 저장되는 선언 
		TV2 tv2 = new TV2();
		
		
		// 객체 조작
		
		System.out.println("채널 상태 : "+tv1.channel);
		System.out.println("채널 상태 : "+tv2.channel);
	}

}
