import java.util.*;
class P29
{
public static void main(String []args)
{
int i,j,t;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int n=sc.nextInt();
int a[]= new int[n];
System.out.println("enter elements in array");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=1;i<a.length;i++)
{
int m=a[i];
for(j=i;j>0 &&a[j-1]>m;j--)
{
a[j]=a[j-1];
}
a[j]=m;
}
 
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}