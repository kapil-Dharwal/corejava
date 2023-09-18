//1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5 + !5/5  = 34.0
import java.util.Scanner;

class Serisethree
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int i=1,n=sc.nextInt();
		double sum=0,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			sum+=fact/i;
			if(i>1)
			{
				System.out.print(" + ");
			}
			{
			System.out.print(i+"!/"+i);
			}
			i++;
		}
		System.out.println(" + !"+n+"/"+n+ " = "+sum);
	}
}	