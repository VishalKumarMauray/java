import java.util.*;
class prime
{
public static void main(String args[])
{
int i,m=0,f=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
m=a/2;
if(a==1||a==0)
{
System.out.println("not a prime number");
}
else
{
for(i=2;i<=m;i++)
{
if(a%i==0)
{
System.out.println("not a prime number");
f=1;
break;
}
}
if(f==0)
{
System.out.println("prime number");
}
}
}
}