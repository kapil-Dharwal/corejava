/*
1 8
1
3 8
3
5 8
5
7 8
7
9 8
9 9
9
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k,n;
			
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
				