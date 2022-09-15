import java.util.*;
class week
{
public static void main(String args[])
{
String i;
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice\nHINT:-mo='monday'");
i=sc.next();
switch(i)
{
case "mo" :
System.out.println("Monday");
break;
case "tu" :
System.out.println("Tuesday");
break;
case "we" :
System.out.println("Wednesday");
break;
case "th" :
System.out.println("Thursday");
break;
case "fr" :
System.out.println("Friday");
break;
case "sa" :
System.out.println("Saturday");
break;
case "su" :
System.out.println("Sunday");
break;
default :
System.out.println("wrong choice");
}
}
}