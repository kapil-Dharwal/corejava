/*
1 1 1
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<=10 ;i++)
			{
				for(j=1; j<=10; j++)
				{
					for(k=1;k<=10;k++)
					{
				        System.out.println(i+ " " +j+ " " +k);
				        if(k<=3)
				        break;
					}
					    if(j<=4)
						break;
				}	
    				    if(i<=5)
						break;	
			}
		}
}