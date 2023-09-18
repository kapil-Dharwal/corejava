import java.io.*;
import java.util.Scanner;
 class Test
 {
    public static void main(String[] args) throws Exception
	{
		File fobj =new File ("pali.text");
		FileOutputStream fos=new FileOutputStream(fobj);
      
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number");
        int n=sc.nextInt();
		String kpl;
		int k=0,r=0;
        int m=n;
        do
        {
			r=n%10;
			k =k*10+r;
			n=n/10;           
		}
		while(n>0);
		if(m==k)
		kpl = "number palindrom";
		else
		kpl = "number not palindrom";
		byte arr[] = kpl.getBytes();
		fos.write(arr);
 		fos.flush();
 		fos.close();
      }

}