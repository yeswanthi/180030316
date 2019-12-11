import java.util.*;
class Patient
{
String name;
double weight,height;
Patient(String name,double weight,double height)
{
this.name=name;
this.weight=weight;
this.height=height;
}
double BMI()
{
return (weight/(height*height))*703;
}
}
class P38
{
public static void main(String []a)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name  weight  height of patient");
String n=sc.next();
double w=sc.nextDouble();
double h=sc.nextDouble();
Patient patients=new Patient(n,w,h);
double b=patients.BMI();
System.out.println("bmi "+b);
}
} 
