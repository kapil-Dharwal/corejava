import java.lang.String;
import java.util.Scanner;
class Break_1
{
	    public static void main(String[]args)
		{
			//Scanner sc=new Scanner(System.in);
			int i,j,k,n;
			//n=sc.nextInt();
			
			/*for(i=2;i<=5;i++)
			{
				for(j=2;j<=5;j++)
				{
					if(i==4)
						break;
				}
				System.out.println(+i+  " = "+j);
			}*/
			for(i=1;i<=10;i++)
			{
				for(j=8;j<10;j++)
				{
					System.out.println(i+ " " +j);
					if(i<=7)
					{
						break;
					}
				}
                System.out.println(i++);				
		   
		   }
		}
}
				