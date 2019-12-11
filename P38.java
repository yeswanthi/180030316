import java.util.*;
class Author
{
private String name,email;
private char gender;
Author(String name,String email,char gender)
{
this.name=name;
this.email=email;
this.gender=gender;
System.out.println("author mail:"+email);
System.out.println("gender:"+gender);
}
}
class Book
{
private  String name,author;
private double price;
private int QtyInStock;
Book (String name,String author)
{
     this.name=name;
      this.author=author;
}
String getName( )
{
      return name;
}
void setprice()
{
    this.price=price;
}
double getprice( )
{
return price;
}
String getAuthor( )
{
return author;
}
 String getname( )
{
return name;
}
 void setQtyInStock(int QtyInStock)
{
this.QtyInStock= QtyInStock;
}
int getQtyInStock()
{
return QtyInStock;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter book name author name quantity");
String b= sc.next();
String a=sc.next();
int c =sc.nextInt();
Book bk= new Book(b,a);
bk.setQtyInStock(c);
System.out.println("book name:"+bk.getname());
System.out.println("author name:"+bk.getAuthor());
System.out.println("author name:"+bk.getQtyInStock());
System.out.println("enter email  of author and gender:");
String e=sc.next();
char o=sc.next().charAt(0);
Author au=new Author(a,e,o);

}
}


