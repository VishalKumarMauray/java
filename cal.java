import java.util.*;
class cal
{
	public int a,b,c;
public void add(int x,int y)
{
	//int a,b,c;
a=x;
b=y;
c=a+b;
System.out.println("sum="+c);
}
public void sub(int x,int y)
{
	//int a,b,c;
a=x;
b=y;
c=a-b;
System.out.println("sub="+c);
}
public void mul(int x,int y)
{
	//int a,b,c;
a=x;
b=y;
c=a*b;
System.out.println("mul="+c);
}
public void div(int x,int y)
{
	//int a,b,c;
a=x;
b=y;
c=a/b;
System.out.println("div="+c);
}
public static void main(String args[])
{
int ch,a,b;
cal cl=new cal();
Scanner sc=new Scanner(System.in);
System.out.println("enter two number");
a=sc.nextInt();
b=sc.nextInt();
System.out.print("1=addition\n2=substraction\n3=multiplication\n4=divition\n");
ch=sc.nextInt();
switch(ch)
{
case 1:
cl.add(a,b);
break;
case 2:
cl.sub(a,b);

break;
case 3:
cl.mul(a,b);
break;
case 4:
cl.div(a,b);
break;
default:System.out.println("wrong choice");
break;
}
}
}


