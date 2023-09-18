import java.util.Scanner;
class Calculet
{
	public static void add()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=n+m;
		System.out.println("addition="+c);
	}
	public static void multiplay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=n*m;
		System.out.println("multiplay="+c);
	}
	public static void divide()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=n/m;
		System.out.println("divide="+c);
	}
	public static void subtraction()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a two number");
			int n=sc.nextInt();
			int m=sc.nextInt();
			int c=n-m;
			System.out.println("subraction="+c);
		}
		public static void main(String arg[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a coice\n1 for addition\n2 for multiplay\n3 for divide\n4 for subtraction");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
				Calculet.add();
				case 2:
				Calculet.multiplay();
				case 3:
				Calculet.divide();
				case 4:
				Calculet.subtraction();
			}
		}
}
