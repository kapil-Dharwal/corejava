import inputpack;
public class PublicInput
{
	void inputnumber()
	{
			public int inputRoll(int n, Student a[],int x,Scanner sc)
			{
				int roll;
				boolean flag=false;
				
				System.out.println("Enter your roll no:");
				roll=sc.nextInt();
				for(int i=0; x>0&&i<x; i++)
				{
					if(a[i].getRollNumber()==roll)
					{
						System.out.println("Roll no already exist re-enter roll no");
						flag=true;
					}
				}
				if(flag)
				{
					roll = inputRoll(n,a,x,sc);
				}
				return roll;
			}
			public void input(int n,Student std[],TestMain ob,operation op)
			{
				String name,fname,mname,course,branch;
				int roll ,year,sem,p,c,m,h,e,total;
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<n;i++)
				{
				roll = ob.inputRoll(n,std,i,sc);
				
				System.out.println("Enter your name:");
				name=sc.next();
				
				System.out.println("Enter your Father's name:");
				fname=sc.next();
				
				System.out.println("Enter your Mother's name:");
				mname=sc.next();
				
				System.out.println("Enter your Course:");
				course=sc.next();
			
				System.out.println("Enter your Branch");
				branch=sc.next();
				
				System.out.println("Enter your year:");
				year=sc.nextInt();
				
				System.out.println("Enter your sem:");
				sem=sc.nextInt();
			
				
			  do
			   {
				   System.out.println("Enter the Mark of phycics");
				   p=sc.nextInt();
				  
				   if(p<0||p>100)
					System.out.println("Invalid Mark of phycics");
			   }
			   while(p<0||p>100);
				 
				do
				{
					System.out.println("Enter marks of chemistry");
					c = sc.nextInt();
					
					if(c<0||c>100)
						System.out.println("Invalid Mark of chemistry");
				}
				while(c<0||c>100);
				
				do
				{
					System.out.println("Enter marks of mathes");
					m = sc.nextInt();
					
					if(m<0||m>100)
						System.out.println("Invalid Mark of Mathes");
				}
				while(m<0||m>100);
						
				do
				{
					System.out.println("Enter marks of Hindi");
					h = sc.nextInt();
					
					if(h<0||h>100)
						System.out.println("Invalid Mark of Hindi");
				}
				while(h<0||h>100);
							
				do
				{
					System.out.println("Enter marks of English");
					e = sc.nextInt();
					
					if(e<0||e>100)
						System.out.println("Invalid Mark of English");
				}
				while(e<0||e>100);
				std[i] = new Student(name,fname,mname, course,branch,roll,year,sem,p,c,m,h,e);
				}
			}
	}
}