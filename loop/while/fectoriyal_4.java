
//WAP Fectoriyal Serices sum -1!/1 + 2!/2 - 3!/3 + 4!/4 + 5!/5 = -20
import java.util.Scanner;
class Fectoriyal_seri4
{
	public static void main(String[]args)
	{
		int n,i=1;
		double sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum=sum+(fect/i);
				System.out.print(" - "+i+"!/"+i);
			}
			else
			{
				sum-=fect/i;
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+i);
			}


			i++;
		}
		System.out.println(" = "+sum);
	}
}

