import java.util.Scanner;

class Product
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0,fact=1,n=sc.nextInt();
		
         do		
		{
			fact=fact*i;
			i++;
		}
		while(i<=n);
		    System.out.println("fact of " +n+ " + "+fact);
	}
}	
		