import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class insert extends Frame implements ActionListener
{
JFrame f1;
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2,t3,t5,t4,t6;
JButton b1,b2;
public insert()
{
f1=new JFrame("insert the data");
f1.setLayout(null);
l1=new JLabel("First name");
t1=new JTextField();
l1.setBounds(50,50,70,30);
t1.setBounds(140,50,140,30);
l2=new JLabel("Last name");
t2=new JTextField();
l2.setBounds(50,100,70,30);
t2.setBounds(140,100,140,30);
l3=new JLabel("Qualification");
t3=new JTextField();
l3.setBounds(50,150,70,30);
t3.setBounds(140,150,140,30);
l4=new JLabel("Email id");
t4=new JTextField();
l4.setBounds(50,200,70,30);
t4.setBounds(140,200,140,30);
l5=new JLabel("Contact");
t5=new JTextField();
l5.setBounds(50,250,70,30);
t5.setBounds(140,250,140,30);
l6=new JLabel("Address");
t6=new JTextField();
l6.setBounds(50,300,70,30);
t6.setBounds(140,300,140,30);

b1=new JButton("Submit");
b2=new JButton("Back");
b1.setBounds(50,350,100,30);
b2.setBounds(180,350,100,30);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);
f1.add(l4);
f1.add(t4);
f1.add(l5);
f1.add(t5);
f1.add(l6);
f1.add(t6);
f1.add(b1);
f1.add(b2);
f1.setSize(600,600);
f1.setVisible(true);
b1.addActionListener(this);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		Connection conn=null;
		Statement sta=null;
		try
		{
			System.out.println("aaaaaaaaaa");
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("bbbbbbb");
			conn=DriverManager.getConnection("jdbc:odbc:kcmt");
			System.out.println("bbbbbbbbbbbbbbb");
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			String s4=t4.getText();
			String s5=t5.getText();
			String s6=t6.getText();
			sta=conn.createStatement();
			sta.executeUpdate("insert * into emp values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')");
			System.out.println("inserted");
		}
		catch(Exception e1)
		{
		}
	}
	if(e.getSource()==b2)
	{
		MenuExample m=new MenuExample();
		f1.setVisible(false);
	}
}

public static void main(String args[])
{
insert i=new insert();
}
}