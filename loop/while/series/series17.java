//2^1/1 + 2^2/3 + 2^3/5 + 2^4/7 + 2^5/9 = 10.774603
import java.util.Scanner;

class Series
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2,j=1;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while(i<=n2)
		{
			p=p*n1;
			sum+=(p/j);
			System.out.print(n1+"^"+i+"/"+j);
			
			if(i<n2)
				System.out.print(" + ");
			i++;
			j+=2;
		}
		System.out.println(" = "+sum);
	}
}