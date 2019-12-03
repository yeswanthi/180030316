import java.util.*;
class P9
{
public static void main(String args[])
{
String s=args[0];
double in=0;
int i=Integer.parseInt(args[1]);
if(s.equals("female"))
{
  if(i>=1 && i<=58)
  in=8.2;
  if(i>=59 && i<=120)
  in=7.6;
}
if(s.equals("male"))
{
  if(i>=1 && i<=60)
  in=8.3;
  if(i>=61 && i<=120)
in=7.6;
}
System.out.println("Interest :"+in);
}
}
