import java.util.Scanner;
class Value_5
{
	public static void sum5after2()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int i=0,sum=0;
		for(i=0; i<n ;i++)
		{
			
		a[i]=sc.nextInt();
		System.out.println("\ta["+i+"]="  +a[i]);
		}
		for(i=2;i<n;)
		{
				sum=0;
				sum=5+a[i];
				System.out.print("sum="+sum);
				i=i+3;
		}
	}
		public static void main(String arg[])
		{
			Value_5.sum5after2 ();
		
		}
}