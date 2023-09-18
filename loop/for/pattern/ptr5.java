/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
import java.util.Scanner;
class Ptn5
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i,j;
		  int r=sc.nextInt();
		  
		  for( i=1;i<=r;i++)
		  {
			  for( j=1;j<=r-i+1;j++)
			  {
				  System.out.print(j+" ");
			  }
			  System.out.print("\n");
		  }
	  }
}