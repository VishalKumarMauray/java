import java.util.*;
class factorial
{
public static void main(String args[])
{
int n,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
do
{
fact=fact*n;
n--;
}while(n>0);
System.out.println("Factorial="+fact);
}
}


