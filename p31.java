import java.util.*;
class P31
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int i,j,max,c;
int a[]=new int[n];
int t[]=new int[n];
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
c=0;
 for(j=i;j<n;j++)
{
  if(a[i]==a[j])
   c++;
}
t[i]=c;
}
max=0;
for(i=1;i<n;i++)
{
if(t[i]>t[max])
max=i;
}
System.out.println(a[max]);
}
}