import java.awt.*;
import java.awt.event.*;
class GUI
{
Frame f1;
TextField t1;
Choice c1;
public GUI()
{
f1=new Frame("Regestration Form");
f1.setLayout(null);
t1=new TextField(50);
t1.setBounds(140,170,70,30);
c1=new Choice();
c1.add("agra");
c1.add("bareilly");
c1.setBounds(170,200,100,100);
f1.add(t1);
f1.add(c1);
f1.setSize(600,600);
f1.setVisible(true);
}
public static void main(String a[])
{
GUI m1=new GUI();
}
}