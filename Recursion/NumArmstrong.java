import java.util.Scanner;
class NumArmstrong
{
	int sum = 0;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Armstrong ob = new Armstrong();
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int m=n;
		int a =ob.armstrong
		(n,ob.count(n));
		if(m==a)
			System.out.println("Number Armstrong");
		else
			System.out.println("Number Not Armstrong");
	}
	public int armstrong(int n,int m)
	{
		if(n>0)
		{
			sum+=pow(rem(n),m);
			this.armstrong(n/10,m);
		}
			return sum;
	}
	int rev=0,count=0;
	public int count(int x)
	{
		 if(x>0)
		{
			count++;
			this.count(x/10);
		}
		return count;
	}
	 public int rem(int x)
	 {
		  return x%10;
	 }
	public int pow(int rem,int count)
	{
	
		if(count==1)
		{
			return rem;
		}
		return rem*pow(rem,count-1);
		
	}
	
}