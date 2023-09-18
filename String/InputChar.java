import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Test
{
		public static void main(String args [])throws IOException
		{
			InputStreamReader a=new InputStreamReader (System.in);
			BufferedReader b=new BufferedReader(a);
			char input=(char)b.read();
			System.out.println(input);
		}
}