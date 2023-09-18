import java.lang.String;
import java.util.Scanner;
class Foreach
{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a[][]={{1,2,3,4},{2,3,9,6},{3,4,5,7}};
			
			{
					for(int i[]:a)
					{
						for(int j:i)
					    System.out.print(j+" ");
					}
					System.out.println(" ");
				}
		}
}