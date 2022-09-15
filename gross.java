import java.util.*;
class gross
{
public static void main(String args[])
{
int sal;
float ta,da,hra,grosssal;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the salary");
sal=sc.nextInt();
ta=sal*0.2f;
da=sal*0.25f;
hra=sal*0.15f;
grosssal=ta+da+hra+sal;
System.out.println("Gross salary="+grosssal);
}
}


