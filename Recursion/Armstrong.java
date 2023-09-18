import java.util.Scanner;
class Test
{
	int rev=0;
	public int armstrong(int x)
	{		
			
			int r;
			if(x<=0)
			return x;
			else
			r=x%10;
			rev=(r*r*r)+rev;
			this.armstrong(x=x/10);
			return rev;
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int j=n;
		Test ob=new Test();
		if((ob.armstrong(n))==j)
		System.out.println("armstrong");
		else
		System.out.println("not armstrong");
	}
}