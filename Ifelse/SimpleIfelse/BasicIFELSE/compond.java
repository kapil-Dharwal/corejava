import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Compond
{
  public static void main(String args[])
{
  Scanner sc = new Scanner(System.in);

  System.out.println("enter the principle");
  int p = sc.nextInt();

  System.out.println("enter the rate");
  float r = sc.nextFloat();

  System.out.println("enter the time");
  int t = sc.nextInt();
  
  float CI = p*((1+r/n)+t);
  
  System.out.println("Compound interest ="+CI);
}
}