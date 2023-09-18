import java.util.Scanner;
class TakeElement
{		
		public static void element()
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int [10];
			System.out.println("enter a array size");
			int n=sc.nextInt();
			System.out.println("enter array element");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
			
			for(int i=0;i<n;i++)
			{
					System.out.println("a["+i+"]="+a[i]);
			}
		}
		public static void main(String arg [])
		{
			TakeElement.element();
		}	
}