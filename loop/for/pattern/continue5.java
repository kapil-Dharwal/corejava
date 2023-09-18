/*
i=1j=1
i=1j=3
i=1j=4
i=3j=1
i=3j=3
i=3j=4
i=4j=1
i=4j=3
i=4j=4
i=5j=1
i=5j=3
i=5j=4
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<6;++i)
			{
				for(j=1;j<5;++j)
				{
					if(i==2 || j==2)
					continue;
				    System.out.println("i=" +i+ "j=" +j);
				}
			}
		}
}