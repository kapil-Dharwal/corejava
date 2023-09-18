/*
1 10
1 9
1 8
1 7
1 6
1 5
1 4
1 3
1 2
1 1
2 10
2 9
2 8
2 7
2 6
2 5
2 4
2 3
2 2
3 10
3 9
3 8
3 7
3 6
3 5
3 4
3 3
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<=10;i++)
			{
				for(j=10;j>=i;j--)
				{
					if(i>=4)
					{
					continue;
					}
					
				    System.out.println(i+ " " +j);
				}
			}
		}
}