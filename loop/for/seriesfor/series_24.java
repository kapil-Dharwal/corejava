// 2/1^1 + 4/2^2 + 6/3^3 = 0.1399177>70
import java.lang.String;
import java.util.Scanner;
class Series_24
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any power of any num ");
		int n1 = sc.nextInt();
		
		int i,x=2;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			sum+=i/pow;
			System.out.print(x+"/"+i+"^"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 3^2/1^1 - 4/2^2 + 3^6/3^3 = 0.09053498>71

class Series_24_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any power of any num ");
		int n1 = sc.nextInt();
		
		int i,x=2;
		float pow=1,sum=0;
		
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
				
			}
			if(i%2==0)
			{
				sum-=i/pow;
				System.out.print(" - "+x+"/"+i+"^"+i);
			}
			else
			{
				sum+=i/pow;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+i+"^"+i);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//  - 2/2^1 + 4/4^2 - 6/6^3 = -0.09053498>72

class Series_24_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=2;
		float pow=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
				
			}
			if(i%2==0)
			{
				sum+=i/pow;
				System.out.print(" + "+x+"/"+x+"^"+i);
			}
			else
			{
				sum-=i/pow;
				
				System.out.print(" - "+x+"/"+x+"^"+i);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
