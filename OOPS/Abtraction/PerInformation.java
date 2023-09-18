import java.util.Scanner;
abstract class Person 
{
    abstract void information();
}
class Employee extends Person 
{
    void information() 
	{
        String name = "KAPIL";
        int age = 23;
        double salary = 20000;
  
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
class TestMain
 {
    public static void main(String args[]) {
        Person ob= new Employee();
        ob.information();
    }
}