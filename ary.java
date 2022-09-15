import java.util.*;
class ary
{
public static void main(String args[])
{
int i;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array element");
for(i=0;i<=9;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<=9;i++)
{
System.out.print(a[i]+" ");
}
}
}