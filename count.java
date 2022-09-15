import java.util.*;
class count
{
public static void main(String args[])
{
int a,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no.");
a=sc.nextInt();
while(a>0)
{
a=a/10;
count++;
}
System.out.println("no. of digits "+count);
}
}
