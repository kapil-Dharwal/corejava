
// X!/x^1  + X!/x^3  + X!/x^5  =  1.0493827

import java.util.Scanner;
class Series_14
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x );
			sum+=fact/pow;
			
			System.out.print(x+"!/"+n1+"^"+x);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


// X!/x^1  - X!/x^3  + X!/x^5 =   0.60493827

class Series_14_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum-=fact/pow;
				System.out.print(" - "+x+"!/"+n1+"^"+x);
			}
			else
			{
				sum+=fact/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+n1+"^"+x);
			}
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}


//- X!/x^1  + X!/x^3  - X!/x^5  = -  0.60493827

class Series_14_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i=1,x=1;
		float pow=1,sum=0,fact;
		
		do
		{	
			fact=1;
			pow=1;
			int j=1;
			do
			{
				fact*=j;
				pow*=n1;
				j++;
			}while(j<=x);
			if(i%2==0)
			{
				sum+=fact/pow;
				System.out.print(" + "+x+"!/"+n1+"^"+x);
			}
			else
			{
				sum-=fact/pow;
				
				System.out.print(" - "+x+"!/"+n1+"^"+x);
			}			
			x+=2;
			i++;
		}while(i<=n);
		System.out.print(" = "+sum);
	}
}
