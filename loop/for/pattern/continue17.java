
/*
1
1 1
2
2 1
2 2
3
3 1
3 2
3 3
4
4 1
4 2
4 3
4 4
5
5 1
5 2
5 3
5 4
5 5
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<=5;i++)
			{
				System.out.println(i);
				for(j=1; j<=i; j++)
				{
				System.out.println(i+ " " +j);
				if(j<=2)
				continue;
				}			
			}
		}
}