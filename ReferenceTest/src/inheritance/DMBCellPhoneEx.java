package inheritance;

public class DMBCellPhoneEx {
	public static void main(String[] args) {
		DMBCellPhone phone = new DMBCellPhone();
		
		phone.color="black";
		phone.model="�ڹ���";
		phone.channel=7;
		
		phone.powerOn();
		phone.turnOnDmb();
		phone.changeChannelDmb(8);
		phone.turnOffDmb();
		phone.bell();
		phone.sendVoice("�ȳ��ϼ���");
		phone.receiveVoice("�ݰ�����");
		phone.hangUp();
	}
}
