import java.util.Scanner;
class PrimeOrnot
{
	public static void main(String[]args)
	{   Scanner sc=new Scanner(System.in);
		int i=1,k=0,num;
		System.out.println("enter the number:");
		num=sc.nextInt();
		while(i<=num)
		{
			if(num%i==0)
			{
				k++;
			}
			i++;
		}
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
