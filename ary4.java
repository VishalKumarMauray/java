import java.util.*;
class ary4
{
public static void main(String args[])
{
int i,lar=0;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter array element");
for(i=0;i<=9;i++)
{
a[i]=sc.nextInt();
if(a[i]>lar)
{
lar=a[i];
}
}
System.out.print("largest number="+lar);
}
}