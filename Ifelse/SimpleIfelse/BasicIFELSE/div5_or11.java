import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class divornot
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num;
		System.out.println("enter the num:");
		num=sc.nextInt();
		
		if((num%5==0)&&(num%11==0))
	
{
			System.out.println("num div by 5 or 11:");
		}	
		else
		{
			System.out.println("num not div by 5 and 11");
		}
	}
}	
		
