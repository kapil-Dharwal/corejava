import java.io.*;
import java.util.Scanner;
class Testread2
{
	public static void main(String aargs []) throws FileNotFoundException,IOException
	{
		Scanner sc=new Scanner (	System.in);
		System.out.println("Create file name");
		String kpl=sc.nextLine();
		FileInputStream fin = new FileInputStream(new File("Test2.txt"));
		FileOutputStream fb = new FileOutputStream(new File("Test2.txt"));
		int x;
		fin.close();
		while((x=fin.read())!=-1)
		{
			System.out.println("Value="+(char)x);
		}
		fb.write(70);
		fb.flush();
		fb.close();
	}
}