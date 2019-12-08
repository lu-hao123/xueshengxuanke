package 学生选课;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Student extends JFrame implements ActionListener{
	JButton login1 = new JButton("登录");
	JButton login2 = new JButton("注册");
	JLabel id = new JLabel("学号：");
	JLabel password = new JLabel("密码：");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	
	Student(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		add(id);add(jtf1);
		add(password);add(jtf2);
		add(login1);add(login2);
		validate();
		login1.addActionListener(this);;
		login2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String s1 = jtf1.getText();
		String s2 = jtf2.getText();
		//进行判定，若学号或密码错误，则不予通过
		if(e.getSource() ==login1&&s1.equals("1")&&s2.equals("12345")) {
			new caozuo();//显示选课界面
		} 
		else if(e.getSource()==login2) {
			new register();
			}
		else {
			JOptionPane.showMessageDialog(null, "学号或密码错误，请重新输入");
		}
		
		
	}
	public static void main(String[] args) {
		Student student= new Student();
	}
}
