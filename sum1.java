import java.awt.event.*;
import java.awt.*;
class sum1 implements ActionListener
{
Frame f1;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3;
public sum1()
{
f1=new Frame("sum");
f1.setLayout(null);
l1=new Label("value of a");
t1=new TextField();
l1.setBounds(50,50,70,30);
t1.setBounds(140,50,70,30);
l2=new Label("value of b");
t2=new TextField();
l2.setBounds(50,100,70,30);
t2.setBounds(140,100,70,30);
l3=new Label("result ");
t3=new TextField();
l3.setBounds(50,150,70,30);
t3.setBounds(140,150,70,30);
b1=new Button("sum");
b1.setBounds(50,200,70,30);
b2=new Button("sub");
b2.setBounds(140,200,70,30);
b3=new Button("mul");
b3.setBounds(230,200,70,30);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.setSize(600,600);
f1.setVisible(true);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f1.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
	System.exit(0);
}
});
}
public void actionPerformed(ActionEvent e1)
{
if(e1.getSource()==b1)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a+b;
t3.setText(String.valueOf(c));
}
if(e1.getSource()==b2)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a-b;
t3.setText(String.valueOf(c));
}
if(e1.getSource()==b3)
{
int a,b,c;
a=Integer.parseInt(t1.getText());
b=Integer.parseInt(t2.getText());
c=a*b;
t3.setText(String.valueOf(c));
}
}
public static void main(String args[])
{
sum1 f1=new sum1();
}
}