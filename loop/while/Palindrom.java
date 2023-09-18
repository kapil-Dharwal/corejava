import java.util.Scanner;
class Palandrom
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int rev=0,rem=0,n=sc.nextInt();
		int tem=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==tem)
		{
			System.out.println("enter number is palandrom");
		}
		else
		{
			System.out.println(" enter number is not palandrom");
		}
     
	}
}