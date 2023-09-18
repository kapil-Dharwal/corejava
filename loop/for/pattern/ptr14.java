import java.util.Scanner;
class Ptn14
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i,j;
		  n=sc.nextInt();
		  
		  for( i=1;i<=n;i++)
		  {
			  for( j=n;j>=1;j--)
			  {
				  if(i>=j)
				  System.out.print("* ");
			  else
				  System.out.print(" ");
			  }
			  
			  System.out.print("\n");
		  }
	  }
}