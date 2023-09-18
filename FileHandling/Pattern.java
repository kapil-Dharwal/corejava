import java.io.*;
import java.util.Scanner;
class Test
{
		public static void main(String args []) throws Exception
		{
			File fo = new File ("Pattern.txt");
			FileOutputStream fob = new FileOutputStream(fo);
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			String kpl;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<i;j++)
				{
					kpl=" "+i;
					fob.write(kpl.getBytes());
				}
				kpl="\n";
			}
			fob.write(kpl.getBytes());
		}
}