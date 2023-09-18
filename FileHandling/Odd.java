import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args)throws Exception
	{	
		File fobj =new File ("odd.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int n=sc.nextInt();
		int k;
		String kpl;
			for(int i = 1; i <=n; i++) 
			{
				k=i*2-1;
				kpl=Integer.toString(k);
				byte arr[] = kpl.getBytes();
				fos.write(arr);
				fos.write(32);
				fos.flush();
			}
				fos.close();
      }
 }