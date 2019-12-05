import java.util.*;
class Calculator
{
public static int powerInt(int num1,int num2)
{
return (int)Math.pow(num1,num2);
}
public static double powerDouble(int num1,int num2)
{
return (double)Math.pow(num2,num1);
}
}
class P37
{
public static void main(String []a)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number1 and number2");
int  n=sc.nextInt();
int k=sc.nextInt();
int h=Calculator.powerInt(n,k);
double l=Calculator.powerDouble(n,k);
System.out.println(h+" "+l);
}
}
