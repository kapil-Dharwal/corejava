import java.util.Scanner;
class Repitaion
{
	public static void ripitation()
	{
			Scanner sc=new Scanner (System.in);
			
			
			System.out.println("Enter the element in erray");
			int a[] =new int[5];
			int count=0,i=0;
			System.out.println("enter size of array");
			int n=sc.nextInt();
				for( i=0;i<n;i++)
				{
				a[i]=sc.nextInt();
				System.out.println("\ta["+i+"]="+a[i]);
				}
				System.out.println("enter  any digt");
				int k=sc.nextInt();
				for(i=0; i<n ;i++)
				{
					if(a[i]==k)
					{
					count++;
					}
				}
						System.out.println("ripit "+count);
					
		}
					public static void main(String args[])
					{
						Repitaion.ripitation();
					}
	
}