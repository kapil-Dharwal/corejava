import java.io.*;
class Test
{
	public static void main(String args [])throws IOException,FileNotFoundException
	{
		File f=new File("f5.txt");
		FileOutputStream fob=new FileOutputStream (f);
		byte arr[]={'A','B','C','D','E','F','G',};
		for(int x :arr)
		{
			fob.write(arr);
			fob.flush();
		}
			fob.close();
	}
}