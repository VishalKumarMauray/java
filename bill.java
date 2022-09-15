class bill
{
public static void main(String args[])
{
int pur;
float bill,dis;
pur=Integer.parseInt(args[0]);
if(pur>2000)
{
dis=pur*0.2f;
bill=pur-dis;
System.out.println("Discount="+dis+"\nBill"+bill);
}
else
{
System.out.println("no discount");
}
}
}