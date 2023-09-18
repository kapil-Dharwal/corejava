// 3^2/1 + 3^4/2 + 3^6/3 = 292>67
import java.lang.String;
import java.util.Scanner;
class Series_23
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,pow=1,x=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			pow=1;
			for(int j=1;j<=x;j++)
			{
				pow*=n1;
			}
			sum+=pow/i;
			
			System.out.print(n1+"^"+x+"/"+i);
			if(i<n)
				System.out.print(" + ");
			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// 2!  - 2!  + 6!  = 211.5>68

class Series_23_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int i,x=2,n1 = sc.nextInt();
		
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
				sum-=pow/i;
				System.out.print(" - "+x+"! ");
			}
			else
			{
				sum+=pow/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"! ");
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// - 2/1 + 4/2 - 6/3 = -211.5>69

class Series_23_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int i,x=2,n1 = sc.nextInt();
		
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
				sum+=pow/i;
				System.out.print(" + "+x+"/"+i);
			}
			else
			{
				sum-=pow/i;
				
				System.out.print(" - "+x+"/"+i);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
