package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {

	private JTextField num1, num2, result;

	public SimpleCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("덧셈 계산기");

		// 상단 부착 패널 생성
		JPanel top = new JPanel();

		num1 = new JTextField(10);
		top.add(num1);

		JLabel op = new JLabel("+");
		top.add(op);

		num2 = new JTextField(10);
		top.add(num2);

		JLabel op2 = new JLabel("=");
		top.add(op2);

		result = new JTextField(10);
		top.add(result);

		add(top, BorderLayout.NORTH);

		JPanel bottom = new JPanel();

		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(this);

		JButton btnReset = new JButton("취소");
		btnReset.addActionListener(this);

		bottom.add(btnOk);
		bottom.add(btnReset);

		add(bottom, BorderLayout.CENTER);

		setSize(450, 150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("확인")) {
			// 확인 버튼 클릭
			// num1, num2에 들어있는 값 가져오기
			// 결과를 result에 보여주기

			try {
				int op1 = Integer.parseInt(num1.getText());
				int op2 = Integer.parseInt(num2.getText());

				int total = op1 + op2;
				// result.setText(total + "");
				result.setText(String.valueOf(total));

			} catch (Exception e2) {
				// 개발할 때 예외 발생 단계를 출력
				// e2.printStackTrace(); 
				
				// 사용자에게 메시지출력
				JOptionPane.showMessageDialog(getParent(), "입력값을 확인해 주세요.");
			}

		} else {
			// 취소 버튼 클릭
			// num1, num2, result에 현재 들어있는 값을 지우기
			num1.setText("");
			num2.setText("");
			result.setText("");

		}

	}

	public static void main(String[] args) {
		new SimpleCalc();
	}

}
