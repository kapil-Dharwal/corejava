
// x^2  + x^4  + x^6  = 819

import java.util.Scanner;
class Series_7
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num of turm  ");
		int n = sc.nextInt();
		
		System.out.println("Enter any num ");
		int n1 = sc.nextInt();
		
		int i=1,pow=1,x=2,sum=0;
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			System.out.print(n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			sum+=pow;
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


// x^2  - x^4  + x^6  = 657

class Series_7_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,pow=1,x=2,sum=0;
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum-=pow;
				System.out.print(" - "+n1+"^"+x);
			}
			else
			{
				sum+=pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x);
			}
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}


//- x^2  + x^4  - x^6  = -675

class Series_7_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,pow=1,x=2,sum=0;
		while(i<=n)
		{	
			pow=1;
			int j=1;
			while(j<=x)
			{
				pow*=n1;
				j++;
			}
			if(i%2==0)
			{
				sum+=pow;
				System.out.print(" + "+n1+"^"+x);
			}
			else
			{
				sum-=pow;
				
				System.out.print(" - "+n1+"^"+x);
			}			
			x+=2;
			i++;
		}
		System.out.print(" = "+sum);
	}
}
