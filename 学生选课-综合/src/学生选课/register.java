package 学生选课;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class register extends JFrame implements ActionListener{
	JLabel id = new JLabel("请输入学号：");
	JLabel name = new JLabel("请输入姓名：");
	JLabel password = new JLabel("请输入密码：");
	JTextField jtf1 = new JTextField(15); 
	JTextField jtf2 = new JTextField(15); 
	JTextField jtf3 = new JTextField(15); 
	JButton r = new JButton("注册");
	
	register(){
		setTitle("注册");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(id);add(jtf1);
		add(name);add(jtf2);
		add(password);add(jtf3);
		add(r);
		r.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==r) {
			JOptionPane.showMessageDialog(null, "注册成功！");
			new caozuo();
			/*
			 * 将注册信息转化成字符，写入txt中
			 */
			Stu student = new Stu(jtf1.getText(),jtf2.getText(),jtf3.getText());
			StringBuffer s = new StringBuffer();
			s.append(student);
			try {
				//打开文件，并写入注册的信息
				FileWriter fw=new FileWriter("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt",true);
				fw.write(s.toString());
				fw.close();
				} 
			catch (IOException n) 
				{
				n.printStackTrace();
				}
			
			}
		}
		
	public static void main(String[] args) {
		register r = new register();
	}
	
}
