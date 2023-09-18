import java.util.Scanner;
class StudentPOJO
{
	private int roll,sem,year,p,c,m,e,h,tol;
	private double per;
	private String name,fn,mn,cor,brch,uc; 
	
	public StudentPOJO(int roll,int sem,int year,int p,int c,int m,int e,int h,int tol,double per,String name,String fn,String mn,String cor,String brch,String uc)
	{
		this.roll=roll;
		this.sem=sem;
		this.year=year;
		this.p=p;
		this.c=c;
		this.m=m;
		this.e=e;
		this.h=h;
		this.tol=this.p + this.c + this.m + this.h + this.e;;
		this.per=this.tol/5.0;
		this.name=name;
		this.fn=fn;
		this.mn=mn;
		this.cor=cor;
		this.brch=brch;
		this.uc=uc;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setSemester(int sem)
	{
		this.sem=sem;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFatherName(String fn)
	{
		this.fn=fn;
	}
	public void setMotherName(String mn)
	{
		this.mn=mn;
	}
	public void setCourse(String cor)
	{
		this.cor=cor;
	}
	public void setBranch(String brch)
	{
		this.brch=brch;
	}
	public void setUnversity(String uc)
	{
		this.uc=uc;
	}
	public void setPhysics(int p)
	{
		this.p=p;
	}
	public void setChemistry(int c)
	{
		this.c=c;
	}
	public void setMaths(int m)
	{
		this.m=m;
	}
	public void setEnglish(int e)
	{
		this.e=e;
	}
	public void setHindi(int h)
	{
		this.h=h;
	}
	public void setTotal()
	{
		this.tol=+this.getPhysics()+this.getChemistry()+this.getMaths()+this.getEnglish()+this.getHindi();
	}
	public int getTotal()
	{
		return this.tol;
	}
	public void setPercentage()
	{
		this.per=getTotal()/5;
	}
	public double getPercentage()
	{
		return this.per;
	}
	public int getRoll()
	{
		return this.roll;
	}
	public int getSemester()
	{
		return this.sem;
	}
	public int getYear()
	{
		return this.year;
	}
	public String getName()
	{
		return this.name;
	}
	public String getFatherName()
	{
		return this.fn;
	}
	public String getMotherName()
	{
		return this.mn;
	}
	public String getCourse()
	{
		return this.cor;
	}
	public String getBranch()
	{
		return this.brch;
	}
	public String getUniversity()
	{
		return this.uc;
	}
	public int getPhysics()
	{
		return this.p;
	}
	public int getChemistry()
	{
		return this.c;
	}
	public int getMaths()
	{
		return this.m;
	}
	public int getEnglish()
	{
		return this.e;
	}
	public int getHindi()
	{
		return this.h;
	}
}

//Business logic
class Operation
{
	public void getData(StudentPOJO std[],int i,int n)
	{
			int roll=std[i].getRoll(),sem=std[i].getSemester(),year=std[i].getYear(),p=std[i].getPhysics(),c=std[i].getChemistry(),m=std[i].getMaths(),e=std[i].getEnglish(),h=std[i].getHindi(),tol=std[i].getTotal();
			double d=std[i].getPercentage();
			String name=std[i].getName(),fn=std[i].getFatherName(),mn=std[i].getMotherName(),cor=std[i].getCourse(),brch=std[i].getBranch(),uc=std[i].getUniversity(); 
			System.out.println("\t----------------------------------------------------------------------");  
			System.out.println("\t                     "+  uc        +"                                 ");
			System.out.println("\t-----------------------------------------------------------------------"); 
			System.out.println("\tName  :"+   name   +"                \t\t\t  Course :"+     cor  +"\t ");
			System.out.println("\t----------------------------------------------------------------------");
			System.out.println("\tRoll.N:"+    roll  +"             	 \t\t\t  Branch :"+     brch +"\t");
			System.out.println("\t----------------------------------------------------------------------");
			System.out.println("\tFather Name :"+      fn     +"       \t\t\t  Sem    :"+     sem  +"\t");
			System.out.println("\t----------------------------------------------------------------------");
			System.out.println("\tMother Name :"+     mn      +"       \t\t\t  Year   :"+     year +"\t");
			System.out.println("\t----------------------------------------------------------------------");
			System.out.println("\t   SubCode  |   SubName   |   MaxMarks  |    MinMarks |  Obtmarks  ");
			System.out.println("\t----------------------------------------------------------------------");
			System.out.println("\t    101     |   English   |     70      |     33      |   "+e+"    ");
			System.out.println("\t    102     |   Hindi     |     70      |	 	33      |   "+h+"    ");
			System.out.println("\t    103     |   Physics   |     70      |     33      |   "+p+"    ");
			System.out.println("\t    104     |   Chemistry |     70      |     33      |   "+c+"    ");
			System.out.println("\t    105     |   Maths     |     70      |     33      |   "+m+"    ");
			System.out.println("\t----------------------------------------------------------------------");
			if(p<33&&c<33&&m<33&&h<33&&e<33)
			System.out.println("all subject fail");
			else if((p<33&&c<33&&m<33&&h<33)||(p<33&&c<33&&m<33&&e<33)||(p<33&&c<33&&h<33&&e<33)||(p<33&&m<33&&h<33&&e<33)||(c<33&&m<33&&h<33&&e<33))
				if(p<33&&c<33&&m<33&&h<33)
				System.out.println("fail in four sub phy and chem and maths and hindi");
				else if(p<33&&c<33&&m<33&&e<33)
				System.out.println("fail in four sub is phy and chem and maths and english");
				else if(p<33&&c<33&&h<33&&e<33)
				System.out.println("fail in four sub is physics and chem and hindi and english");
				else if(p<33&&m<33&&h<33&&e<33)
				System.out.println("fail in four sub is physics and maths and hindi and english");
				else 
				System.out.println("fail in four sub is chemistry and maths and hindi and english");
				else if((p<33&&c<33&&m<33)||(p<33&&c<33&&h<33)||(p<33&&c<33&&e<33)||(c<33&&m<33&&e<33)||(c<33&&m<33&&h<33)||(m<33&&h<33&&e<33)||     (m<33&&h<33&&p<33)||(h<33&&p<33&&e<33)||(e<33&&p<33&&m<33))
				if(p<33&&c<33&&m<33)
				System.out.println("fail in three sub phy and chem and maths");
				else if(p<33&&c<33&&h<33)
				System.out.println("fail in three sub phy and chem and hindi");
				else if(p<33&&c<33&&e<33)
				System.out.println("fail in three sub phy and chem and english");
				else if(c<33&&m<33&&e<33)
				System.out.println("fail in three sub chem and maths and english");
				else if(c<33&&m<33&&h<33)
				System.out.println("fail in three sub chem and maths and hindi");
				else if(m<33&&h<33&&e<33)
				System.out.println("fail in three sub maths and hindi and english");
				else if(m<33&&h<33&&p<33)
				System.out.println("fail in three sub maths and hindi and phy");
				else if(h<33&&p<33&&e<33)
				System.out.println("fail in three sub phy and hindi and english");
				else 
				System.out.println("fail in three sub phy and maths and english");
				else if((p<33&&c<33)||(p<33&&m<33)||(p<33&&h<33)||(p<33&&e<33)||(c<33&&m<33)||(c<33&&h<33)||(c<33&&e<33)||(m<33&&h<33)||(m<33&&e<33)||(h<33&&e<33))
				if(p<33&&c<33)
				System.out.println("fail in two sub phy and chem");
				else if(p<33&&m<33)
				System.out.println("fail in two sub phy and maths");
				else if(p<33&&h<33)
				System.out.println("fail in two sub phy and hindi");
				else if(p<33&&e<33)
				System.out.println("fail in two sub phy and english");
				else if(c<33&&m<33)
				System.out.println("fail in two sub chem and maths ");
				else if(c<33&&h<33)
				System.out.println("fail in two sub chem and hindi ");
				else if(c<33&&e<33)
				System.out.println("fail in two sub chem and english");
				else if(m<33&&h<33)
				System.out.println("fail in two sub maths and hindi ");
				else if(m<33&&e<33)
				System.out.println("fail in two sub maths and english");
				else
				System.out.println("fail in two sub hindi and english");
				else  if(p<33||c<33||m<33||h<33||e<33)      
				if(p<33)
				System.out.println("fail in one sub phy"); 
				else if(c<33)
				System.out.println("fail in one sub chem"); 
				else if(m<33)
				System.out.println("fail in one sub maths");
				else if(h<33)
				System.out.println("fail in one sub hindi");
				else
				System.out.println("fail in one sub english");
				else 
					System.out.println("Total Marks is = "+std[i].getTotal());
					System.out.println("percantage is ="+std[i].getPercentage());
					if(d>=65)
					System.out.println("Pass in First Division");
					else if(d>=45)
					System.out.println("Pass in Second Division");
					else if(d>=33)
					System.out.println("Pass in Third Division");
					else
					System.out.println("pappu pass hogaya"); 
	}
}
//Client App
class Test
{
	static int i,n;
	static String resetColor = "\u001B[2m";
	static String color = "\u001B[31m";
	public static void main(String args[])
	{
		Operation ob1 = new Operation();
		StudentPOJO std[] = new StudentPOJO[100];
		Scanner sc = new Scanner(System.in);
		int m=0; 
		int ch;
		do{
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("|                                                                                                   |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t 1. Insert Record   \t\t\t\t  2. Check Record     \t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|\t\t 3. Update Record   \t\t\t\t  4. Exit    \t\t\t    |");
			System.out.println("|\t\t--------------------\t\t\t\t----------------------\t\t    |");
			System.out.println("|                                                                                                   |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			ch=sc.nextInt();
				switch(ch)
				{
					case 1:
						if(i==0)
						{	
							System.out.println("how many student record insert");
							n = sc.nextInt();
							Test.input(std,ob1,sc,m);
						}
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t     Record Is Exeist Please Update Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;	
					case 2:
						if(i!=0)
						{
							Test.seaching(std,ob1,i,n,sc);
						}	
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t     No Record Found Please First Insert Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;
					case 3:
						if(i!=0)
						{
							System.out.println("how many update record you want to enter ");
							m = sc.nextInt();
							Test.input(std,ob1,sc,m);
						}
						else
						{
							System.out.println(color+"\t\t-----------------------------------------------------------");
							System.out.println("\t\t\t     No Record Found Please First Insert Record \t");
							System.out.println("\t\t-----------------------------------------------------------"+resetColor);
						}
						break;
				}
		}while(ch!=4);
		
	}
	public static void input(StudentPOJO std[],Operation ob1,Scanner sc,int k)
	{
		n=n+k;
		int roll,sem,year,p,c,m,e,h,tol;
		double per;
		String name,fn,mn,cor,brch,uc; 
		for(;i<n;i++)
		{
			roll=Test.rollNumber(std,i,sc);
			System.out.println("Enter your year:");
			year=sc.nextInt();
			System.out.println("Enter your semester:");
			sem=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your name:");
			name = sc.nextLine();
			System.out.println("Enter your Father's name:");
			fn=sc.nextLine();
			System.out.println("Enter your Mother's name:");
			mn=sc.nextLine();
			System.out.println("Enter your Course:");
			cor=sc.nextLine();
			System.out.println("Enter Your Branch Name =");
			brch=sc.nextLine();
			System.out.println("Enter Your Collage name =");
			uc=sc.nextLine();
			System.out.println("Enter the physics marks");
			p =Test.takeMarks(sc); 
			System.out.println("Enter the chemistry number"); 
			c =Test.takeMarks(sc);
			System.out.println("Enter the math number");
			m =Test.takeMarks(sc);
			System.out.println("Enter the hindi number");
			h =Test.takeMarks(sc);
			System.out.println("Enter the english number");
			e =Test.takeMarks(sc);
			tol =p+c+m+h+e;
			per = tol/5;	
			std[i]=new StudentPOJO(roll,sem,year,p,c,m,e,h,tol,per,name,fn,mn,cor,brch,uc);			
		}
		
	}
	public static  int rollNumber(StudentPOJO std[],int i,Scanner sc)
	{
		boolean z;
		int roll;
		do
		{
			System.out.println("Enter the roll number");
			roll=sc.nextInt();
			//std[i].setRoll(roll);
			sc.nextLine();
			z = false; 	
			for(int k=0;i>0&&k<i; k++)
			if(std[k].getRoll()==roll)
			{
				System.out.println("roll number already please correct roll number\n");
				z=true;
			}
		}while(z);
		return roll;
	}
	public static int takeMarks(Scanner sc)
	{
		int marks;
		do
		{	marks=sc.nextInt();
			if(marks<0||marks>100)	
			{
				System.out.println("Invalid Mark  Please Enter Valid Mark");
			}
		}while(marks<0||marks>100);
		return marks;
	}
	public static void seaching(StudentPOJO std[],Operation ob1,int i,int n,Scanner sc)
	{
		int ch=0;
		do
		{
			System.out.println("\t1 for All Marksheet Searching");
			System.out.println("\t2 for Perceantage Searching");
			System.out.println("\t3 for Roll Number Searching");
			System.out.println("\t4 for Name Number Searching");
			System.out.println("\t5 Exit");
			ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
				case 1 :for(i=0;i<n;i++)
						{
								ob1.getData(std,i,n);
						}
						break;
				case 2 :System.out.println("Please Enter Search Perceantage");
						double m=sc.nextDouble();
						for(i=0;i<n;i++)
						{
							if(m==std[i].getPercentage())
							{
								ob1.getData(std,i,n);
							}
						} 
						break;
				case 3 :System.out.println("Enter seaching Roll Number");
						int num =sc.nextInt();
						for(i=0;i<n;i++)
						{
							if(std[i].getRoll()==num)
							{
								ob1.getData(std,i,n);
							}
						}
						break;
				case 4 :System.out.println("Please Enter Searching Name");
						String naam=sc.nextLine();
						for(i=0;i<n;i++)
						{
							if(std[i].getName().equalsIgnoreCase(naam))
							{
								ob1.getData(std,i,n);
							}
						}
						break;
			}
		}while(ch!=5);
	}	
	}