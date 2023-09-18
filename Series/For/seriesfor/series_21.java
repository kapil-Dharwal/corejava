
//3^1/1 + 3^3/2 + 3^5/3 = 97.5>61
import java.lang.String;
import java.util.Scanner;
class Series_21
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int x=1,i,n1 = sc.nextInt();
		
		float pow=1,sum=0;
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


//3^1/1 - 3^3/2 + 3^5/3 = 70.5>62

class Series_21_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int  x=1,i,n1 = sc.nextInt();
		
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
				System.out.print(" - "+n1+"^"+x+"/"+i);
			}
			else
			{
				sum+=pow/i;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+i);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


// - 3^1/1 + 3^2/2 - 3^3/3 = -70.5>63

class Series_21_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int  x=1,i,n1 = sc.nextInt();
		
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
				System.out.print(" + "+n1+"^"+i+"/"+i);
			}
			else
			{
				sum-=pow/i;
				
				System.out.print(" - "+n1+"^"+i+"/"+i);
			}			
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
