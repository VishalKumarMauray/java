import java.util.*;
class ary1
{
public static void main(String args[])
{
int i,sum=0;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array element");
for(i=0;i<=9;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.print("sum="+sum);
}
}