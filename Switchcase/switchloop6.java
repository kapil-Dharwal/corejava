//loop convert to switch
import java.util.Scanner;
class Switchloop_6
{
	public static void main(String[]args)                                  
	{
		int  choice,n,i=1,fect=1,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:\n1for-1!+2!-3!+4!-5!\n2for1!/1 + 2!/2 + 3!/3 + 4!/4 + 5!/5\n3for1!/1 - 2!/2 + 3!/3 - 4!/4  + 5!/5");
		System.out.println("enter your choice:");
		choice= sc.nextInt();
		switch(choice)
		{
			case 1:
			    System.out.println("Enter any number:");
				n=sc.nextInt();
				while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum+=fect;
				System.out.print(" + "+i+"!");
			}
			else
			{
				sum-=fect;
				System.out.print(" - "+i+"!");
			}
			i++;
		}
		System.out.println(" = "+sum);
		break;
		case 2:
		    System.out.println("Enter any number:");
			n=sc.nextInt();
			while (i<=n)
		{
			fect=fect*i;
			
			sum=sum+(fect/i);
				if(i>1)
				{
					System.out.print(" + ");
				}
				System.out.print(i+"!/"+i);
			
			i++;
		}
		System.out.println(" + !"+n+"/"+n+" = "+sum);
		break;
		case 3:
		System.out.println("Enter any number:");
		n=sc.nextInt();
		while (i<=n)
		{
			fect*=i;
			if(i%2==0)
			{
				sum = sum - (fect/i);
				System.out.print(" - !"+i+"/"+i);
			}
			else
			{
				sum = sum + (fect/i);
				if(i>1)
					System.out.print(" + ");
				System.out.print(i+"!/"+i);
			}
				
			
			i++;
		}
		System.out.println(" = "+sum);
		}
	}
}
		