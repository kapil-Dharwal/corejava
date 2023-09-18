class Main extends Thread
{
	public static void main(String arg[])
	{
		for(int hor=0;hor<24;hor++)
		{
			for(int min=0;min<60;min++)
			{
				for(int sec=0;sec<60;sec++)
				{
					System.out.print(hor+" "+min+" "+sec);
					try
					{
						Thread. sleep(500);
					}
					catch(InterruptedException e) 
					{}
					System.out.print("\r");
				}
			}
		}
		//System.out.print(hor+" "+min+" "+sec);
	}
}
