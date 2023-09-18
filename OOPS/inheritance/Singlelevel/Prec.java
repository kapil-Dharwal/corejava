import java.util.Scanner;
class Animal
{
	void show()
	{
		System.out.println("this is animal");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.print("hiiii");
	}
}
class Dogy extends Dog
{
	public static void main(String [] args)
	{
		Dog d=new Dog();
		d.show();
		d.eat();
	}
}