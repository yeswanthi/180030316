import java.util.*;
class P20
{
public static void main(String a[])
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
int t= n;
int r=0,s=0;
while(n>0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
System.out.println(t+" ->"+s);
}
}

