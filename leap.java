import java.util.*;
class leap
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
a=sc.nextInt();
if(a%4==0)
{
System.out.println("leap year");
}
if(a%4!=0)
{
System.out.println("not a leap year");
}
}
}







