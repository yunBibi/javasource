package classTest;

public class TV2 {
		// - �Ӽ�(�ʵ�, �������, ������Ƽ) => ����, ��������, ä��...
		String color;  // red, black, blue...
		boolean power;  // on/off
		int channel;
		
		TV2(){
			// default(�⺻)������: ��ȣ �ȿ� �ƹ��͵� ������� ���� �⺻ ������
			// ��������� �����ڰ� �ϳ��� ������� �ʾҴٸ�, �����Ϸ��� �ڵ����� ������
		}
		
		// �����ڰ� �� �� �̻� ����: �����ε�
		TV2(String color, int channel){
			this.color = color;
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
}
