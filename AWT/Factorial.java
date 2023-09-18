import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args)throws Exception
	{	
		File fobj =new File ("fact.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number");
        int n=sc.nextInt();
		int fact=1;
		String kpl;
		for(int i = 1; i <= n; i++) 
		{
            fact *= i;
		}
      	kpl=Integer.toString(fact);
		byte arr[] = kpl.getBytes();
     	fos.write(arr);
 		fos.flush();
 		fos.close();
      }
 }