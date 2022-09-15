import java.util.*;
class vowel
{
public static void main(String args[])
{
char n;
System.out.println("Enter the character");
Scanner sc=new Scanner(System.in);
n=sc.next().charAt(0);
if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U'||n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
{
System.out.println("Entered character is vowel");
}
else
{
System.out.println("Entered character is consonent");	
}
}
}


