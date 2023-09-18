import java.lang.String;
public class Equals
{
		public static void main(String args [])
		{
			String S1="Ankit";
			String S2=new String("Ankit");
			
			if(S1.equals(S2))
				System.out.println("Both are same....");
			else
				System.out.println("Both are Different...");
		}
}