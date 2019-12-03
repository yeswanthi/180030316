import java.util.*;
class P16
{
public static void main(String [] a)
{
int j,i,flag=0;
for(j=11;j<99;j++)
{
flag=0;
for(i=2;i<=Math.sqrt(j);i++)
{
if(j%i==0)
{
flag=1;
break;
}
}
if(flag==0)
System.out.println(j);
}
}
}