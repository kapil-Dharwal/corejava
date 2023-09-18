//2/2^1 + 3/2^2 + 4/2^3 + 5/2^4 + 6/2^5 = 2.75
import java.util.Scanner;

class Series_11
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2,j=2;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(;i<=n2;i++)
		{
			p=p*n1;
			sum+=(j/p);
			System.out.print(j+"/"+n1+"^"+i);
			
			if(i<n2)
				System.out.print(" + ");
			j++;
		}
		System.out.println(" = "+sum);
	}
}