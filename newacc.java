import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class newacc 
{
JFrame f1;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
Choice c1,c2,c3,c4,c5,c6,c7;
JTextField t1,t2,t3,t4,t5,t6,t7;
JPasswordField p1,p2;
JButton b1;
public newacc()
{
f1=new JFrame("Create account");
f1.setLayout(null);
f1.setResizable(false);
l1=new JLabel("Name*");
l2=new JLabel("Date of birth*");
l3=new JLabel("Gender*");
l4=new JLabel("Email id:-");
l5=new JLabel("Mobile number*");
l6=new JLabel("Institute name");
l7=new JLabel("Qualification");
l8=new JLabel("Year of passing");
l9=new JLabel("Nearest test location");
l10=new JLabel("Enter password");
l11=new JLabel("Re-enter password");

c1=new Choice();
c1.add("mr.");
c1.add("mrs.");
c1.add("miss.");
c2=new Choice();
for(int i=01;i<32;i++)
{
c2.add(" "+i);
}
c3=new Choice();
c3.add("January");
c3.add("Februray");
c3.add("March");
c3.add("April");
c3.add("May");
c3.add("June");
c3.add("July");
c3.add("August");
c3.add("September");
c3.add("October");
c3.add("November");
c3.add("December");
c4=new Choice();
for(int i=1980;i<2031;i++)
{
c4.add(" "+i);
}
c5=new Choice();
c5.add("Male");
c5.add("Female");
c5.add("Other");
c6=new Choice();
c6.add("High school");
c6.add("Intermediate");
c6.add("Graduation");
c6.add("Post graduation");
c7=new Choice();
for(int i=1980;i<2031;i++)
{
c7.add(" "+i);
}

t1=new JTextField("first");
t2=new JTextField("middle");
t3=new JTextField("last");
t4=new JTextField();
t5=new JTextField();
t6=new JTextField();
t7=new JTextField();

p1=new JPasswordField();
p1.setEchoChar('*');
p2=new JPasswordField();
p2.setEchoChar('*');

b1=new JButton("Submit");

l1.setBounds(50,50,70,30);
c1.setBounds(50,80,80,60);
t1.setBounds(140,80,100,30);
t2.setBounds(250,80,100,30);
t3.setBounds(360,80,100,30);
l2.setBounds(50,130,150,30);
c2.setBounds(50,160,100,60);
c3.setBounds(170,160,100,60);
c4.setBounds(290,160,100,60);
l3.setBounds(50,200,70,30);
c5.setBounds(50,240,70,60);
l4.setBounds(50,280,100,30);
t4.setBounds(50,310,100,30);
l5.setBounds(50,350,100,30);
t5.setBounds(50,380,100,30);
l6.setBounds(50,420,100,30);
t6.setBounds(50,460,100,30);
l7.setBounds(50,500,100,30);
c6.setBounds(50,540,100,30);
l8.setBounds(50,580,100,30);
c7.setBounds(50,620,100,30);
l9.setBounds(50,660,150,30);
t7.setBounds(50,700,100,30);
l10.setBounds(50,740,100,30);
p1.setBounds(50,780,100,30);
l11.setBounds(50,820,150,30);
p2.setBounds(50,860,100,30);
b1.setBounds(250,860,100,30);

f1.add(l1);
f1.add(c1);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(l2);
f1.add(c2);
f1.add(c3);
f1.add(c4);
f1.add(l3);
f1.add(c5);
f1.add(l4);
f1.add(t4);
f1.add(l5);
f1.add(t5);
f1.add(l6);
f1.add(t6);
f1.add(l7);
f1.add(c6);
f1.add(l8);
f1.add(c7);
f1.add(l9);
f1.add(t7);
f1.add(l10);
f1.add(p1);
f1.add(l11);
f1.add(p2);
f1.add(b1);
f1.setSize(600,1000);
f1.setVisible(true);
}
public static void main(String a[])
{
newacc f1=new newacc();
}
}