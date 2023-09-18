import java.util.Scanner;
class Ptn8
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i,j;
		  n=sc.nextInt();
		  
		  for( i=1;i<=n;i++)
		  {
			  for( j=5;j>=i;j--)
			  {
				  System.out.print(j);
			  }
			  /*System.out.print(" ");
			  for(j=5;j>n;j--)
			  {
			    System.out.print(i);
			  }*/
			  System.out.print("\n");
		  }
	  }
}