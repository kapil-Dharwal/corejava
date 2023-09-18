import java.util.Scanner;

class Xpower
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer two number:");
		int i=1,num1,num2,p=1;
		num1=sc.nextInt();
		num2=sc.nextInt();
		do
		
		{
			p=p*num1;
			i++;
		}
		while(i<=num2);
		System.out.println(p);
	}
}
			