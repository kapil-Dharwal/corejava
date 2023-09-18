import java.util.Scanner;
class Test
{
	public int maximum(int x[],int n)
	{
		int max = x[n-1];
		if(n==1)
			max = x[0];
		else
			if(max<this.maximum(x,n-1))
			max = this.maximum(x,n-1);
		
		return max;


	}
	public static void main(String args[])
	{
		Test ob = new Test();
		Scanner sc = new Scanner(System.in);
		int a[]= new int[10];
		System.out.println("how many elements you want to enter");
		int n = sc.nextInt();
		System.out.println("Enter your elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println("maximum element of an array is "+ob.maximum(a,n));
		
	}
}