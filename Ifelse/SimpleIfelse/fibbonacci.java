import java.util.Scanner;
class Fibonacci
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int i=1,a=-1,b=1,n,c=0;
		n=sc.nextInt();
		while(i<=n)
		{
			c=a+b;
		    System.out.print("  "+c);
		    a=b;
		    b=c;
		    i++;
		}		
	}
}
