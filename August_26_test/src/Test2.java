// �ּ�(comment) <- ������ �� ���ܵȴ�. �ڹ� ������ ��� ���� ��� �ȴ�. 

/*
 * ������ �ּ�
 * ���� �ּ� �����̴�. 
 * Ȥ�� �ڵ� �߰��� �ּ��� ���� ������ Ȱ�� �����ϴ�. 
 *  => ���� ���� �ּ��̶�� ���� ��
 */

/**
 * �޴��� ���� �� ����ϴ� �ּ�
 * 
 * @author hp87
 *
 */

// ctrl + /: �ּ����� ó���� �� �ִ� ����Ű(�ּ��� ������ ���� ����)
// ctrl + shift + / : ��� ���� �� ��� ��, ���� �ּ�ó�� ������
// ctrl + f11 : ����
// ctrl + shift + +/- (numpad) : ����ũ�� ����
// ctrl + shift + f : �ҽ��� �������ִ� ������ ����Ű  (������ ���� �ҽ� ����)
// ctrl + alt + ��/�Ʒ� : �� ����
// ctrl + d : �� ��ü ����

// alt + ��/�Ʒ� : ��ġ �� �̵�

// ; - semi-colo �� ������ �������� ǥ����
// : - colon �ݷ�
// \ - back slash : ��(won�޷�) ǥ��
// | - pipi/bar : �پ ���� ���� �ִµ� �̴� ��Ʈ �����̴�.

public class Test2 {
	// main, ctrl+space
	public static void main(String[] args) throws InterruptedException {
		// syso, ctrl+space
		System.out.println("���� ��"); // �ܼ�â�� ����� �� ���
		System.out.println("���� ��");
		System.out.println("���� ��");
	
		Thread.sleep(5000); // ���α׷��� ��� ���ߴ� �ڵ� (1000=1��)
	}

}

// ��Ŭ�� -> ��������(exprot) 
// .jar : Java Archive ���� ���·� �� �� �����س��� �ڹ� ��������
// �����Ű�� �� : �޸��忡 java -jar  test2.jar -> �ٸ� �̸����� ����(.bat Ȯ���� & �������)
