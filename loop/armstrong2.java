import java.util.Scanner;
class Armstrong
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int sum=0,r=0,con=0,n=sc.nextInt();
		int temp=n;
		while(n>0)
		{
			con++;
			n/=10;
		}
		n=temp;
		while(n>0)
		{
			r=n%10;
		    int i=1,p=1;
			while(i<=con)
			{
				p*=r;
				i++;
			}
			sum+=p;
			n/=10;
		}
		if(temp==sum)
		{
			System.out.println("Enter number is Armstrong");
		}
		else
		{
			System.out.println(" Enter number is not Armstrong");
		}
     
	}
}