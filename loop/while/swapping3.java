import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class Swapping
{
	public static void main(String [] args)
	{
		int a,b;
		Scanner sc=new Scanner (System.in);
		+++
		System.out.println("Enter the first num:");
		a=sc.nextInt();
		
		System.out.println("Enter the second num:");
		b=sc.nextInt();
		
		System.out.println("After swapping\n a ="+a+"\nb ="+b);
		
		//bitwise operator
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("Before swapping\n a ="+a+"\nb ="+b);
	}
}	
		
		