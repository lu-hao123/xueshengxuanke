package 学生选课;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener{
	JButton teacher = new JButton("老师");
	JButton student = new JButton("学生");
	login(){
		setSize(300,200);
		setTitle("用户选择");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());    //设置窗体为浮动布局
		add(teacher);
		add(student);    //将按钮加入窗体中
		validate();
		teacher.addActionListener(this);
		student.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==teacher) 
			new Teacher();
		if(e.getSource()==student)
			new Student();
	}
public static void main(String[] args) {
	login Login= new login();
}
}
