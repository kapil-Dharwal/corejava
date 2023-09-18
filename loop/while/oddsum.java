import java.util.Scanner;

class OddSum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		int j=0;
		int sum=0;
		
		while(i<=n)
		{
			j=2*i-1;
			sum+=j;
			if(i<n)
			
			System.out.print(j+" + ");
			
			i++;
		
		}
		System.out.print(j+" =  "+sum);
		
	}
}