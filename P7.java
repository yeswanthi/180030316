import java.util.*;
class P7
{
public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter first character");
char s=sc.next().charAt(0);
System.out.println("enter second character");
char r=sc.next().charAt(0);
if(Character.compare(s,r)>0)
{
System.out.println(r+","+s);
}
else
System.out.println(s+","+r);
}
}