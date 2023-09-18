import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner;
class Test
{  
	public static void main(String[] args)
	{  
		try
		{  
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter File Name");
			String t=sc.nextLine();
			File myObj = new File(t);  
			FileOutputStream ob=new FileOutputStream(myObj);
			if(myObj.exists()==false)
			{  
				System.out.println("File created: "+ myObj.getName());  
			}
			else
			{  
				System.out.println("File already exists.");  
			}
			ob.write(65);
			}
		catch (Exception e)
		{
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		}  
	}  
}