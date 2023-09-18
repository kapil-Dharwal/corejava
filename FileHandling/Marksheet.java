import java.io.*;
import java.util.Scanner;
class Student
{
	
	public static void main(String arg[])throws Exception
	{
			File f=new File("marksheet.text");
			FileOutputStream fos=new FileOutputStream(f);
			Scanner sc=new Scanner(System.in);
			System.out.println("enter creat how");
			int c=sc.nextInt();
			int k=0;
						String s="Rolln";
						String n="Name";
						String m="Mark";
				
						byte arr[]=s.getBytes();
						fos.write(arr);
						fos.write(32);
						fos.flush();
						
						byte nrr[]=n.getBytes();
						fos.write(nrr);
						fos.write(32);
						fos.flush();
						
						byte mrr[]=m.getBytes();
						fos.write(mrr);
						fos.write(32);
						fos.flush();
						fos.write('\n');
						int sum=0;
						
						
			do
			{
				     int h=0;
				
					System.out.println("enter roll number");
					int roll=sc.nextInt();
					
					
					
					System.out.println("enter studnt name");
					String std=sc.next();
					sc.nextLine();
					System.out.println("enter mark");
					int mr=sc.nextInt();
						
						String r;
						r=Integer.toString(roll);
						byte rr[]=r.getBytes();
						fos.write(rr);
						fos.write(32);
						fos.flush();
						
						byte ar[]=std.getBytes();
						fos.write(ar);
						fos.write(32);
						fos.flush();
						
						String mri;
						mri=Integer.toString(mr);
						byte nam[]=mri.getBytes();
						sum=sum+nam[h];
						fos.write(nam);
						fos.write(32);
						fos.write('\n');
				
						k++;
						h++;
						
			}while(k!=c);
						String l=Integer.toString(sum);
						byte lrr[]=l.getBytes();
						fos.write(lrr);
						fos.flush();
				
	}
}