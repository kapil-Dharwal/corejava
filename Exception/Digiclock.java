class Main extends Thread
{
		public void run()
		{
			int sec=0,min=0;
			for(int hor=0;hor<24;)
			{
				sec++;
				if(sec==60)
				{
					min++;
					sec=0;	
				}
				if(min==60)
				{	
					hor++;
					min=0;
				}
					System.out.print("\r"+hor+":"+min+":"+sec);
					try
					{
						Thread.sleep(1000);
						
					}
					catch(InterruptedException i){}
					//System.out.print("\r");
			}
		}
}
class TestMain
{
	public static void main(String arg[])
	{
		Main m=new Main ();
		m.start();
	}
}
