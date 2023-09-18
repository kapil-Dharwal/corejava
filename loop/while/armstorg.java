import java.util.Scanner;

class Arms
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0,fact=1,n=sc.nextInt();
		
		while(i<=n)
		{
			fact=fact*i;
			sum+=fact;
			if(i<n)
			{
				System.out.print("!" +i+ " + ");
			}
			i++;
		}
		System.out.println("!" +n+ " = "+sum);
	}
}	