import java.util.Scanner;
class Test
{
	public int minimum(int x[], int n)
	{
		int min = x[n-1];
		if(n==1)
			min = x[0];
		else
			if(min>minimum(x, n-1))
			min = minimum(x,n-1);
		
		return min;


	}
	public static void main(String args[])
	{
		Test ob = new Test();
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("how many elements you want to enter");
		int n = sc.nextInt();
		System.out.println("Enter your elements");
		for(int i=0; i<n; i++)
			a[i] = sc.nextInt();
		System.out.println("Minimum element of an array is "+ob.minimum(a,n));
		
	}
}