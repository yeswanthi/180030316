import java.util.*;
class P6
{
public static void main(String args[])
{
int i;
if(args.length==0)
{
System.out.println("No values");
}
else
{
for(i=0;i<(args.length-1);i++)
{
System.out.print(args[i]+",");
}

System.out.print(args[args.length-1]);
}
}
}
