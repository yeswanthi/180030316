import java.util.*;
class TestEmployee
{
 public static void main(String args[])
{
  System.out.println("enter name\n salary\n year\ninsurancenumber");
  Scanner sc=new Scanner(System.in);
  String n=sc.next();
  double s=sc.nextDouble();
  int y=sc.nextInt();
  String nno=sc.next();
  Employee e = new Employee(n,s,y,nno);
  System.out.println("name:"+e.getname()+"\nsalary"+e.getsalary()+"\nyear"+e.getyear()+"\ninsurancenumber :"+e.getnanumber());
}
}
  