//2^1 - 2^2 + 2^3 - 2^4 + 2^5 = 0.9333334
import java.util.Scanner;

class Series_2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int n1,n2;
		float p=1,sum=0,fact=1;	
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(int i=1;i<=n2;i++)
		{
			p=p*n1;
			fact*=i;
			if(i%2==0)
			{
			   sum-=p/fact;
			   System.out.print(" - "+n1+"^"+i);
			}
			else
			{
				sum+=p/fact;	
				if(i>1)
					System.out.print(" + ");
				System.out.print(+n1+"^"+i);	
			}
		}
		System.out.print(" = "+sum);
	}
}