import java.io.*;
class Copy 
{
	public static void main(String args [])throws FileNotFoundException,IOException
	{
		File fobj1 = new File ("copy.txt");
		FileInputStream fin = new FileInputStream (fobj1);
		FileOutputStream fos = new FileOutputStream(fin);
		
		int x;
		while((x=fin.read())!=1)
		{
			fos.write(x);
			fos.flush();
		}
		fos.close();
		fos.close();
	}
}