import java.io.*;
class File
{
	public static void main(String args [])throws Exception
	{
		File f= new File("f1.text");
		FileOutputStream fob=new FileOutputStream(f);
		byte arr[]={65,66,67,68,69,70,71,72};
		for(int x:arr)
		{
			fob.write(x);
			fob.flush();
		}
			fob.close();
	}
}