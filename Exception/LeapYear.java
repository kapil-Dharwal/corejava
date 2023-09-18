class Year extends Exception
{
	Year (){}
	
	Year (String msg)
	{
		super(msg);
	}
}
class TestMain
{
	public static void main(String args[])
	{
	try
		{
		int y=Integer.parseInt(args[0]);
		if(y%400==0||y%100==0||y%4==0)
        {
			throw new Year (y+" LEAP YEAR EXCEPTION");
        }
		else
		{
			System.out.println(y);
		}
	}
		catch(Year ref)
		{
			System.out.println(ref);
			System.out.println(ref.getMessage());
		}
	}
}