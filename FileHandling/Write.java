import java.io.*;
class Test
{
		public static void main (String args []) throws IOException,FileNotFoundException
		{
			File f= new File("f1.txt");
			FileOutputStream fob = new FileOutputStream(f);
			byte val=65;
			fob.write(65);
			fob.close();
		}
}