import java.util.*;
class P10
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter lowercase character");
char c=sc.next().charAt(0);
if(c>='a' && c<='z')
System.out.println(c+"->"+Character.toUpperCase(c));
}
}
