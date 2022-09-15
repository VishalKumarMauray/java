class handsome
{
public static void main(String args[])
{
int a,n,sum=0,rem;
n=Integer.parseInt(args[0]);
a=n%10;
n=n/10;
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
if(sum==a)
{
System.out.println("number is handsome");
}
else
{
System.out.println("number is not handsome");
}
}
}