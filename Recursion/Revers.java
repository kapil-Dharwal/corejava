import java.util.Scanner;
class Test
{
	int rev=0;
	public int revers(int x)
	{
			int r;
			if(x<=0)
			return x;
			else
			r=x%10;
			rev=(rev*10)+r;
			this.revers(x=x/10);
			return rev;
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		Test ob=new Test();
		System.out.println(ob.revers(n));
	}
}

