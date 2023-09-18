import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args)throws Exception
	{	
		File fobj =new File ("digitsum.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.");
        int n=sc.nextInt();
		int r=0,sum=0;
		String k;
		while(n>0)       
        { 
            r=n%10;
			sum+=r;
			n=n/10;
		
	    }
		k=Integer.toString(sum);
		byte arr[] = k.getBytes();
		fos.write(arr);
		fos.write(32);
		fos.flush();
		fos.close();
      }
}