import java.util.*;
class employee
{
public void disinfo(int id,String name)
{
System.out.println("id="+id);
System.out.println("name="+name);
}
public static void main(String args[])
{
	int id;
	String name;
Scanner sc=new Scanner(System.in);
System.out.println("enter id and name");
id=sc.nextInt();
name=sc.next();
employee em=new employee();
em.disinfo(id,name);
}
}
