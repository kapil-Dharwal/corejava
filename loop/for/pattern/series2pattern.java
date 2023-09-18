import java.util.Scanner;
class Series2Ptn
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i=1,j,k;
		  int r=sc.nextInt();
		  while(i<=2)
		  {
			  j=1;
			  while(i<=5)
			  {
				  k=1;
				  while(k<=5)
				  {
					  System.out.println(i+" "+j+" "+k);
				  }
				  j++;
			  }
			  i++;
		  }
	  }
}