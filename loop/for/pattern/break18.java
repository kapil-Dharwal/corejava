
/*
1 10 1
2 10 1
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<=12 ;i++)
			{
				for(j=10; j>=10; j--)
				{
					for(k=1;k<=8;k++)
					{
						System.out.println(i+ " " +j+ " " +k);
						if(k==1)
						break;
					}
					    if(j>=i+1)
						break;
				}       
				        if(i>1)
						break;					
			}
		}
}