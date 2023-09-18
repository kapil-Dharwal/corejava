import java.util.Scanner;
class Animle
{
	public static int eyes=2,ear=2,tail=1,age=5,legs=4;
	public static String catSound = "mew... mew...";
	public static String dogSound = "bhow... bhow ...";
}

class Cat extends Animle
{
		void CatSound()
		{
			System.out.println("Age of cat=" + age + "\nEyes of cat=" + eyes + "\nEar of cat=" + ear +"\nTail of cat"+ tail + "\nlegs of cat=" + legs );
			System.out.println("Cat's Sound is " + catSound);
			DogSound();
		}
		
		void DogSound()
		{
			System.out.println("Age of dog=" + age + "\nEyes of cat=" + eyes + "\nEar of dog=" + ear +"\nTail of dog ="+ tail + "\nlegs of dog=" + legs );
			System.out.println("Dog's Sound is " + dogSound);
		}
} 
class TestMain
{
		public static void main(String args [])
		{
			Cat ob = new Cat();
			ob.CatSound();
		}
}