/*
*****
*****
*****
*****
*/
import java.util.Scanner;
class Pt3
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
          int n=4,m=5;
          int i,j;
          sc.nextInt();


		  for(i=1; i<=n; i++)
		  {
			  for( j=1;  j<=m; j++)
			 {
		     	System.out.print("*");
			 }
		     
		     System.out.print("\n");
		
        }
    }
}