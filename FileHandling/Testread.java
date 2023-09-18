import java.io.*;
class Testread
{
	public static void main(String args [])throws FileNotFoundException,IOException
	{
		FileInputStream fin = new FileInputStream (new File("Test1.txt"));
		int x=fin.read();
		fin.close();
		int k='\n';
		System.out.println((char)x);
		FileOutputStream fos=new FileOutputStream(new File("Test1.txt"),true);
		fos.write(k);
		fos.write(65);
		fos.flush();
		fos.close();
	}
}