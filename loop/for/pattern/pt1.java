import java.util.Scanner;
class Pt1
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a num: ");
int n = sc.nextInt();
int i,j,k,l;

		for(i=1; i<=n; i++)
		{
			for(j=1;  j<n; j++)
			System.out.print(" ");
			
			for(k=1; k<=i; k++)
			System.out.print(k);	
			
			for(l=1; l<=j; l++);
			System.out.print("\n");
		
		}
		



}
}