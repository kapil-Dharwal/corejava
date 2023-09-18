import java.util.Scanner;
class Ladder_Snake
{
    public static void main(String agr[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("\t^^^^^");
		System.out.println("\tSnake & Ladder");
		System.out.println("\t^^^^^");
		System.out.println("\t^^^^^");
		System.out.println("\tKapil  & Swati");
			int sum1=0,sum2=0,i=1,s=1;
		do
		{
			if(i%2==0)
			{
				System.out.println("\tPlayer2 turn\ncontinue game player2 than press k and K");
				char ch1=sc.next().charAt(0);
				if(ch1=='K'||ch1=='k')
				{
					int k= (int)(Math.random()*6+1);
					if((sum2+k)<=100)
					sum2+=k;
					System.out.println(">>>p2<<<"+k);
					if(sum2==5)
					{
					sum2=(5+13);
					System.out.println(">>>climbing public<<<"+sum2);
					}
					if(sum2==20)
					{
					sum2=(20+22);
					System.out.println(">>climbing public<<<"+sum2);
					}
					if(sum2==29)
					{
					sum2=(29-22);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
					if(sum2==39)
					{
					sum2=(39-36);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
					if(sum2==32)
					{
					sum2=(32+66);
					System.out.println(">>>climbing public<<<"+sum2);
					}
					if(sum2==79)
					{
					sum2=(79-38);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
					if(sum2==92)
					{
					sum2=(92-37);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
					if(sum2==90)
					{
					sum2=(90-22);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
					if(sum2==59)
					{
					sum2=(59+15);
					System.out.println(">>>climbing public<<<"+sum2);
					}
			
					if(sum2==96)
					{
					sum2=(96-66);
					System.out.println(">>>Snake Bite<<<"+sum2);
					}
						if(sum2==100)
						{
							System.out.println(">>>Kapil win<<<"+sum2);
							System.out.println(">>>swati looser<<<");
		                    System.exit(0);
						}
				}
			}
			else
			{
				System.out.println("\tplayer1 turn\t\ncontinue game player1 than press s and S:");
				char ch=sc.next().charAt(0);
				if(ch=='s'||ch=='S')
				{
					int k= (int)(Math.random()*6+1);
					if((sum1+k)<=100)
					sum1+=k;
					System.out.println("<<<p1>>>"+k);
					
					if(sum1==5)
					{
					sum1=(5+13);
					System.out.println(">>>climbing public>>>"+sum1);
					}
					if(sum1==20)
					{
					sum1=(20+22);
					System.out.println(">>>climbing public<<<"+sum1);
					}
					if(sum1==90)
					{
					sum1=(90-22);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
					if(sum1==29)
					{
					sum1=(29-22);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
					if(sum1==39)
					{
					sum1=(39-36);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
					if(sum1==59)
					{
					sum1=(59+15);
					System.out.println(">>>climbing public<<<"+sum1);
					}
					if(sum1==79)
					{
					sum1=(79-38);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
					if(sum1==92)
					{
					sum1=(92-37);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
					if(sum1==32)
					{
					sum1=(32+66);
					System.out.println(">>>climbing public<<<"+sum1);
					}
					if(sum1==96)
					{
					sum1=(96-66);
					System.out.println(">>>Snake Bite<<<"+sum1);
					}
						if(sum1==100)
						{
							System.out.println(">>Kapil win<<"+sum1);
							System.out.println(">>>Swati looser>>>");
							System.exit(0);
						}
				}
		    }
		   i++;
		}
		while(i<=sum1||i<=sum2);
	}
}