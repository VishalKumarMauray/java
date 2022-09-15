class loop9
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<=4;i++)
{
for(j=4;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i+j;k++)
{
System.out.print("@");
k++;
}
for(k=2;k<=i+j;k++)
{
System.out.print("@");
k++;
}
System.out.println();
}
}
}
