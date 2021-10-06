package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {

	public FrameTest3() {
		setTitle("My Frame");
		setSize(300,300);
		
		JButton btn1 = new JButton("��ư1");
		add(btn1, BorderLayout.EAST);
		
		JButton btn2 = new JButton("��ư2");
		add(btn2, BorderLayout.SOUTH);
		
		JButton btn3 = new JButton("��ư3");
		add(btn3, BorderLayout.WEST);
		
		JButton btn4 = new JButton("��ư4");
		add(btn4, BorderLayout.NORTH);
		
		JButton btn5 = new JButton("��ư5");
		add(btn5, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();
	}

}
