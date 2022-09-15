class construct1
{
int id;
String name;
public construct1(int i,String n)
{
id=i;
name=n;
}
public static void main(String args[])
{
construct1 c1=new construct1(103,"vishal");
System.out.println("id="+c1.id+"\n"+"name="+c1.name);
}
}