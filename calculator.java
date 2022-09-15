import java.util.*;
class calculator
{
public static void main(String args[])
{
int a,b,c,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice\n1=addition\n2=substraction\n3=multiplication\n4=division");
d=sc.nextInt();
if(d==1)
{
System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
c=a+b;
System.out.println("sum="+c);
}
if(d==2)
{
System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
c=a-b;
System.out.println("sub="+c);
}
if(d==3)
{
System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
c=a*b;
System.out.println("mul="+c);
}
if(d==4)
{
System.out.println("Enter the value of a");
a=sc.nextInt();
System.out.println("Enter the value of b");
b=sc.nextInt();
c=b/a;
System.out.println("quatient="+c);
c=b%a;
System.out.println("remender="+c);
}
}
}