class Animal
{
void eat()
{
System.out.println("animal is eating");
}
void sleep()
{
System.out.println("animal is sleeping");
}
}
class Bird extends Animal
{
void eat()
{
System.out.println("bird is eating");
}
void sleep()
{
System.out.println("bird is sleeping");
}
void fly()
{
System.out.println("bird is flying");
}
}
class P309
{
public static void main(String []ar)
{
Animal a= new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
}
}