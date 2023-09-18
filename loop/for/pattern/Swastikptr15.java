import java.util.Scanner;
class Swastik
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n=5,i,j,k;
		  n=sc.nextInt();
		  
		  for(i=1;i<=n*2-1;i++)
		  {
			  for(j=1;j<=n*2-1;j++)
			  {
				  if((i==1&& j>=n)||(i==n)||(j==n)||(i==n*2-1 && j<=n)||(i<=n && j==1)||(j==n*2-1 && i>=n))
					  System.out.print("* ");
				  else
				  {
					  System.out.print("  ");
				  }
			  }
			  System.out.print("\n");
		  }
	  }
}
		  