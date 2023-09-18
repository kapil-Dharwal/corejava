import java.util.Scanner;
class ArmStrongNumber
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int Sum=0,r=0,Num=sc.nextInt();
		int tem=Num;
		while(Num>0)
		{
			r=Num%10;
			Sum+=(r*r*r);
			Num/=10;
		}
		if(tem==Sum)
		{
			System.out.println("Armstrong number:");
		}
		else
		{
			System.out.println("Not Armstrong number:");
		}
     
	}
}