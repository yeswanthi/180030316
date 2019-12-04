import java.util.*;
class P32
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int i,c=0,l=0,s=0;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]==6)
c=i;
if(a[i]==7)
l=i;
}
for(i=0;i<n;i++)
{if(i<c || i>l)
 s=s+a[i];
}
System.out.println(s);
}

}