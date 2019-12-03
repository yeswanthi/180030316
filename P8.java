import java.util.*;
class P8
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter ");
char a=sc.next().charAt(0); 
if((a >= 'a' && a<= 'z' )||(a>='A' && a<= 'Z'))
System.out.println("alphabet");
else if((a >= '0' && a<= '9'))
System.out.println("digit");
else
System.out.println("special character");
}
}
