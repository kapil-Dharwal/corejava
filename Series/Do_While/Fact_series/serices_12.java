
//WAP Fectoriyal Serices sum -1!/2 + 2!/3 - 3!/4 + 4!/5 + 5!/6 = -16.533333
import java.util.Scanner;
class Serices_12
{
	public static void main(String[]args)
	{
		int n,i=1,j=2;
		float sum=0,fect=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		n = sc.nextInt();

		do
		{
			fect*=i;
			if(i%2==0)
			{
				sum=sum+(fect/j);
				System.out.print(" - "+i+"!/"+j);
			}
			else
			{
				sum=sum-(fect/j);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+j);
			}

			i++;
			j++;
		}while (i<=n);
		System.out.println(" = "+sum);
	}
}
