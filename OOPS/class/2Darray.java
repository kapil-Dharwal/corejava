import java.util.Scanner;
class Matrix
{
	private int a[][];
	private int rows,column;
	public void setData(int rows,int column)
	{
		this.a = new int [5][5];
		this.rows= rows;
		this.column = column;
	}
	public int rows()
	{
		return a.length;
	}
	public int column()
	{
		return a.length;
	}
	public void inputArrMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array  Element");
		for(int i=0 ; i<this.rows ; i++)
		{
			for(int j=0 ; j<this.column ; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void showArrMat()
	{
		System.out.println("Matrix Element are");
		for(int i=0 ; i<this.rows; i++)
		{
			for(int j=0 ; j<this.column ; j++)
			{
		        System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void pattern1()
	{
		System.out.println(" A matrix Element are:");
		for(int i=0 ; i<this.rows ; i++)
		{
			for(int j=0 ; j<this.column ; j++)
		    {
				System.out.print("\t"+a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void pattern2()
	{
		System.out.println("Pattern");
        for (int i = 0; i <this.rows ; i++) 
		{
           for (int j = 0; j <this.column; j++)
		   {
               if (i == 0||i ==this.rows-1||j ==0||j==this.column-1)
				{
                    System.out.print(a[i][j]+"\t");
                }
                else
				 System.out.print("\t");
            }
            System.out.println();
        }
	}
	public void pattern3()
	{
		System.out.println("Pattern");
        for (int i = 0; i <this.rows ; i++) 
		{
           for (int j = 0; j <this.column; j++)
		   {
               if (i != 0&&i !=this.rows-1&&j !=0&&j!=this.column-1)
				{
                    System.out.print(a[i][j]+"\t");
                }
                else
				 System.out.print("\t");
            }
            System.out.println();
        }
	}
	public void pattern4()
	{
		System.out.println(" A matrix Element are:");
		for(int i=0 ; i<this.rows ; i++)
		{
			for(int j=0 ; j<=i ; j++)
			{
				if(i==j)
				{
				   System.out.print(a[i][j]+"\t");
				}
				 else
				   System.out.print("\t");	 
			}
				System.out.println();
		}
	}
	public void pattern5()
	{
		System.out.println(" A matrix Element are:");
		for(int i=0 ; i<this.rows ; i++)
		{
			for(int j=0 ; j<this.column ; j++)
			{
				if(i+j==this.rows-1)
				{
				   System.out.print(a[i][j]+"\t");
				}
				 else
				   System.out.print("\t");	 
			}
				System.out.println();
		}
	}
	public void pattern6()
	{
		System.out.println(" A matrix Element are:");
	    for(int i=0 ; i<this.rows ; i++)
	    {
	    	for(int j=0 ; j<this.column ; j++)
	    	{
	    		if(i==j||i+j==this.column-1)
	    		System.out.print(a[i][j]+"\t");
	    		else
	    		System.out.print("\t");	 
	    	}
	        System.out.println();
	    }
	}
	public void pattern7()
	{
		for(int i=0 ; i<this.rows; i++)
		{
			for(int j=0 ; j<this.column ; j++)
			{
				if(i==j||(i>=0&&i<=this.rows-1&&j==this.column/2)||i+j==this.rows-1)
				{
				   System.out.print(a[i][j]+"\t");
				}
				else
				   System.out.print("\t");	 
			}
		    System.out.println();
		}
	}
}
class Test                                                                                       
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int ch,res;
		Matrix ob = new Matrix();
		System.out.println("Enter a row");
		int r = sc.nextInt();
		System.out.println("Enter a column");
		int c = sc.nextInt();
		ob.setData(r,c);
		ob.inputArrMat();
		ob.showArrMat();
		do
		{
			System.out.println("\tYour choice are");
			System.out.println("\t1.5 by 5 Matrix \n\t2.Boundry Matrix");
			System.out.println("\t3.Under Matric \n\t4.Left Digonal");
			System.out.println("\t5.Right Digonal \n\t6.Cross Digonal");
			System.out.println("\t7.Center Digonal");
			System.out.println("\tEnter your choice");
		    ch = sc.nextInt();
			switch(ch)
			{
				case 1:  
				     ob.pattern1();
			    break;	
				case 2:   
				       ob.pattern2();
			    break;	
				case 3:   
				       ob.pattern3();
			    break;	
				case 4:   
				       ob.pattern4();
			    break;	
				case 5:   
				       ob.pattern5();
			    break;	
				case 6:   
				       ob.pattern6();
			    break;	
				case 7:  
				      ob.pattern7();
			    break;	
		    }
		}
		while(ch!=8);
	}
}