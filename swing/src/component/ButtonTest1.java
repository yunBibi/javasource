package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton left,middle,right;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("Disable middle button");
		left.setActionCommand("disable");
		left.addActionListener(this);
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		left.setMnemonic('D');
		contentPane.add(left);
		
		middle = new JButton("Middle Button");
		middle.setActionCommand("middle");
		middle.addActionListener(this);
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		middle.setMnemonic('M');
		contentPane.add(middle);
		
		right = new JButton("Enable middle Button");
		right.setActionCommand("enable");
		right.addActionListener(this);		
		right.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		right.setMnemonic('E');
		contentPane.add(right);
		
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//System.out.println(cmd);
		
		
		// disable ��ư Ŭ���� �Ǹ�
		if(cmd.equals("disable")) {
			// middle ��ư ��Ȱ��ȭ
			middle.setEnabled(false);
			// disable ��ư ��Ȱ��ȭ
			left.setEnabled(false);
			// enable ��ư Ȱ��ȭ
			right.setEnabled(true);
		}else { // enable ��ư Ŭ��		
		
			// middle ��ư Ȱ��ȭ
			middle.setEnabled(true);
			// disable ��ư Ȱ��ȭ
			left.setEnabled(true);
			// enable ��ư ��Ȱ��ȭ
			right.setEnabled(false);
		}
	}

}