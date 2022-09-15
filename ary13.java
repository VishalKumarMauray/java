import java.util.*;
class ary13
{
public static void main(String args[])
{
int i,j;
int a[][]=new int[4][4];
Scanner sc=new Scanner(System.in);
System.out.println("2d array\nEnter array element");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("transpose of a matrix");
for(i=0;i<=3;i++)
{
for(j=0;j<=3;j++)
{
System.out.print(" "+a[j][i]);
}
System.out.println();
}
}
}
