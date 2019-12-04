import java.util.*;
class P34
{
public static void main(String []a)
{
if(a.length<9)
System.out.println("Please enter 9 integer numbers ");
else
{
int c=0;
int i,j;
int s[][]=new int[3][3];
System.out.println("The given array is : ");
int max=0;
for(j=0;j<3;j++)
{
 for(i=0;i<3;i++)
{ 
if(c<9)
{
s[j][i]=Integer.parseInt(a[c]);
c=c+1;
if(s[j][i]>max)
max=s[j][i];
System.out.print(s[j][i]+" ");
}
}
System.out.println();
}
System.out.println("The max element of the array is : "+max);
}
  
}}