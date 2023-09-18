import java.util.Scanner;

class SumNatural
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int  table,i=1,n=sc.nextInt();
		
		
		while(i<=10)
		{
			table=n*i;
			System.out.println(n+ " * "+i +" = "+table);
			i++;
		}
	}
}	