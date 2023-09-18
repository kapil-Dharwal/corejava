package MarkPack;
import java.util.Scanner;
public class operation
{
	public void choice(Student student[],int n,operation ob2) 
    { 
		Scanner sc = new Scanner(System.in); 
		int choice,searchRoll; 
        boolean flag; 
        String searchName; 
		do 
		{ 
			flag = true; 
			System.out.println("YOUR CHOICE"); 
			System.out.println("\t1 FOR SEARCH BY ROLL NUMBER"); 
			System.out.println("\t2 FOR SEARCH BY NAME"); 
			System.out.println("\t3 FOR SEARCH BY DIVISION"); 
			System.out.println("\t4 FOR ALL MARKSHEET"); 
			System.out.println("\t5 FOR EXIT"); 
			System.out.print("\tENTER YOUR CHOICE : "); 
			choice = sc.nextInt(); 
			sc.nextLine(); 
			switch(choice) 
			{ 
				case 1: 
					System.out.print("ENTER YOUR ROLL NUMBER : "); 
					searchRoll = sc.nextInt(); 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getRollNumber()==searchRoll) 
						{ 
							ob2.display(student,i); 
							flag = false; 
							break; 
						} 
					} 
					if(flag)
					{
						System.out.print("ENTER ROLL NUMBER NOT EXITS: "); 
					}	
					break;
				case 2:
					System.out.print("ENTER YOUR NAME : "); 
					searchName = sc.nextLine(); 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getName().equals(searchName)) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 				
					if(flag)
					{
						System.out.print("ENTER NAME NOT EXITS: "); 
					}	
					break;
				case 3: 
						ob2.searchDivision(student,n,ob2); 
                        break; 
				case 4: 
					for(int i=0;i<n;i++) 
					{ 
						ob2.display(student,i); 
					} 
					break;	
			}
		}while(choice!=5);
	}
	public void searchDivision(Student student[],int n,operation ob2)
	{ 
		Scanner sc = new Scanner(System.in); 
		boolean flag; 
		int choice; 
		do 
		{ 
			flag = true; 
			System.out.println("YOUR CHOICE"); 
			System.out.println("\t1 FOR FIRST DIVISION"); 
			System.out.println("\t2 FOR SECOND DIVISION"); 
			System.out.println("\t3 FOR THIRD DIVISION"); 
			System.out.println("\t4 FOR EXIT"); 
			System.out.print("\tENTER YOUR CHOICE : "); 
			choice = sc.nextInt(); 
			switch(choice) 
			{ 
				case 1: 
					for(int i=0;i<n;i++) 
					{ 
						System.out.println(student[i].getPer());
						if(student[i].getPer()>=60&&student[i].getPer()<=100&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						
						System.out.println("FIRST DIVISION STUDENT NOT AWAILAVEL"); 
					} 
					break; 
				case 2: 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getPer()>=45&&student[i].getPer()<60&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						System.out.println("SECOND DIVISION STUDENT NOT AWAILAVEL"); 
					}	 
					break; 
				case 3: 
					for(int i=0;i<n;i++) 
					{ 
						if(student[i].getPer()>=33&&student[i].getPer()<45&&student[i].getP()>33&&student[i].getC()>33&&student[i].getM()>33&&student[i].getH()>33&&student[i].getE()>33) 
						{ 
							ob2.display(student,i); 
							flag = false; 
						} 
					} 
					if(flag) 
					{ 
						System.out.println("THIRD DIVISION STUDENT NOT AWAILAVEL"); 
					}
			}
		}while(choice!=4); 
	}	
	public void display(Student std[], int i)
	{
		System.out.println("----------------------------------------------------------------------");
		System.out.println("\t\t\tS.S.I.S.M");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Roll no. :"+std[i].getRollNumber()+"\t\t\t\t\t\t" +"Course :"+std[i].getCourse());
		System.out.println("Name    :"+std[i].getName()+"\t\t\t\t\t\t" +"Branch :"+std[i].getBranch());
		System.out.println("FName   :"+std[i].getFname()+"\t\t\t\t\t\t" +"Sem    :"+std[i].getSem());
		System.out.println("MName   :"+std[i].getMname()+"\t\t\t\t\t\t" +"Year   :"+std[i].getYear());
		System.out.println("----------------------------------------------------------------------");
		System.out.println("|\tSUBCODE      SUBNAME       MAXMARKS      MINMARKS      OBTMARKS");
		System.out.println("|\tBSC101       PHYSICS        100            33            "+std[i].getP());
		System.out.println("|\tBSC102       CHEMISTRY      100            33            "+std[i].getC());			
		System.out.println("|\tBSC103       MATHS          100            33            "+std[i].getM());
		System.out.println("|\tBSC104       HINDI          100            33            "+std[i].getH());
		System.out.println("|\tBSC105       ENGLISH        100            33            "+std[i].getE());
		System.out.println("-----------------------------------------------------------------------\n");
		if(std[i].getP()<33 && std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33 )
		{
			System.out.println("FAIL IN ALL SUBJECT");
		}
		else if((std[i].getP()<33 && std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33)||(std[i].getP()<33 && std[i].getC()<33 && std[i].getH()<33 && std[i].getE()<33)||(std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33)|| (std[i].getC()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)||(std[i].getH()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33))
		{
			System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			if(std[i].getH()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)
			{
				System.out.println("Fail in 4 sub phy,math,hindi,eng ");
			}
			else if(std[i].getC()<33 && std[i].getM()<33 && std[i].getE()<33 && std[i].getP()<33)
			{
				System.out.println("Fail in 4 sub phy, che,math,eng ");
			}
			else if(std[i].getC()<33 && std[i].getM()<33 && std[i].getH()<33 && std[i].getE()<33)
			{
				System.out.println("Fail in 4 sub eng, che,math,hindi ");
			}
			else if(std[i].getP()<33 && std[i].getC()<33 && std[i].getH()<33 && std[i].getE()<33)
			{
				System.out.println("Fail in 4 sub phy, che,hindi,eng ");
			}
			else
			{
				System.out.println("Fail in 4 sub phy, che,hindi,math ");
			}
		}
		else if ((std[i].getP()<33&&std[i].getC()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getH()<33&&std[i].getE()<33)||(std[i].getP()<33&&std[i].getC()<33&&std[i].getH()<33)||(std[i].getP()<33&&std[i].getC()<33&&std[i].getE()<33)||(std[i].getP()<33&&std[i].getH()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getM()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getM()<33&&std[i].getH()<33)||(std[i].getC()<33&&std[i].getM()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getH()<33&&std[i].getE()<33)||(std[i].getM()<33&&std[i].getH()<33&&std[i].getE()<33))
		{ 
			System.out.println("Fail in three sub");
			if(std[i].getP()<33&&std[i].getC()<33&&std[i].getM()<33)
			{
				System.out.println("Fail in sub math,chem,eng");
			}
			else if(std[i].getP()<33&&std[i].getH()<33&&std[i].getE()<33)
			{
				System.out.println("Fail in sub phy,hindi,eng");
			} 
			else if(std[i].getH()<33&&std[i].getP()<33&std[i].getC()<33)
			{
				System.out.println("Fail in sub hindi,chem,phy");
			}
			else if(std[i].getC()<33&&std[i].getP()<33&&std[i].getE()<33)
			{
				System.out.println("Fail in sub chem,eng,phy");
			}
			else if(std[i].getP()<33&&std[i].getH()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub phy,hindi,math");
			}
			else if(std[i].getP()<33&&std[i].getM()<33&&std[i].getE()<33)
			{  
				System.out.println("Fail in sub phy,eng,math");
			}
			else if(std[i].getC()<33&&std[i].getH()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub chem,hindi,math");
			}
			else if(std[i].getC()<33&&std[i].getE()<33&&std[i].getM()<33)
			{  
				System.out.println("Fail in sub chem,eng,math");
			}
			else if(std[i].getC()<33&&std[i].getH()<33&&std[i].getE()<33)
			{  
				System.out.println("Fail in sub chem,hindi,eng");
			}
			else 
			{  
				System.out.println("Fail in sub math,hindi,eng");
			}
		}   
		else if((std[i].getP()<33&&std[i].getC()<33)||(std[i].getP()<33&&std[i].getM()<33)||(std[i].getP()<33&&std[i].getH()<33)||(std[i].getP()<33&&std[i].getE()<33)||(std[i].getC()<33&&std[i].getM()<33)||(std[i].getC()<33&&std[i].getE()<33)||(std[i].getM()<33&&std[i].getH()<33)||(std[i].getM()<33&&std[i].getE()<33)||(std[i].getH()<33&&std[i].getE()<33))
		{ 
				System.out.println("Fail in two subject");
			if(std[i].getP()<33&&std[i].getC()<33)
				System.out.println("Fail in phy,chem");
			else if(std[i].getP()<33&&std[i].getM()<33)
				System.out.println("Fail in phy,math");
			else if(std[i].getP()<33&&std[i].getH()<33)
				System.out.println("Fail in phy,hindi");
			else if(std[i].getP()<33&&std[i].getE()<33)
				System.out.println("Fail in phy,eng");
			else if(std[i].getC()<33&&std[i].getM()<33)
				System.out.println("Fail in chem,math");
			else if(std[i].getC()<33&&std[i].getE()<33)
				System.out.println("Fail in chem,eng");
			else if(std[i].getM()<33&&std[i].getH()<33)
				System.out.println("Fail in hindi,math");
			else if(std[i].getM()<33&&std[i].getE()<33)
				System.out.println("Fail in eng,math");
			else
				System.out.println("Fail in hindi,eng");
			}
		else if(std[i].getP()<33 || std[i].getC()<33 || std[i].getM()<33 || std[i].getH()<33 || std[i].getE()<33)
		{
			System.out.println("Fail in one subject");
			if(std[i].getP()<33)
				System.out.println("Fail in phy");
			else if(std[i].getC()<33)
				System.out.println("Fail in chem");
			else if(std[i].getM()<33)
				System.out.println("Fail in math");
			else if(std[i].getH()<33)
				System.out.println("Fail in hindi");
			else if(std[i].getE()<33)
				System.out.println("Fail in eng");
		}
		else 
		{
			System.out.println("pass in all subjact");
			
			System.out.println("Percentage= "+std[i].getPer());
		}
		if(std[i].getPer()>=60)
		{
			System.out.println("1st Division.....");
		}
		else if(std[i].getPer()>=45)
		{
			System.out.println("2nd Division.....");
		}
		else if(std[i].getPer()>=33)
		{
			System.out.println("3rd Division.....");
		}
		System.out.println("----------------------------------------------------------------");
	} 
}