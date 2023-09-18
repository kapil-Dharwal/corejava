// x^1/2!  + x^3/4!  + x^5/6!  = 2.9625>100
import java.lang.String;
import java.util.Scanner;
class Series_100
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any turm number");
		int n = sc.nextInt();
		System.out.println("enetr power of any num");
		int y = sc.nextInt();
		float sum=0,power=1,fact=1;
		int i =1;
		int a = 1;
		while(a<=y)
		{
			power=power*n;
			fact=fact*(i+1);
				if(i%2!=0)
				{
					sum=sum+(power/fact);
					System.out.print(n+"^"+i+"/!"+(i+1)+"+");
					a++;
					
				}
				i++;
		}
		System.out.print(" = "+sum);
		
	}
}


// 3^1/2 - 3^3/4 + 3^5/6 = 0.7125>101

class Series_100_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum-=pow/fact;
				System.out.print(" - "+n1+"^"+x+"/"+(1+x));
			}
			else
			{
				sum+=pow/fact;
				if(i>1)
				System.out.print(" + ");
				System.out.print(n1+"^"+x+"/"+(1+x));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}


//- X!/x^1  + X!/x^3  - X!/x^5  = -0.7125>102

class Series_100_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any turm num ");
		int n = sc.nextInt();
		
		System.out.println("Enter any powerof any num ");
		int n1 = sc.nextInt();
		
		int i,x=1;
		float pow=1,sum=0,fact;
		
		for(i=1;i<=n;i++)
		{	
			fact=1;
			pow=1;
			
			for(int j=1;j<=x;j++)
			{
				fact*=j+1;
				pow*=n1;
			}
			if(i%2==0)
			{
				sum+=pow/fact;
				System.out.print(" + "+n1+"^"+x+"/"+(1+x));
			}
			else
			{
				sum-=pow/fact;
				if(i>1)
				System.out.print(" - ");
				System.out.print(n1+"^"+x+"/"+(1+x));
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}