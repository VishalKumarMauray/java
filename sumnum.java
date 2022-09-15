class sumnum
{
public static void main(String args[])
{
int n,rem,sum=0;
n=Integer.parseInt(args[0]);
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("sum of the number="+sum);
}
}