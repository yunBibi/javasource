package classTest;

public class TVEx2 {
	public static void main(String[] args) {
		
		// TV��� Ŭ������ ����ϰ� �ʹٸ� ����� �������� �ؾ� �Ѵ�. 
		// ��ü ����, ����
		TV2 tv1 = new TV2("black", 8);   // stack�� tv�� �ּҰ��� ����ǰ�, tv�� ����Ű�� ������ heap�� ����Ǵ� ���� 
		TV2 tv2 = new TV2();
		
		
		// ��ü ����
		
		System.out.println("ä�� ���� : "+tv1.channel);
		System.out.println("ä�� ���� : "+tv2.channel);
	}

}
