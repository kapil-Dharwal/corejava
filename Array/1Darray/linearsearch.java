import java.lang.String;
import java.util.Scanner;
class LinerSearch
{
	    public static void main(String[]args)
		{
            boolean b=false;
            Scanner sc=new Scanner(System.in);
            int a[]=new int [20];
            System.out.println("enter the item:");
			int n=sc.nextInt();
  			 
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			System.out.println("enter the item which you want to search:");
			int item=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if(a[i]==item)
					b=true;
			}
			    if(b)
			
				System.out.println("item found");
			    else
				System.out.println("item  not found");
		}
}
