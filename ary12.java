import java.util.*;
class ary12
{
public static void main(String args[])
{
int i,j;
int a[][]=new int[4][4];
int b[][]=new int[4][4];
int c[][]=new int[4][4];
Scanner sc=new Scanner(System.in);
System.out.println("2d array\nEnter 1 array element");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter 2 array element");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("sum of both matrix");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
System.out.print(" "+c[i][j]);
}
System.out.println();
}
}
}