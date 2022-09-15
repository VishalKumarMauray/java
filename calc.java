import java.awt.event.*;
import java.awt.*;
import java.lang.String.*;
class calc implements ActionListener
{
Frame f1;
Float f;
int c;
TextField t1;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23;
String s1,s2,s3,s4,s5,length;
public calc()
{
f1=new Frame("Calculator");
f1.setLayout(null);
t1=new TextField();
t1.setBounds(30,80,330,80);
b1=new Button("");
b1.setBounds(30,180,58,30);
b2=new Button("CE");
b2.setBounds(96,180,58,30);
b3=new Button("C");
b3.setBounds(162,180,58,30);
b4=new Button("- sign");
b4.setBounds(228,180,58,30);
b5=new Button("root");
b5.setBounds(294,180,58,30);
b6=new Button("7");
b6.setBounds(30,230,58,30);
b7=new Button("8");
b7.setBounds(96,230,58,30);
b8=new Button("9");
b8.setBounds(162,230,58,30);
b9=new Button("/");
b9.setBounds(228,230,58,30);
b10=new Button("%");
b10.setBounds(294,230,58,30);
b11=new Button("4");
b11.setBounds(30,280,58,30);
b12=new Button("5");
b12.setBounds(96,280,58,30);
b13=new Button("6");
b13.setBounds(162,280,58,30);
b14=new Button("*");
b14.setBounds(228,280,58,30);
b15=new Button("1/x");
b15.setBounds(294,280,58,30);
b16=new Button("1");
b16.setBounds(30,330,58,30);
b17=new Button("2");
b17.setBounds(96,330,58,30);
b18=new Button("3");
b18.setBounds(162,330,58,30);
b19=new Button("-");
b19.setBounds(228,330,58,30);
b20=new Button("=");
b20.setBounds(294,330,58,80);
b21=new Button("0");
b21.setBounds(30,380,124,30);
b22=new Button(".");
b22.setBounds(162,380,58,30);
b23=new Button("+");
b23.setBounds(228,380,58,30);
f1.add(t1);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);
f1.add(b5);
f1.add(b6);
f1.add(b7);
f1.add(b8);
f1.add(b9);
f1.add(b10);
f1.add(b11);
f1.add(b12);
f1.add(b13);
f1.add(b14);
f1.add(b15);
f1.add(b16);
f1.add(b17);
f1.add(b18);
f1.add(b19);
f1.add(b20);
f1.add(b21);
f1.add(b22);
f1.add(b23);
f1.setSize(400,450);
f1.setVisible(true);
f1.setResizable(false);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
b17.addActionListener(this);
b18.addActionListener(this);
b19.addActionListener(this);
b20.addActionListener(this);
b21.addActionListener(this);
b22.addActionListener(this);
b23.addActionListener(this);
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
if(e1.getSource()==b2)
{

}
if(e1.getSource()==b3)
{

}
if(e1.getSource()==b4)
{

}
if(e1.getSource()==b5)
{
		
}
if(e1.getSource()==b6)
{
s3=t1.getText();
s4="7";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b7)
{
s3=t1.getText();
s4="8";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b8)
{
s3=t1.getText();
s4="9";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b9)
{

}
if(e1.getSource()==b10)
{

}
if(e1.getSource()==b11)
{
s3=t1.getText();
s4="4";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b12)
{
s3=t1.getText();
s4="5";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b13)
{
s3=t1.getText();
s4="6";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b14)
{

}
if(e1.getSource()==b15)
{

}
if(e1.getSource()==b16)
{
s3=t1.getText();
s4="1";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b17)
{
s3=t1.getText();
s4="2";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b18)
{
s3=t1.getText();
s4="3";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b19)
{

}
if(e1.getSource()==b20)
{

}
if(e1.getSource()==b21)
{
s3=t1.getText();
s4="0";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b22)
{
s3=t1.getText();
s4=".";
s5=s3+s4;
t1.setText(s5);	
}
if(e1.getSource()==b23)
{

}
}
public static void main(String args[])
{
calc f=new calc();
}
}