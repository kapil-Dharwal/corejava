import java.util.Scanner;

class SumNatural
{
	public static void main(String[] args)
	{
		System.out.println("Entyer any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1,sum=0;
		
		while(i<=n)
		{
			sum=sum+i;
			if(i<n)
			{
			System.out.print(i+ " + ");
			}
			i++;
		}
            System.out.print(n+ " = "+sum);
		
	}
}	