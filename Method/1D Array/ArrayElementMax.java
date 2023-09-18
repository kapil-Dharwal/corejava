import java.util.Scanner;
class Max
{		
		public static void element()
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
			int max=a[0];
			for(i=0;i<n;i++)
			{
					if(max<a[i])
					{
					max=a[i];
					}
			}
			System.out.println("max"+max);
		}
		public static void main(String arg [])
		{
			Max.element();
		}	
}