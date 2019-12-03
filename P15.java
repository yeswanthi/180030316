import java.util.*;
import java.lang.*;
class P15
{
public static void main(String []a)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter no");
int n= sc.nextInt();
int i,flag=0;
for(i=2;i<=Math.sqrt(n);i++)
{
if(n%i==0)
{
flag=1;
break;
}
}
if(flag==1)
System.out.println("given number "+n+" is not  prime");
else
System.out.println("given number "+n+" is  prime");
}
}

