import java.util.Scanner;
class Min
{		
		public static void elementmin()
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int [10];
			System.out.println("enter a array size");
			int n=sc.nextInt();
			int i;
			System.out.println("enter array element");
			for( i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				System.out.println("a["+i+"]="+a[i]);
			}
			int min=a[0];
			for(i=0;i<n;i++)
			{
					if(min>a[i])
					{
					min=a[i];
					}
			}
			System.out.println("min" +min);
		}
		public static void main(String arg [])
		{
			Min.elementmin();
		}	
}