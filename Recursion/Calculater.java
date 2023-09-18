import java.util.Scanner;
class Calc
{
	private int a,b; 
	
	public void setData(int a,int b)
	{
		this.a =a;
		this.b =b;
	}
	
	public int getData()
	{
		return a;
	}
	public int getData1()
	{
		return b;
	}
	public int sum()
	{
		return this.a+this.b;
	}
	public int sub()
	{
		return this.a-this.b;
	}
	public int multi()
	{
		return this.a*this.b;
	}
	public int div()
	{
		return this.a/this.b;
	}
}

class Test
{
	public void opretion(Test ob)
	{	
		Scanner sc = new Scanner(System.in);
		Calc ob1 = new Calc();
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ob1.setData(a,b);
		System.out.println("choice are...");
		System.out.println("press + for Addition");
		System.out.println("press - for Substration");
		System.out.println("press * for Multiplication");
		System.out.println("press / for Division");
		System.out.println("Enter choice.....");
		char ch = sc.next().charAt(0);	
		switch(ch)
		{
			case '+':
				System.out.println(ob1.sum());
			break;
			case '-':
				System.out.println(ob1.sub());
			break;	
			case '*':
				System.out.println(ob1.multi());
			break;
			case '/':
				System.out.println(ob1.div());
			break;
		}
	}
	
	public static void main(String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		Test ob = new Test();
		ob.opretion(ob);
	}
}