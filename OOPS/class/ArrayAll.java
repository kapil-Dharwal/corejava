import java.util.Scanner;
class ArrayOpration
{
	private int a[];
	private int len;
	public void setData(int len)
	{	
		this.a= new int[10];
		this.len = len	;
	}
	public int len()
	{
		return a.length;
	}
	public void inputArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element in Array");
		for(int i=0; i<this.len; i++)
		{
			this.a[i]=sc.nextInt();
		}
	}
	public void showArray()
	{
		System.out.println("\nArray Element are..");
		for(int i=0; i<this.len; i++)
		{
			System.out.print(a[i]+" ");
		}					
	}
	public void ascending()
	{	 	
		for(int i=0; i<this.len; i++)
		{
			for(int j=i+1; j<this.len; j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j]= temp;
				}
			}
		}					
	}
	public void descending()
	{	 	
		for(int i=0; i<this.len; i++)
		{
			for(int j=i+1; j<this.len-1; j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
						a[i] = a[j];
						a[j]= temp;
				}
			}
		}					
	}
	
	public int maxEle()
	{
		int max = this.a[0];
		for(int i=0;i<this.len; i++)
		{
			if(this.a[i]>max)
			{
				max=this.a[i];
			}
		}
		return max;
	}
	public int minEle()
	{
		int min =this.a[0];
		for(int i=0;i<this.len; i++)
		{
			if(this.a[i]<min)
			{
				min=a[i];
			}
		}
		return min;
	}
	
	public int sMax(ArrayOpration ob)
	{
		int max=ob.maxEle();
		int smax=0;		
		for(int i=0; i<this.len; i++)
		{
			if(this.a[i]>max)
			{
				smax=max;
				max=this.a[i];
			}
			else if(a[i]>smax && a[i]<max)
			{
				smax=a[i];
			}
		}
		return smax;
	}
	public int sMin(ArrayOpration ob)
	{
		int min=maxEle() ; //ob.minEle();
		int smin=0;		
		for(int i=0; i<this.len; i++)
		{
			if(this.a[i]<min)
			{
				smin=min;
				min=this.a[i];
			}
			else if(a[i]<smin && a[i]>min)
			{
				smin=a[i];
			}
		}
		return smin;
	}
	public int sumEle()
	{
		int sum=0;
		for(int i=0;i<this.len;i++)
		{
			sum+=a[i];
		}
		return sum;
	}
	public void reverse()
	{
		for(int i=0; i<this.len/2; i++)
		{
			int temp= this.a[i];
			this.a[i]= this.a[this.len-i-1];	
			this.a[this.len-i-1]=temp;		 	
		}			
	}
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in); 
		ArrayOpration ob = new ArrayOpration();
		System.out.println("how many Element want you enter ");
		int len = sc.nextInt();
		ob.setData(len);
		ob.inputArray();
		int ch;
		do{
			System.out.println("\nyour choises are..");
			System.out.println("\t1 for show Array\n\t2 for Ascending array");
			System.out.println("\t3 for Descending Array\n\t4 for a Max Element");
			System.out.println("\t5 for Min Element Array\n\t6 for secondMax");
			System.out.println("\t7 for SecondMin Element \n\t8 for sum Element");
			System.out.println("\t9 for reverse Element \n\t10 for Exite ");
			System.out.println("Enter your choice...");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					ob.showArray();
				break;
				case 2:
					ob.ascending();
				break;
				case 3:
					ob.descending();
				break;
				case 4:
					System.out.println("Max = "+ob.maxEle());
				break;
				case 5:
					System.out.println("Min = "+ob.minEle());
				break;
				case 6:
					System.out.println("SMax = "+ob.sMax(ob));
				break;
				case 7:
					System.out.println("SMin = "+ob.sMin(ob));
				break;
				case 8:
					System.out.println("Sum = "+ob.sumEle());
				break;
				case 9:
					ob.reverse();
				break;	
			}
		}while(ch!=10);
	}
}