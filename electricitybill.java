class electricitybill
{
public static void main(String args[])
{
int unit;
float bill;
unit=Integer.parseInt(args[0]);
if(unit<100)
{
bill=unit*1.5f;
System.out.print("Bill="+bill);
}
else
{
bill=unit*3;
System.out.print("Bill="+bill);
}
}
}
