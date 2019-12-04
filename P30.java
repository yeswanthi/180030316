import java.util.*;
class P30
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
System.out.println("enter array  size");
int n=sc.nextInt();
System.out.println("enter array  elements");
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n-1;j++)
{
if(a[j]==a[i])
a[j]=-1;
}
}
for(i=0;i<n;i++)
{
if(a[i]!=-1)
System.out.print(a[i]+" ");
}
}
}