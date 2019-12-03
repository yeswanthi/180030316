import java.util.*;
class P12{
public static void main(String a[])
{
if(a.length==0)
System.out.println("enter  valid number");
else
{
int s=Integer.parseInt(a[0]);
switch(s)
{case 1:System.out.println("january");
       break;
case 2:System.out.println("febraury");
       break;
case 3:
System.out.println("march");break;
case 4:
System.out.println("april");break;
case 5:
System.out.println("may");break;
case 6:
System.out.println("june");break;
case 7:
System.out.println("july");break;
case 8:
System.out.println("august");break;
case 9:
System.out.println("september");break;
case 10:
System.out.println("october");break;
case 11:
System.out.println("november");break;
case 12:
System.out.println("December");break;
default:System.out.println("Invalid month");
break;
}
}
}
}




