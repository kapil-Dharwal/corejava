import java.util.Scanner;
class series_4
{
	public  static void main(String[]args)
	{
		double sum=0,fact=1;
		int i=1,j=0,choice,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your choice:\n1for2/!1+3/!2+4/!3+5/!4+6/!5=4\n2for-!1/1+!2/3-!3/5+!4/7-!5/9\n3for!1/1+!2/3+!3/5+!4/7+!5/9+:");
		System.out.println("enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{		
			case 1:
			    System.out.println("Enter any number:");
				n=sc.nextInt();
				while(i<=n)
		{
			fact*=i;
			
				sum+=(i+1)/fact;
				j=i+1;
				System.out.print(j+"/"+"!"+i);
				
				if(i<n)
				System.out.print("+");
				
			    i++;
		}
		System.out.print("="+sum);
		break;
		case 2:
		    System.out.println("Enter any number:");
			n=sc.nextInt();
			while(i<=n)
		{
			fact*=i;
			if(i%2==0)
			{
				sum+=(i*2-1/fact);
				j=i*2-1;
				System.out.print("!"+i+"/"+j);
			}
			else
			{
				sum-=(i*2-1)/fact;
			    j=i*2-1;
				System.out.print("-!"+i+"/"+j);
				if(i<n)
				System.out.print("+");	
			}	
			    i++;
		}
		System.out.print("="+sum);
		break;
		case 3:
		System.out.println("Enter any number:");
		n=sc.nextInt();
		while(i<=n)
		{
			fact*=i;
			
				sum+=(i*2-1/fact);
				j=i*2-1;
				System.out.print("!"+i+"/"+j+"+");
				
			    i++;
		}
		System.out.print("="+sum);
		}
	}
}