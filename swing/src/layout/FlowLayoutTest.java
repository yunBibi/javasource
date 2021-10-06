package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/* FlowLayout : ������Ʈ�� ���ʿ��� ���������� ��ġ
 * 				������ ������ ������ �Ʒ��� ������
 * 				�⺻ ���̾ƿ��� BorederLayout�̱� ������ FlowLayout���� �����ؾ� �Ѵ�.
 */

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		setTitle("BorderLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ���̾ƿ� ����2. ���� �������� contentPane ��������
		Container container = getContentPane();
		// contentPane�� ���ο� ���̾ƿ� ����
		container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		
		JButton btn1 = new JButton("��ư1");
		add(btn1);

		JButton btn2 = new JButton("��ư2");
		add(btn2);

		JButton btn3 = new JButton("��ư3");
		add(btn3);

		JButton btn4 = new JButton("��ư4");
		add(btn4);

		JButton btn5 = new JButton("��ư5");
		add(btn5);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutTest f = new FlowLayoutTest();
	}

}
