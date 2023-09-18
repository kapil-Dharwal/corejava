import java.util.Scanner;
class AssBabble
	{
		public static void assending()
		{
			int i,j,s=0;
			Scanner sc = new Scanner (System.in);
			System.out.println("enter a element");
			int a[]=new int[10];
			System.out.println("enter size ");
			int n=sc.nextInt();
			for( i=0;i<n;i++)
			{
			a[i]=sc.nextInt();
			}
			for(i=0 ; i<n ;i++)
			{
				
				for(j=0; j<n-1 ; j++)
				{
					if(a[j]>a[j+1])
					{
						s=a[j];
						a[j]=a[j+1];
						a[j+1]=s;
					}
				}
			}
			for(i=0 ; i<n ; i++)
			System.out.println(" "+a[i]);
		}
		public static void main(String arg[])
		{
			AssBabble.assending();
		}
	}