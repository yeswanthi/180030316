import java.util.*;
class P24
{
public static void main(String a[])
{
int s[]=new int[20];
int r=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
for(i=0;i<n;i++)
{
s[i]=sc.nextInt();
r=r+s[i];
}
System.out.println("sum of elements in array is "+r);
System.out.println("average of elements in array is "+(double)(r/n));
}
}
