import java.util.Scanner;

class Seriseone
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0,fact=1,n=sc.nextInt();
		
		while(i<=n)
		{
			fact=fact*i;
			
			if(i%2!=0)
			{
				sum+=fact;
				if(i>1)
			    System.out.print(" + ");
				System.out.print("!" +i);
			}
			else
			{
				sum-=fact;
			    System.out.print(" - ");
			    System.out.print("!" +i);
			}
			i++;
		}
		System.out.println(" = "+sum);
	}
}	