class Reverse
{
	private int n;
	public void setData(int n)
	{
		this.n = n;
	}
	public int getData()
	{
		return n;
	}
	public int reverse()
	{
		int rev = 0;
        	int temp = n; 
        	while (temp != 0) 
		{
            		int rem = temp % 10;
            		rev = rev * 10 + rem;
            		temp = temp / 10;
		}
		return rev;
	}
}
class Palindrome extends Reverse
{
	public boolean palindrome()
	{
		return getData()==reverse();		
	}	
}
class TestMain
{
	public static void main(String args[])
	{
		Palindrome ob  = new Palindrome();
		ob.setData(548);
		System.out.println("Reverse = "+ob.reverse());
		System.out.println("Number is palindrome = "+ob.palindrome());
	}
}