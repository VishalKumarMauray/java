import java.awt.event.*;
import java.awt.*;
class MyFrame implements ActionListener
{
Frame f1;
Button b1,b2,b3;
public MyFrame()
{
f1=new Frame("Regestration Form");
f1.setLayout(null);
b1=new Button("RED");
b2=new Button("GREEN");
b3=new Button("OK");
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
MyFrame m1=new MyFrame();
}
}