import java.lang.String;
import java.lang.System;
import java.util.Scanner;

class Age
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("enter the age:");
		age=sc.nextInt();
		
		if(age<=12)
		{
			System.out.println("this is child");
		}
        else
		{
		    if(age<=19)
			  {
				System.out.println("this is teen");
			  }
			else
			{
				if(age<=59)
		        {
			      System.out.println("this is young");
		        }
				else
				{
					System.out.println("this is old");
				}
			}
		}
	}
}
	
		
	