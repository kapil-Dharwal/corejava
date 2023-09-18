import java.util.Scanner;
class Naturalm
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=1,sum=0,n;
		n=sc.nextInt();
		do
		{
			sum+=i;
			i++;
		}
		while(i<=n);
		{
			System.out.print("natural = "+sum);
		}
	}
}

			