import java.util.Scanner;
class EvenOdd
{
	public static void evanodd()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0,evan=0,odd=0;
		for(i=0; i<n ;i++)
		{
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				evan++;
			}
			else
			{
				odd++;
			}
		}	
		System.out.println("evan="+evan+"\nodd="+odd);
		
	}
		public static void main(String arg[])
		{
			EvenOdd.evanodd();
		}
}