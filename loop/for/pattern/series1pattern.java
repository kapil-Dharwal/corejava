import java.util.Scanner;
class Series1Ptn
{
      public static void main(String[]args)
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a num: ");
		  int n,i=1,j;
		  int r=sc.nextInt();
		  while(i<=3)
		  {
			 j=1;  
            while(j<=5)
			{
				System.out.println(i+" "+j);
				j++;
			}
			i++;
			
		  }
	  }
}
				
		  