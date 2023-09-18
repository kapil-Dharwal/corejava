class compondinterest
{
	public static void commpond()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Principle");
		int p=sc.nextInt();

		System.out.println("Enter the rate");
		int r=sc.nextInt();

		System.out.println("Enter the Time");
		int t=sc.nextInt();

		int a=p*(1*t+r*t/100);
		System.out.println("Commpond Interest=" +a);

	}
	public static void main(String args[])
	{
	Cinterest ob =new Cinterest();
	ob.commpond();
	}
}