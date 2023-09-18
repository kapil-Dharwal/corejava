import java.util.Scanner;
class Animal
{
	String colour;
	int age, weight, height;
	public Animal(String colour,int age,int weight, int height)
	{
		this.age = age;
		this.colour  = colour;
		this.weight = weight;
		this.height = height;
	}
	public void animal()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
}
class Dog extends Animal
{
	String breed;
	public Dog(String colour,int age, int weight, int height, String breed)
	{
		super(colour,age,weight,height);
		this.breed  = breed;

	}
	public void dog()
	{
		System.out.println("Dog of breed :"+breed);
		super.animal();
	}
}
class Cow extends Animal
{    
    private String name;
	public Cow(String colour,int  age,int height,int  weight,String name)
	{
		super(colour,age,weight,height);
		this.name=name;
	}
	public void cow()
	{
		System.out.println("Cow Name     :"+this.name);
		super.animal();
	}
}

class TestMain
{
	public static void main(String args [])
	{
		Dog ob = new Dog("  Black",14,78,50," DOG ");
		ob.dog();
		System.out.println();
		Cow obj= new Cow("  Black",23,89,50," COW");
		obj.cow();
	}
}