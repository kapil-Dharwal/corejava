import java.io.*;
import java.util.Scanner;
class Test
{
		public static void main(String args []) throws Exception
		{
			File fo = new File ("oddeven.txt");
			FileOutputStream obj=new FileOutputStream(fo);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no.");
			int n=sc.nextInt();
			int k;
			String kpl;
			if(n%2==0)
			{
				kpl="number is even";
			}
			else
			{
				kpl="number is odd";
			}
				byte arr[]= kpl.getBytes();
				obj.write(arr);
				obj.flush();
				obj.close();	
		}
}