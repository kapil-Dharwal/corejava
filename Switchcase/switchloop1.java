//loop to covert switch series
import java.util.Scanner;
class series_1
{
	public  static void main(String[]args)
	{
		double sum=0,fact=1;
		int i=1,j=0,choice,n;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your choice:1for -2/!1+4/!2-6/!3+8/!4-10/!5\n2for 1/2-!2/4+!3/6-!4/8+!5/10\n3for !1/2+!2/4+!3/6+!4/8+!5/10:");
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
				        sum+=(i*2/fact);
				        j=i*2;
				        System.out.print(j+"/"+"!"+i);
			        }
			        else
			        {
				        sum-=(i*2/fact);
				        j=i*2;
				        System.out.print("-"+j+"/"+"!"+i);
				        if(i<n)
				        System.out.print("+");
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
			if(i%2==0)
			{
				sum-=fact/(i*2);
				j=i*2;
				System.out.print("!"+i+"/"+j);
				System.out.print("+");
			}
			else
			{
				sum+=fact/(i*2);
				j=i*2;
				System.out.print("!"+i+"/"+j);
				if(i<n)
				System.out.print("-");
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
			sum+=fact/(i*2);
			{
				sum-=fact/(i*2);
				j=i*2;
				System.out.print("!"+i+"/"+j);
				if(i<n)
				System.out.print("+");
			}	
			    i++;
		}
		System.out.print("="+sum);
		
		}
	}
}