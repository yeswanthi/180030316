import java.util.*;
class Box
{
double c,s,o;
void intit(double w,double h,double depth)
{
 c=w;
   s=h;
   o=depth;
}
double volume()
{
return c*s*o;
}
public static void main(String []a)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter width,height,depth");
double wt=sc.nextDouble();
double ht=sc.nextDouble();
double dp=sc.nextDouble();
Box b= new Box();
b.intit(wt,ht,dp);
double c=b.volume();
System.out.println("Volume:"+c);
}
}


