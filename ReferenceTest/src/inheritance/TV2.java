package inheritance;

public class TV2 {
		// - 속성(필드, 멤버변수, 프로퍼티) => 색상, 전원상태, 채널...
		private String color;  // red, black, blue...
		private boolean power;  // on/off
		private int channel;
		
//		public TV2() {
//			super();
//		}
		public TV2(String color, boolean power, int channel) {
			super();
			this.color = color;
			this.power = power;
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

		
		public String getColor() {
			return color;
		}



		public boolean isPower() {
			return power;
		}



		public int getChannel() {
			return channel;
		}
		
		
		
		
}
