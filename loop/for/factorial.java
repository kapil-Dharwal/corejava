import java.util.Scanner;
class Factorial
{
	public  static void main(String[]args)
	{
        Scanner sc=new Scanner(System.in);
		int fact=1,n;
		n=sc.nextInt();
		
		for( int i=1; i<=n; i++)
		{
			fact*=i;
		}
			System.out.print(fact+"  ");
	}
}
			