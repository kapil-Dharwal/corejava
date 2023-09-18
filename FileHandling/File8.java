import java.io.*;
class Test
{
	public static void main(String args [])throws IOException,FileNotFoundException
	{
		File f=new File("f8.txt");
		FileOutputStream fob=new FileOutputStream (f);
		String name = "kapilDahrwal";
		byte arr[] = name.getBytes();
		
		fob.write(arr,2,5);
		fob.flush();
		fob.close();
	}
}