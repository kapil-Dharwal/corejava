import java.util.Scanner;
abstract class Animal 
{
	  public abstract void run();
	  public void voice() 
	  {
		System.out.println("\tWOW...WOW...");
	  }
}
class Dog extends Animal 
{
	  public void run()
	  {
		System.out.println("\tFAR...FAR...FAR...");
	  }
}
class TestMain 
{
	  public static void main(String[] args) 
	  {
		Dog d= new Dog(); 
		d.run();
		d.voice();
	  }
}