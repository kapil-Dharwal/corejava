//1/2! + 2/4! + 3/6! = 0.5875>52
import java.util.Scanner;
class Series_18
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
			System.out.print(i+"/"+x+"!");
			if(i<n)
				System.out.print(" + ");
			sum+=i/fact;
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//2/2! - 4/4! + 6/6! = 0.42083332>53
class Series_18_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=2;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			if(i%2==0)
			{
				sum-=x/fact;
				System.out.print(" - "+x+"/"+x+"!");
			}
			else
			{
				sum+=x/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"/"+x+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//2/2! + 4/4! - 6/6! = -0.42083332>54
class Series_18_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=2;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
				
			}
			if(i%2==0)
			{
				sum+=x/fact;
				System.out.print(" + "+x+"/"+x+"!");
			}
			else
			{
				sum-=x/fact;
				if(i>1)
				System.out.print(" - ");
				System.out.print(x+"/"+x+"!");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
