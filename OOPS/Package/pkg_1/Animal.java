package pkg_1;
import java.util.Scanner;
public class Animal
{
	String colour;
	int age, weight, height;
	public Animal(String colour,int age,int weight, int height)
	{
		this.age = age;
		this.colour = colour;
		this.weight = weight;
		this.height = height;
	}
	public void animal()
	{
		System.out.println("colour :"+colour+"\nAge :"+age+"\nWeight :"+weight+"\nHeight :"+height);
	}
}