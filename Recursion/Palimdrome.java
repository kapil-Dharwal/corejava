import java.util.Scanner;
class Test
{
	int rev=0;
	public int palindrom(int x)
	{		
			
			int r;
			if(x<=0)
			return x;
			else
			r=x%10;
			rev=(rev*10)+r;
			this.palindrom(x=x/10);
			return rev;
	}
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int j=n;
		Test ob=new Test();
		if((ob.palindrom(n))==j)
		System.out.println("palindrom");
		else
		System.out.println("not palindrom");
	}
}
