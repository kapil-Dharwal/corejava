/*
*****
*   *
*   *
*****
*/
import java.util.Scanner;
class Pt4
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
          int n=4,m=5;
          int i,j;
          sc.nextInt();


		  for(i=1; i<=4; i++)
		  {
			  for( j=1;  j<=5; j++)
			 {
				 if(i==1||j==1||i==4||j==5)
				 {
		     	   System.out.print("*");
			     }
				 else
				 {
					 System.out.print(" ");
				 }
             }System.out.print("\n");
			 }
    }
}