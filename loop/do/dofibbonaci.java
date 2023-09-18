import java.util.Scanner;
class Fibbonacci
{
	public static void main(String[]args)
	{
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number:");
		int i=1,sum=0,first=0,second=1,n;
		n=sc.nextInt();
		
		do
		{
			System.out.print("  "+sum);
			first=second;
			second=sum;
			sum=first+second;
			i++;
		}
		while(i<=n);
		
	}
}