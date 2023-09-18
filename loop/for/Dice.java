import java.lang.Math;
import java.util.Scanner;
class Dice
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int max=6,min=1,sum=0;
		double random =Math.random();
		
		double x = Math.random()*6+1;
		int y = (int)x;
		
		System.out.print(y);
	}
}
		
		