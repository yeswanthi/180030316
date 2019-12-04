import java.util.*;
class P25
{
public static void main(String args[])
{
int a[]={5,6,4,8,96};
int max=a[0],i;
int min=a[0];
for(i=1;i<a.length;i++)
{
if(a[i]>max)
max=a[i];
else
min=a[i];
}
System.out.println("Minimum number of array is : " + min); 
System.out.println("Maximum number of array is : " + max); 
}
}