import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class MyFrame1 implements ActionListener
{
JFrame f1;
JButton b1,b2,b3;
public MyFrame1()
{
f1=new JFrame("Regestration Form");
f1.setLayout(null);
b1=new JButton("RED");
b2=new JButton("GREEN");
b3=new JButton("OK");
b1.setBounds(50,50,70,30);
b2.setBounds(50,120,70,30);
b3.setBounds(50,180,70,30);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.setSize(600,600);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
f1.setBackground(Color.RED);
}
if(e.getSource()==b2)
{
f1.setBackground(Color.GREEN);	
}
if(e.getSource()==b3)
{
b3.setLabel("CANCEL");
}
}
public static void main(String a[])
{
MyFrame1 m1=new MyFrame1();
}
}