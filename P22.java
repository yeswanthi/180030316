import java.util.*;
class P22
{
public static void main(String []a)
{
int c=1,i=1;
while(c<=5)
{
if(i%2==0 && i%3==0 && i%5==0)
{
c++;
System.out.println(i);
}
i++;
}
}
}
