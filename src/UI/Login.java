package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Login extends JFrame{
	String id;
	String pw;
	
	JLabel l_id;
	JLabel l_pw;
	JTextField tf_id;
	JTextField tf_pw;
	
	JButton b_login;
	JButton b_join;
	
	JPanel p1;
	JFrame frame;
	
	
	public void start() {
		
		setTitle("Owl");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		l_id=new JLabel();
		l_id.setText("ID");
		
		l_pw = new JLabel();
		l_pw.setText("PW");
		
		tf_id = new JTextField();
		tf_id.setSize(50, 100);
		
		tf_pw = new JTextField();
		tf_pw.setSize(50, 100);
		
		b_login = new JButton(" 로그인 ");
		
		
		b_join = new JButton(" 회원가입 ");
		
		
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2));
		p1.setSize(500, 500);
		
		frame = new JFrame();
		frame.setSize(500, 500);
		
//		frame.setLayout(new BorderLayout(4, 4));
		p1.add(l_id);
		p1.add(tf_id);
		p1.add(l_pw);
		p1.add(tf_pw);
		p1.add(b_login);
		p1.add(b_join);
		frame.add(p1);
		
		
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
