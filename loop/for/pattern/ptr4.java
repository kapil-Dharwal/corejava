/*
*
**
***
****
*****
*/
import java.util.Scanner;
class Ptn4
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i,j;
		  int r=sc.nextInt();
		  
		  for( i=1;i<=r;i++)
		  {
			  for( j=1;j<=i;j++)
			  {
				  System.out.print("*");
			  }
			  System.out.print("\n");
		  }
	  }
}