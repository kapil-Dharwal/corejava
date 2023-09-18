import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args) throws Exception
	{
		File fobj =new File ("reverse.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int n=sc.nextInt();
		String s;
		int i=0,r=0;
        do
		{
			r=n%10;
			i=i*10+r;
			n=n/10;           
		}
		while(n>0);
        	 
			s=Integer.toString(i);
			byte arr[] = s.getBytes();
     		fos.write(arr);
			fos.write(32);
			fos.flush();
			fos.close();
    }

}