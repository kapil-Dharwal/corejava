/*
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1
	*/
import java.util.Scanner;
class Ptn13
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i,j;
		  n=sc.nextInt();
		  
		  for( i=1;i<=n;i++)
		  {
			  for( j=1;j<i;j++)
			  {
				  System.out.print(" ");
			  }
			  for(j=1;j<=n-i+1;j++)
			  {
			    System.out.print(j+" ");
			  }
			  System.out.print("\n");
		  }
	  }
}