import java.util.Scanner;
class Assci
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i;
		  int r=sc.nextInt();
		  for(i=1;i<=127;i++)
		  {
			  System.out.print(i+"="+(char)i);
			  System.out.print("\n");
		  }
		  
	  }
}