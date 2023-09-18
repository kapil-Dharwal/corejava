import java.io.*;
import java.util.Scanner;
class File1
{
	public static void main(String args [])throws IOException,FileNotFoundException
	{
		File f=new File("f2.txt");
		FileOutputStream fob=new FileOutputStream (f);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Value");
		byte val=sc.nextByte();
		
		fob.write(val);
		fob.flush();
		fob.close();
	}
}