import java.util.*;
class P33
{
public static void main(String []a)
{
if(a.length<4)
System.out.println("Please enter 4 integer numbers ");
else
{
int c=0;
int i,j;
int s[][]=new int[2][2];
System.out.println("The given array is : ");
for(j=0;j<2;j++)
{
 for(i=0;i<2;i++)
{ 
if(c<4)
{
s[j][i]=Integer.parseInt(a[c]);
c=c+1;
System.out.print(s[j][i]+" ");
}
}
System.out.println();
}
System.out.println("The reverse of the array is : ");
for(j=1;j>=0;j--)
{
 for(i=1;i>=0;i--)
{ 
System.out.print(s[j][i]+" ");
}
System.out.println();
}
}
}
  }