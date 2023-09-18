// !1 - !2 + !3 - !4 + !5 = 101
import java.util.Scanner;
class Seriesseven
{
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int i=1,sum=0,fact=1,n = sc.nextInt();

		while (i<=n)
		{
			fact*=i;
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
