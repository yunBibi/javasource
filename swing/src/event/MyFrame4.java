package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener {
	private Container container;
	public MyFrame4() {
		setTitle("프레임 배경색 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		container = getContentPane();
		container.setLayout(new FlowLayout());
		// container.setBackground(Color.BLUE);

		// 버튼 2개 생성
		JButton btn1 = new JButton("노랑");
		btn1.addActionListener(this);

		JButton btn2 = new JButton("빨강");
		btn2.addActionListener(this);

		add(btn1);
		add(btn2);

		setBounds(200, 100, 300, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();   // ActionCommand <- 노랑 or 빨강
		
		if(cmd.equals("노랑")) {  // 프레임 배경색을 노랑색으로 변경
			container.setBackground(Color.YELLOW);
		} else {  // 배경색을 빨강색으로 변경
			container.setBackground(Color.RED);
		}
	}

	public static void main(String[] args) {

	}

}
