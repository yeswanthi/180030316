import java.util.*;
class P23
{
public static void main(String []a)
{
Scanner sc = new Scanner(System.in);
System.out.println("if continue y else n");
String s=sc.next();
do
{
System.out.println("enter 2 numbers");
int i=sc.nextInt();
int j=sc.nextInt();
System.out.println("1.Add\n2.sub");
int n= sc.nextInt();
switch(n)
{
case 1:System.out.println("addition of"+i+"and"+j+"is"+(i+j));
break;
case 2:System.out.println("subtraction of"+i+"and"+j+"is"+(i-j));
break;
}


}
while(s=="n"|| s=="N");

}
}


