package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// GridLayout : ���ڸ��

public class GridLayoutTest1 extends JFrame {

	public GridLayoutTest1() {
		setTitle("GridLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ���̾ƿ� ����
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 4));

		// ��ư 10�� ����
		for (int i = 0; i < 12; i++) {
			JButton btn = new JButton(i + "");
			add(btn);

		}

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutTest1();
	}

}
