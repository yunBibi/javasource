package shop;

// �����߻�ȭ <- ����ʵ常 ����, �޼ҵ�� �߻� �޼ҵ常 ����
// jdk8�� �Ǹ鼭 default, static�� �����ϱ�� ������
// �߻� �޼ҵ常 ������ �� �ٲ��� �ʾұ� ������ ��Ģ��� ó�����ش�.

public interface iShop {
	void setTitle(String title);   // �տ� public abstract�� �����Ǿ���
	void genUser();
	void genProduct();
	void start();
}
