import java.util.Scanner;

class Tablesum
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0,sum=0,i=1;
		
		do
		{
			j=n*i;
			sum=sum+j;
			System.out.println(n+ " * "+i +" = "+j);
			i++;
		}
		while(i<=10);
		System.out.println(j+ "=" +sum);
	}
}	