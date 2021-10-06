package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.Action;
import javax.swing.JButton;

public class PlusCalculator extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;

	// 추가분
	private Container container;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlusCalculator frame = new PlusCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PlusCalculator() {
		
		setTitle("\uB367\uC148 \uACC4\uC0B0\uAE30");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		num1 = new JTextField();
		panel.add(num1);
		num1.setColumns(10);
		num1.addActionListener(this);
		
		JLabel lblNewLabel = new JLabel("+");
		panel.add(lblNewLabel);
		
		num2 = new JTextField();
		panel.add(num2);
		num2.setColumns(10);
		num2.addActionListener(this);
		
		JLabel lblNewLabel_1 = new JLabel("=");
		panel.add(lblNewLabel_1);
		
		num3 = new JTextField();
		panel.add(num3);
		num3.setColumns(10);
		num3.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		panel_1.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("확인")) {  
			Action num1_1 = num1.getAction();
			
		} else {  
			System.out.println("덧셈을 취소합니다.");
		}
	}

}
