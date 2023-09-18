// 2!/1 + 4!/3 + 6!/5 = 154.07>73

import java.util.Scanner;
class Series_25
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			System.out.print(x+"!/"+(x-1));
			if(i<n)
				System.out.print(" + ");
			sum+=fact/(x-1);
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 2!/2 - 4!/3 + 6!/6 = 138.0>74

class Series_25_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			if(i%2==0)
			{
				sum-=fact/(x-1);
				System.out.print(" - "+x+"!/"+(x-1));
			}
			else
			{
				sum+=fact/(x-1);
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


 //- 2!/2 + 4!/4 - 6!/6 = -138.0>75

class Series_25_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=fact/(x-1);
				System.out.print(" + "+x+"!/"+x);
			}
			else
			{
				sum-=fact/(x-1);
				
				System.out.print(" - "+x+"!/"+x);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
