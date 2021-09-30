package inheritance;

public class TV2 {
		// - �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä��...
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

		// - ����(�޼ҵ�) => ä�� ����, ������ �Ѵ�, ����...
		// channelUp�� �ؾ� �ϴ� �۾� �ۼ�
		void channelUp() {
			channel ++;
			
		}
		// channelDown�� �ؾ� �ϴ� �۾� �ۼ�
		void channelDown() {
			channel --;
		}
		
		// Power�� �ؾ� �ϴ� �۾� �ۼ�
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
