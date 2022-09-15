import java.util.*;
class fibonacci
{
public static void main(String args[])
{
int c=1,a,b=2,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
System.out.print (c+" ");
System.out.print(b+" ");
while(a>=3)
{
sum=c+b;
c=b;
b=sum;
a--;
System.out.print(sum+" ");
}
}
}