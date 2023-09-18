class SimpleIntrest
{
   public static void intres()
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     
     System.out.println("Enter the Principal");
     int p=sc.nextInt();
     
     System.out.println("Enter the Interust Rate");
     int r=sc.nextInt();
     
      
     System.out.println("Enter the time");
     int t=sc.nextInt();
     
     int si=(p*r*t)/100;
     
     System.out.println("Simple Interust=" +si);
  }
		public static void main(String args[])
		{
			Si.intres();
		}
 }