import java.lang.Math;
import java.util.Scanner;
class Prime
{
	    public static void main(String[]args)
		{
		    Scanner sc=new Scanner(System.in);
		    int n,i,c;
		    System.out.println("Enter starting number:");
		    n=sc.nextInt();
		    int n1;
		    System.out.println("enter the ending number:");
		    n1=sc.nextInt();
		
		    for(;n<=n1;n++)
		    {
			   c=0;
			   for(i=2;i<n;i++)
			   {
				  if(n%i==0)
				  {
					 c++;
				  }
			    }
			    if(c==0 && n>1)
				System.out.print(i+" ");
		    }
			
		}
}
			
			