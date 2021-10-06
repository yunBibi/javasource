package layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MixLayout extends JFrame {

	public MixLayout() {
		setTitle("���� ���̾ƿ� ȥ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel1 = new JPanel(); // FlowLayout�� �⺻
		panel1.setBackground(Color.orange);

		JButton btn1 = new JButton("��ư1");
		btn1.setBackground(Color.magenta);

		panel1.add(btn1);
		panel1.add(new JButton("��ư2"));
		panel1.add(new JButton("��ư3"));

		add(panel1, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new BorderLayout());

		panel2.add(new JButton("Swing"));
		panel2.setBackground(Color.black);
		add(panel2, BorderLayout.CENTER);

		setSize(300, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
		new MixLayout();
	}

}
