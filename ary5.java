import java.util.*;
class ary5
{
public static void main(String args[])
{
int i,ele;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array element");
for(i=0;i<=9;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<=8;i++)
{
if(a[i]>=a[i+1])
{
ele=a[i];
a[i]=a[i+1];
a[i+1]=ele;
i=0;
}
}
for(i=0;i<=9;i++)
{
System.out.print(" "+a[i]);
}
}
}

