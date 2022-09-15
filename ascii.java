import java.util.*;
class ascii
{
public static void main(String args[])
{
char a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
a=sc.next().charAt(0);
System.out.println("character "+a+" ASCII value "+(int)a);
}
}