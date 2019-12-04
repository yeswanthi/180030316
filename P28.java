import java.util.*;
class P28
{
public static void main(String []s)
{
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter size of array");
int n= sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int ma,min1=a[0],min2=0,max1=a[0];
for(i=1;i<n;i++)
{
if(a[i]>max1)
max1=a[i];
if(a[i]<max1 && a[i]>max2)
max2=a[i];
if(a[i]<min1)
min1=a[i];
if(a[i]>min1 && a[i]<min2)
min2=a[i];
}
System.out.println("first and second maximum nos of array are"+max1+"and"+max2);
System.out.println("first and second minimum nos of array are"+min1+"and"+min2);
}
}
