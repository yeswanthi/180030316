import java.util.*;
class P26
{
public static void main(String a[])
{
int s[]={1,4,34,56,7};
Scanner sc= new Scanner(System.in);
System.out.println("enter key value for search");
int key=sc.nextInt();
int i,flag=0;
for(i=0;i<s.length;i++)
{
if(s[i]==key)
{
flag=1;
System.out.println(i);
break;
}
}
if(flag==0)
System.out.println("-1");
}
}
