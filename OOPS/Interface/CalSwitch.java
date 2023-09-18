import java.util.Scanner;
interface Calculetor
{
	 int calculetor(int a,int b);
}
class Opreation 
{
		Calculetor ref=new Calculetor()
		{
			@Override
			public int calculetor(int a,int b)
			{
				return a+b;
			}
		};
		Calculetor ref1=new Calculetor()
		{
			@Override
			public int calculetor(int a,int b)
			{
				return a-b;
			}
		};
		Calculetor ref2=new Calculetor()
		{
			@Override
			public int calculetor(int a,int b)
			{
				return a*b;
			}
		};
		Calculetor ref3=new Calculetor()
		{
			@Override
			public int calculetor(int a,int b)
			{
				return a/b;
			}
		};
}
class TestMain
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner (System.in);
		Opreation ob=new Opreation();
		int ch;
		do
		{
			System.out.println("\t1 FOR ADDITION");
			System.out.println("\t2 FOR SUBTRICTION");
			System.out.println("\t3 FOR MULTIPLY");
			System.out.println("\t4 FOR DIVIDE");
			System.out.println("\t5 FOR EXIT");
			System.out.println("\t ENTER YOUR CHOICE");
			 ch=sc.nextInt();
			
			switch(ch)
			{
				case 1:
				System.out.println(ob.ref.calculetor(8,5));
				break;
				case 2:
				System.out.println(ob.ref1.calculetor(14,28));
				break;
				case 3:
				System.out.println(ob.ref2.calculetor(8,9));
				break;
				case 4:
				System.out.println(ob.ref3.calculetor(45,5));
				break;
				case 5:
				break;
			}
		}
		while(ch!=6);
	}
	
}