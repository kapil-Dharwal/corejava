import java.util.Scanner;
class series_5
{
	public  static void main(String[]args)
	{
		double sum=0,fact=1;
		int i=1,j=0,choice,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your choice:\n1for!1/1-!2/3+!3/5-!4/7+!5/9\n2for-1.0/!1+3.0/!2-5.0/!3+7.0/!4-9.0/!5\n3for+1.0/!1!3.0/2+5.0/!3!7.0/4+9.0/!5:");
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
			if(i%2==0)
			{
				sum+=(i*2-1/fact);
				j=i*2-1;
				System.out.print("!"+i+"/"+j+"+");
			}
			else
			{
				sum-=(i*2-1)/fact;
			    j=i*2-1;
				System.out.print("!"+i+"/"+j);
				if(i<n)
				System.out.print("-");	
			}	
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
			if(i%2!=0)
			{
				sum-=(j/fact);
				System.out.print("-"+j+"/!"+i);
			}
			else
			{
				sum+=(j/fact);
				System.out.print("+"+j+"/!"+i);
			}	
			    i++;
				j=j+2;
		}
		System.out.print("="+sum);
		break;
		case 3:
		System.out.println("Enter any number:");
		n=sc.nextInt();
		while(i<=n)
		{
			fact*=i;
			if(i%2==0)
			{
				sum-=(j/fact);
				System.out.print("-"+j+"/!"+i);
			}
			else
			{
				sum+=(j/fact);
				System.out.print("+"+j+"/!"+i);
			}	
			    i++;
				j=j+2;
		}
		System.out.print("="+sum);
		}
	}
}
		