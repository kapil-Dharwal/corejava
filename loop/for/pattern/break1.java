/*
1
2
3
1
2
3
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1;i<=2;i++)
			{
				for(j=1; ; )
				{
					System.out.println(j++);
					if(j>3)
						break;
				}
			}
		}
}