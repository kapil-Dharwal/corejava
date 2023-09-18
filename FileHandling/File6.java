import java.io.*;
class Test
{
	public static void main(String args [])throws IOException,FileNotFoundException
	{
		File f=new File("f6.txt");
		FileOutputStream fob=new FileOutputStream (f);
		byte arr[]={65,66,67,68,69,70,71,};
		for(int x :arr)
		{
			fob.write(arr,2,5);
			fob.flush();
		}
			fob.close();
	}
}