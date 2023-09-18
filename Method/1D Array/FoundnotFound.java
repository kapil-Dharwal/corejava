import java.util.Scanner;
class FnF
{
	public static void linersearch()
	{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the element in erray");
			int a[] =new int[20];
			int i=0;
			boolean b=false;
			System.out.println("enter size of array");
			int n=sc.nextInt();
				for( i=0;i<n;i++)
				{
					a[i]=sc.nextInt();
					System.out.println("\ta["+i+"]="+a[i]);
				}
				System.out.println("enter a search element");
				int item=sc.nextInt();
					for(i=0 ; i<n ; i++)
					{
						if(a[i]==item)
						b=true;
					}
						if(b)
						System.out.print("found");
						else
						System.out.print("not found");
		}
			public static void main(String arg[])
			{
				FnF.linersearch();
			}
				
	
}