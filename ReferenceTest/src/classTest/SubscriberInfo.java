package classTest;
public class SubscriberInfo {
		// �Ӽ� - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ�
	private String name;
	private String id;
	private String pw;
	private String tel;
	private String adrr;
	
	
	// ������ - �̸�, ���̵�, �н����常 �ʱ�ȭ�� �� �� ��ü ����
	//        - �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ� �ʱ�ȭ�� �� ��ü ����
	public SubscriberInfo(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public SubscriberInfo(String name, String id, String pw, String tel, String adrr) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.adrr = adrr;
	}
	
	// ��� - ��й�ȣ ����, ��ȭ��ȣ ����, �ּ� ����
	// setter �޼ҵ�
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public void setAdrr(String adrr) {
		this.adrr = adrr;
	}
}
