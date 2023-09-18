//1  2  4  7  11
import java.util.Scanner;

class Series
{
	public static void main(String[] args)
	{
		System.out.println("Entyer any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=1;
	
	    do
		{
			System.out.print(sum+ "  ");
			sum=sum + i;
			i++;
		}
		while(i<=n);
	}
}	