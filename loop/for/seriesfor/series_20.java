
//1/1! + 2/3! + 3/5! = 1.3583333>58

import java.util.Scanner;
class Series_20
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=1;
		float fact=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			System.out.print(i+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			sum+=i/fact;
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 1/1! - 2/3! + 3/5! = 0.6916666>59

class Series_20_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=1;
		float fact=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			if(i%2==0)
			{
				sum-=i/fact;
				System.out.print(" - "+i+"/"+x+"!");
			}
			else
			{
				sum+=i/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(i+"/"+x+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// - 1/1! + 2/3! - 3/5! = -0.6916666>60


class Series_20_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=1;
		float fact=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=i/fact;
				System.out.print(" + "+i+"/"+x+"!");
			}
			else
			{
				sum-=i/fact;
				
				System.out.print(" - "+i+"/"+x+"!");
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
