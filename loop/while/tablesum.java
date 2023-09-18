import java.util.Scanner;

class SumNatural
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0,sum=0,i=1;
		
		while(i<=10)
			
		{
			j=n*i;
			sum=sum+j;
			System.out.println(n+ " * "+i +" = "+j);
			i++;
		}
		System.out.println(j+ "=" +sum);
	}
}	

