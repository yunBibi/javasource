package inheritance;

public class DMBCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 dmb방송 시작");
	}
	void turnOffDmb() {
		System.out.println("채널 "+channel+"번 dmb방송 종료");
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 "+channel+"번 변경");
	}
}
