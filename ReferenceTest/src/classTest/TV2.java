package classTest;

public class TV2 {
		// - 속성(필드, 멤버변수, 프로퍼티) => 색상, 전원상태, 채널...
		String color;  // red, black, blue...
		boolean power;  // on/off
		int channel;
		
		TV2(){
			// default(기본)생성자: 괄호 안에 아무것도 들어있지 않은 기본 생성자
			// 명시적으로 생성자가 하나도 선언되지 않았다면, 컴파일러가 자동으로 생성함
		}
		
		// 생성자가 한 개 이상 사용됨: 오버로딩
		TV2(String color, int channel){
			this.color = color;
			this.channel = channel;
		}
		
		
		// - 동작(메소드) => 채널 변경, 전원을 켜다, 끄다...

		// channelUp가 해야 하는 작업 작성
		void channelUp() {
			channel ++;
			
		}
		// channelDown이 해야 하는 작업 작성
		void channelDown() {
			channel --;
		}
		
		// Power가 해야 하는 작업 작성
		void power() {
			power = !power;
		}
}
