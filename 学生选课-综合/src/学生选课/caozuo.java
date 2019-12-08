package 学生选课;
/*
 * 该部分主要用于让学生选择是选课还是输出信息
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class caozuo extends JFrame implements ActionListener{
	JButton Choosing = new JButton("选      课");
	JButton Printing = new JButton("输出信息");
	JLabel wel = new JLabel("欢迎！请进行以下操作");
	
	caozuo(){
		setTitle("学生");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new BorderLayout());
		add("North",wel);
		add("West",Choosing);add("East",Printing);
		validate();
		Choosing.addActionListener(this);;
		Printing.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Choosing) {
			new Choosing();
		}
		if(e.getSource()==Printing) {
			try {
				Runtime.getRuntime().exec("C:\\Users\\Thinkpad\\Desktop\\学生选课.txt");
				} catch (Exception e1) {
					System.out.println("txt打开失败！");
					e1.printStackTrace();
				}
				} 
	   
	}
	public static void main(String[] args) {
		caozuo c = new caozuo();
	}
}
