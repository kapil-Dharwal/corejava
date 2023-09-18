import java.util.Scanner;
class Fibbonacci
{
	public static void main(String[]args)
	{
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter any number:");
		int i=1,sum=0,f=0,s=1,num;
		num=sc.nextInt();
		
		do
		{
			System.out.print("  "+sum);
			f=s;
			s=sum;
			sum=f+s;
			i++;
		}
		while(i<=num);
		
	}
}