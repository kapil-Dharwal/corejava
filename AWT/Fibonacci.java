import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args)throws Exception
	{	
		File fobj =new File ("fivonacci.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int n=sc.nextInt();
		int a=-1,b=1,c=0,i=1;
		String kpl;
		while(i<=n)       
        { 
			c=a+b;
			kpl=Integer.toString(c);
			byte arr[] = kpl.getBytes();
			fos.write(arr);
			fos.write(32);
			fos.flush();
			a=b;				
			b=c;
			i++;
		}
			fos.close();
	}
}