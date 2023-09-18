import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args)throws Exception
	{	
		File fobj =new File ("NaturalSeries.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int n=sc.nextInt();
		int i=1,sum=0;
		String kpl;
		while(i<=n)       
        { 
			sum+=i;
			kpl=Integer.toString(sum);
			byte arr[] = kpl.getBytes();
			fos.write(arr);
			fos.write(32);
			fos.flush();
			i++;
		}
			fos.close();
	}
}