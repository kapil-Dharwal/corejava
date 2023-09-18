import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		int i=0,fact=1,pow=1,sum=0,n=10,r,y,j;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=10; System.out.println(i),i++);
		for(i=1;i<=10;i++, System.out.println(i));
		for(i=1;i>=10;++i, System.out.println(i));
		for(i=1;i<=10; System.out.println(i++));
		for(i=1;i<=10; System.out.println(++i));
		
		for(i=1;i<=10;i++);
		{
			System.out.print(i);
		}
		System.out.print("hello");
		for(i=1;i<=10; System.out.print("hello"),i++);
		for(i=1;i<=n;fact=fact*i,i++);
		System.out.print(fact);
		for(i=1,pow=1;i<=y;pow=pow*n,i++);
		System.out.print(pow);
		for(sum=0;n>0;n=n/10);
		{
			r=n%10;
			sum=sum+r;
		}
		System.out.print(sum);
		for( ; i<=10; );
		{
			System.out.print(i);
			i++;
		}
		for( ;i<=10; );
		{
			System.out.print(i);;
			i++;
		}
		for(  ;  ;  );
		{
			System.out.print("Hello");
		}
		for(i=1,j=3;i<=10;i++,j=j+3)
			System.out.print(i,j);
		for(i=1,j=3;i<=5;i++,j=j+3)
			System.out.print(i,j);
	
	}
}
