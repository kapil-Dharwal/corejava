//1!/1 + 3!/3 + 5!/5 = 44.0>55
import java.util.Scanner;
class Series_19
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
			System.out.print(x+"!/"+x);
			if(i<n)
				System.out.print(" + ");
			sum+=fact/i;
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//1!/1 - 3!/3 +> 5!/5 = 38.0>56
class Series_19_1
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
				sum-=fact/i;
				System.out.print(" - "+x+"!/"+x);
			}
			else
			{
				sum+=fact/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//1!/1 + 3!/3 - 5!/5 = -38.0>57
class Series_19_2
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
				sum+=fact/i;
				System.out.print(" + "+x+"!/"+x);
			}
			else
			{
				sum-=fact/i;
				if(i>1)
				System.out.print(" - ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}