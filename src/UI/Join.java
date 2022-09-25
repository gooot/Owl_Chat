package UI;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Join extends JFrame {
	
	
	JLabel l_id;
	JLabel l_pw;
	JLabel l_nickname;
	JTextField tf_id;
	JTextField tf_nickname;
	JTextField tf_pw;
	JTextField tf_pw2;
	JButton b_checkId;
	JButton b_Join;
	JButton b_Cancel;
	JPanel p1;
	JFrame frame;
	
	public void start() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		l_nickname = new JLabel(" 닉네임 ");
		l_id= new JLabel(" id ");
		l_pw= new JLabel(" pw ");
		
		tf_nickname = new JTextField();
		tf_nickname.setSize(50, 100);
		tf_id= new JTextField();
		tf_id.setSize(50, 100);
		tf_pw= new JTextField();
		tf_pw.setSize(50, 100);
		tf_pw2 = new JTextField();
		tf_pw2.setSize(50, 100);
		
		b_checkId = new JButton(" 중복확인 ");
		b_Join = new JButton("회원가입");
		b_Cancel = new JButton(" 취소 ");
		
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 4));
		p1.setSize(500, 500);
		
		
		p1.add(l_nickname);
		p1.add(tf_nickname);
		
		p1.add(l_id);
		p1.add(l_pw);
		p1.add(tf_id);
		p1.add(tf_pw);
		p1.add(tf_pw2);
		p1.add(b_checkId);
		p1.add(b_Join);
		p1.add(b_Cancel);
		
		
		
		frame = new JFrame();
		frame.add(p1);
		frame.setSize(500, 500);
		
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}