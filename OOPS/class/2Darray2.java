import java.util.Scanner;
class Matrix
{
	private int a[][];
	private int rows,column;
	public void setData(int rows,int column)
	{
		this.a = new int [3][3];
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
		        System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public int sum2dArray()
	{
		int sum=0,i,j;
		for(i=0 ; i<this.rows ; i++)
		{
			for(j=0 ; j<this.column ; j++)
			{
				sum = sum+a[i][j];
			}
		}
		return sum;
	}
	public int minimum()
	{
		int min=a[0][0],i,j;
		for(i=1 ; i<this.rows ; i++)
		{
			for(j=0 ; j<this.column ; j++)
			{
				if(a[i][j]<min)
				{
					min = a[i][j];
				}
			}
		}
		return min;
	}
	public int maximum()
	{
		int max=0,i,j;
		for(i=0 ; i<this.rows ; i++)
		{
			for(j=0 ; j<this.column ;j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		return max;
	}
	public int secMin()
	{
		int min =a[0][0],min2=a[0][0],i,j;
		for(i=0 ; i<this.rows ; i++)
		{
			for(j=0 ; j<this.column ; j++)
			{
				min = a[0][0];
				for(i=0 ; i<this.rows ; i++)
		        {
		          	for(j=0 ; j<this.column ; j++)
			        {
						if(a[i][j]<=min)
							min = a[i][j];
					}
				}
				 min2 = a[0][0];
				for(i=0 ; i<this.rows ; i++)
				{
					for(j=0 ; j<this.column ; j++)
					{
						if(a[i][j]>min&&a[i][j]<=min2)
							min2 = a[i][j];
					}
				}					
			}
		}
		return min2;
	}
	public int secMax()
	{
		int max =0,max2=0,i,j;
		for(i=0 ; i<this.rows ; i++)
		{
			for(j=0 ; j<this.column ; j++)
			{
				if(a[i][j]>max)
				{	
				  max2 = max;
				  max = a[i][j];
				}
				else if(a[i][j]<max&&a[i][j]>max2)
				{
					max2 = a[i][j];
				}
			}
		}
		return max2;
	}
	public void tranpose()
	{
		for(int i=0 ; i<this.rows ; i++)
		{
		    for(int j=i+1 ; j<this.column ; j++)
			{
			   int temp=a[i][j];
			    a[i][j]=a[j][i];
                a[j][i]=temp;
			}
         	System.out.println();
	    }
		System.out.println(" Transpose matrix :");
		for(int i=0 ; i<this.rows ; i++)
		{
		    for(int j=0 ; j<this.column ; j++)
			{
			   System.out.print(a[i][j]+" ");
			}
			System.out.println();
	    }
	}
	public void upperTri()
	{
		
			System.out.println("upper triangular matrix: ");    
			for(int  i = 0; i <this.rows; i++)
			{    
			    for(int j = 0; j <this.column; j++)
			    {    
					if(j < i) 
					{					
					  System.out.print("  ");    
					}
					else    
					{
					  System.out.print(a[i][j] + " ");
					}				  
			    }    
			    System.out.println();    
		    } 
				
	}
	public void lowerTri()
	{
	    for(int  i = 0; i <this.rows; i++)
		{    
			for(int j = 0; j <=i; j++)
			{    
			    System.out.print(a[i][j] + " ");      
		    }    
		    System.out.println();    
        } 
    }
	public void digonal()
	{
		int sum=0;
		for(int i=0 ; i<this.rows ; i++)
	    {
			for(int j=0 ; j<=i ; j++)
			{
				if(j>=i&&j<=this.rows)
				{
					System.out.print(a[i][j]);
				    sum=sum+a[i][j];
				}
				else
				System.out.print(" ");	 
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
			System.out.println("\t1.Sum2dArray \n\t2.Minimum Number");
			System.out.println("\t3.Maximum Number \n\t4.Second Minimum Number");
			System.out.println("\t5.Second Maximum Number \n\t6.Tranpose Matix");
			System.out.println("\t7.Upper Triangle \n\t8.Lower Triangle");
			System.out.println("\t9.Digonal Matrix");
			System.out.println("\tEnter your choice");
		    ch = sc.nextInt();
			switch(ch)
			{
				case 1: res = ob.sum2dArray();
				       System.out.println("Sum="+res);
			    break;	
				case 2: res = ob.minimum();
				        System.out.println("Minimum Number="+res);
			    break;	
				case 3: res= ob.maximum();
				       System.out.println("Maximum Number="+res);
			    break;	
				case 4: res = ob.secMin();
                        System.out.println("Second Minimum Number="+res);
			    break;
				case 5: res = ob.secMax();
				        System.out.println("Second Maximum Number="+res);
			    break;
				case 6:   ob.tranpose();
			    break;	
				case 7: ob.upperTri();
				      
			    break;	
				case 8:  ob.lowerTri();
				      
			    break;	
				case 9:  
				       ob.digonal();
			    break;	
					
			}
		}
		while(ch!=10);
	}
}