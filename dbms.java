import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class dbms extends JFrame implements ActionListener
{
JFrame f1;
JLabel l1,l2;
JTextField t1;
JPasswordField t2;
JButton b1,b2,b3;
public dbms()
{
f1=new JFrame("Login Form");
f1.setLayout(null);
f1.setResizable(false);
l1=new JLabel("User name");
t1=new JTextField();
l1.setBounds(50,50,70,30);
t1.setBounds(140,50,140,30);
l2=new JLabel("Password");
t2=new JPasswordField();
t2.setEchoChar('*');
l2.setBounds(50,100,70,30);
t2.setBounds(140,100,140,30);
b1=new JButton("Submit");
b2=new JButton("Reset");
b3=new JButton("create new account");
b1.setBounds(80,150,70,30);
b2.setBounds(180,150,70,30);
b3.setBounds(80,200,170,30);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.setSize(600,600);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
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
			conn=DriverManager.getConnection("jdbc:odbc:bca");
			System.out.println("cccccccc");
			String s1=t1.getText();
			String s2=t2.getText();
			sta=conn.createStatement();
			sta.executeUpdate("insert into emp1 values('"+s1+"','"+s2+"')");
			System.out.println("inserted");
		}
		catch(Exception e1)
		{
		}
	}
	if(e.getSource()==b2)
	{
	    t1.setText(null);
	    t2.setText(null);
	}
	if(e.getSource()==b3)
	{
		newacc a=new newacc();
	}
}

public static void main(String args[])
{
dbms d1=new dbms();
}
}