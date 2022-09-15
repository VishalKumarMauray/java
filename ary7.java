import java.util.*;
class ary7
{
public static void main(String args[])
{
int i,j,sum=0;
int a[][]=new int[4][4];
Scanner sc=new Scanner(System.in);
System.out.println("2d array\nEnter array element");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
a[i][j]=sc.nextInt();
if(i>=j)
{
sum=sum+a[i][j];
}
}
}
System.out.println("sum of left triangle elements="+sum);
}
}

