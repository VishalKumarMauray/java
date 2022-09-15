import java.util.*;
class student
{
public static void main(String args[])
{
int rollno;
Long contact;
String city,name,address;
char gender;
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the Roll no");
rollno=sc.nextInt();
System.out.println("enter the Contact");
contact=sc.nextLong();
System.out.println("enter the address");
address=sc.nextLine();
System.out.println("enter the city");
city=sc.nextLine();
System.out.println("enter the gender");
gender=sc.next().charAt(0);
System.out.println("Name="+name);
System.out.println("Roll number="+rollno);
System.out.println("Contact="+contact);
System.out.println("Address="+address);
System.out.println("City="+city);
System.out.println("Gender="+gender);
}
}
