class TestMain 
{
	public static void main(String args[])
	{
		int a[] = new int [25];
		int cnt= 0,cnt2 = 0;;
		
		for(int k=0; k<args.length && k<a.length; k++)
		{
			try
			{
				a[k] = Integer.parseInt(args[k]); 
				cnt++;
			}
			catch (NumberFormatException ref)
			{
				cnt2++;
			}
		}
		System.out.println("valid integer = "+cnt);
		System.out.println("invalid integer = "+cnt2);
	}
}