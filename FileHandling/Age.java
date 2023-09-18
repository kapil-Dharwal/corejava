import java.io.*;
import java.util.Scanner;
class Test
{
	public static void main(String arg[])throws Exception
	{
		File fobj =new File ("age.text");
		FileOutputStream fos=new FileOutputStream(fobj);
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the age");
        int age = sc.nextInt();
		String kpl;
		if(age>18)
			kpl="iligible for vote";
		else
			kpl="not iligible for vote";
			byte arr[]=kpl.getBytes();
			fos.write(arr);
			fos.flush();
			fos.close();
	}
}