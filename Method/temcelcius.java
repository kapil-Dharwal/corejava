class Temcelcius
{
  public static void feran()
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("Enter Temprature in Fahrenheit");
    float f=sc.nextFloat();
    
    float c=(f-32)*5/9;
    System.out.println("Temprature in celcius is " +c);
    }
	 public static void main(String args[])
	 {
	 Temprature.feran();
	 }
 }