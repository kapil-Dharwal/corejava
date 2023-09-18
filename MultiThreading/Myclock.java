class MyClock
{
		public static void main(String args []) throws InterruptedException
		{
			for(int i=0;i<=24;i++)
				for(int j=0;j<=59;j++)
					for(int k=0;k<=59;k++)
					{
						//System.out.print(i+":"+j+":"+k+"\r");
						System.out.print("\r"i++j+"%02d:%02d:%02d",i,j,k);
						Thread.sleep(1);
					}
		}
}