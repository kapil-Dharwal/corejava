import java.util.Scanner;
class PrimeOrnmot
{
	public static void main(String[]args)
	{
		
	    Scanner sc=new Scanner(System.in);
	    int i=1,k=0,n;
		System.out.println("enter the number:");
		n=sc.nextInt();
		do
		{
			if(n%i==0)
			{
				k++;
			}
			i++;
		}
		    while(i<=n);
		        {
			        if(k==2)
		            {
		                System.out.println("number is prime");
		            }
		            else
		            {
		                System.out.println("number is not prime");
		            }
		        }
	}
}

		