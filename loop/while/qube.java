import java.util.Scanner;

class Qube
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			int j=i*i*i;
			System.out.println("\t"+j);
			
			i++;
		}
	}
}