import java.util.*;
class month
{
public static void main(String args[])
{
String i;
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice\nHINT:-jan='january'");
i=sc.next();
switch(i)
{
case "jan" :
System.out.println("January");
break;
case "feb" :
System.out.println("February");
break;
case "mar" :
System.out.println("March");
break;
case "apr" :
System.out.println("April");
break;
case "may" :
System.out.println("May");
break;
case "jun" :
System.out.println("June");
break;
case "jul" :
System.out.println("July");
break;
case "aug" :
System.out.println("August");
break;
case "sep" :
System.out.println("September");
break;
case "oct" :
System.out.println("October");
break;
case "nov" :
System.out.println("November");
break;
case "dec" :
System.out.println("December");
break;
default :
System.out.println("wrong choice");
}
}
}