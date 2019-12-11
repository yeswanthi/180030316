import java.util.*;
class Person1
{
  String name;
  int age;
  String gender;
  int id;
  Person1(String n,int ag,String ge,int i )
  { 
   name=n;
   age=ag;
   gender=ge;
   id=i;
  }
}
class Student extends Person1
{
String cname;
 Student(String n,int ag,String g,int i,String name)
{
  super(n,ag,g,i);
  cname=name;
}
}
class Teacher extends Person1
{
double salary;
String subject;
Teacher(String n,int ag,String g,int i,double sal,String br)
{
  super(n,ag,g,i);
 salary=sal;
 subject=br;
System.out.println("******TEACHER DETAILS*******");
System.out.println("name:"+n+"\nage:"+ag+"\ngender:"+g+"\nId :"+i+"\nsalary:"+sal+"subject"+br);
}
}
class Collegestudent extends Student
{
 int year;
 String branch;
 Collegestudent(String n,int ag,String g,int i,String name,int y,String br)
{ 
 super(n,ag, g, i,name);
 year=y;
 branch=br;
System.out.println("******STUDENT DETAILS*******");
System.out.println("name:"+n+"\nage:"+ag+"\ngender:"+g+"\nId :"+i+"\ncollege name:"+name+"\nyear:"+y+"branch"+br);
}
}
class P41
{
 public static void main(String ar[])
{
 Scanner sc= new Scanner(System.in);
System.out.println("enter name\n age \n gender \n id");
String n=sc.next();
int a=sc.nextInt();
String g=sc.next();
int i=sc.nextInt();
System.out.println("enter 1.student 2.teacher");
int o=sc.nextInt();
switch(o)
{
case 1:
    
      System.out.println("enter year \n branch \ncollege name");
      int y=sc.nextInt();
      String b=sc.next();
      String cname=sc.next();
      Collegestudent h=new Collegestudent(n,a,g,i,cname,y,b);
      break;
case 2:
       System.out.println("enter salary subject");
      int s=sc.nextInt();
      String ss=sc.next();
      Teacher c=new Teacher(n,a,g,i,s,ss);
      break;
default:
break;
}
}
}

  