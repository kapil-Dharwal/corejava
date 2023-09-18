package pkg_2;
import pkg_1.Animal;
public class Dog extends Animal
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
