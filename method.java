import java.util.*;
class method
{
public void add(int x,int y)
{
	int a,b,c;
a=x;
b=y;
c=a+b;
System.out.println(c);
}
public void add(int x,int y,int z)
{
	int a,b,c,d;
a=x;
b=y;
d=z;
c=a+b+d;
System.out.println(c);
}
public void add(int x)
{
	int a;
a=x;
System.out.println(a);
}
public void add(float x,float y)
{
	float a,b,c;
a=x;
b=y;
c=a+b;
System.out.println(c);
}
public void add(float x,float y,float z)
{
	float a,b,c,d;
a=x;
b=y;
d=z;
c=a+b+d;
System.out.println(c);
}
public static void main(String args[])
{
method m=new method();
m.add(101);
m.add(10,25);
m.add(10,25,65);
m.add(10f,15.9f);
m.add(10.56f,56.8f,69.3f);
}
}