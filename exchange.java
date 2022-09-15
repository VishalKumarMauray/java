import java.util.*;
class exchange
{
int a,b,c;
public void swap(int x,int y)
{
a=x;
b=y;
c=a;
a=b;
b=c;
System.out.println(" after swap "+a+" "+b);
}
public static void main(String args[])
{
int m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter two number");
m=sc.nextInt();
n=sc.nextInt();
exchange ex=new exchange();
ex.swap(m,n);
}
}
