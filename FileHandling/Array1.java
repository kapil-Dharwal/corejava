import java.io.*;
//import java.io.FileOutputStream;
//import java.io.FileInputStream;
//import java.util.Scanner;
 class Array2
 {
	public static void main(String[] args) throws Exception
	{
		File fobj =new File ("Array1.text");
		FileInputStream fos=new FileInputStream("2D Array.text");
		FileOutputStream ob=new FileOutputStream(fobj);
		int x;
		while((x=fos.read())!=-1)
		{
			ob.write(x);
		}
		ob.close();
	}
 }