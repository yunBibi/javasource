package inheritance;

public class TV {
		// - �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä��...
		String color;  // red, black, blue...
		boolean power;  // on/off
		int channel;
		
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
}
