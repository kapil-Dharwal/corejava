import java.io.*;
class Testread3
{
	public static void main(String args [])throws FileNotFoundException,IOException
	{
		File fobj = new File ("FRPI.txt");
		FileOutputStream fos = new FileOutputStream(fobj);
		
		DataOutputStream dos = new DataOutputStream (fos);
		
		dos.writeByte(56);
		dos.writeInt(156);
		dos.writeDouble(34.7);
		dos.writeBoolean(true);
		
		dos.close();
		fos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream(fobj));
		System.out.println("Value="+dis.readByte());
		System.out.println("Value="+dis.readInt());
		System.out.println("Value="+dis.readDouble());
		System.out.println("Value="+dis.readBoolean());
		
		dis.close();
	}
}