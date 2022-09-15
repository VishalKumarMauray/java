import java.util.*;
class ary5
{
public static void main(String args[])
{
int i,ele;
int c[]=new int[20];
int a[]=new int[10];
int b[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 array element");
for(i=0;i<=9;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Enter 2 array e");
for(i=0;i<=9;i++)
{
b[i]=sc.nextInt();
}
for(i=0;i<=9;i++)
{
c[i]=a[i];
c[i+10]=b[i];
}
for(i=0;i<=19;i++)
{
	System.out.print(" "+c[i]);
}
}
}

