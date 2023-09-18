import java.lang.String;
import java.lang.System;
import java.util.Scanner;
class Percentage
{
	public static void main(String[]args)
	{
		int physics,chemistry,mathematic,hindi,english,total,roll,year;
		double percentage;
		String course,name,sem,mother,father,branch;
		System.out.println("_________________________________________________");
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter your Roll no:");
		roll=sc.nextInt();
		System.out.println("Enter your name:");
		name =sc.next();
		System.out.println("Enter your father name:");
		father =sc.next();
		System.out.println("Enter your mother name:");
		mother =sc.next();
		System.out.println("Enter your course name:");
		course =sc.next();
		System.out.println("Enter your semester:");
		sem =sc.next();
		System.out.println("Enter your branch:");
		branch =sc.next();
		System.out.println("Enter your year:");
		year =sc.nextInt();
		
		
		System.out.println("Enter marks of physics:");
		physics =sc.nextInt();
		System.out.println("Enter marks of chemistry:");
		chemistry =sc.nextInt();
		System.out.println("Enter marks of mathematice:");
		mathematic =sc.nextInt();
		System.out.println("Enter marks of hindi:");
		hindi =sc.nextInt();
		System.out.println("Enter marks of english:");
		english =sc.nextInt();
		
		System.out.println("_____________________________________________________________________________________________");
		
		System.out.println("|\t\t\t\tSSISM SANDALPUR                           ");
		System.out.println("|\tRoll  : "+roll+"\t\t\t\t\tCourse : "+course+"   ");
		System.out.println("|\tName  : "+name+"\t\t\t\t\tBranch : "+branch+"   ");
		System.out.println("|\tFname : "+father+"\t\t\t\t\tsem  : "+sem+   "  ");
		System.out.println("|\tMname : "+mother+"\t\t\t\t\tyear :"+year+"    ");
		System.out.println("|\tSubcode       Subname       MaxMarks     MinMarks    ObtMarks");
		System.out.println("|\tBSC101        physics         100           33          "+physics);
		System.out.println("|\tBSC102        chemistry       100           33          "+chemistry);
		System.out.println("|\tBSC103        mathematic      100           33          "+mathematic);
		System.out.println("|\tBSC104        hindi           100           33          "+hindi);
		System.out.println("|\tBSC105        english         100           33          "+english);
		System.out.println("_____________________________________________________________________________________________");
		
		   if(physics<33)
		   {
			   if(chemistry<33)
			   {
				   if(mathematic<33)
				   {
					   if(hindi<33)
					   {
						   if(english<33)
						   {
							   System.out.println("Fail all subject:");
						   }
						   else
						   {
							   System.out.println("fail in physics,chemistry,mathematic,hindi:");
						   }
					    }
				        else
					    {
						    if(english<33)
						    {
							    System.out.println("fail in physics,chemistry,mathematic,english:");
						    }
				            else
					        {
					            System.out.println("fail in physics,chemistry,mathematic");
				          	}
				        }
			        }
			        else
			        {
				        if(hindi<33)
				        {
					        if(english<33)
					        {
						        System.out.println("fail in physics,chemistry,hindi,english");
					        }
					         else
					         {
						        System.out.println("fail in physics,chemistry,hindi");
					         }
				        }
				        else
				        {
					        if(english<33)
					        {
						        System.out.println("fail in physics,chemistry,english");
					        }
				        	else
					        {
						        System.out.println("fail in physics,chemistry");
					        }
				        }
			        }
		        }
		        else
	         	{
			        if(mathematic<33)
			        {
				        if(hindi<33)
				        {
					        if(english<33)
					        {	
				                System.out.println("fail in physics,mathematic,hindi,english");
					        }   
					        else
					        {
					         	System.out.println("fail in physics,math,hindi");
					        }
				        }
				        else
				        {
					        if(english<33)
					        {
						        System.out.println("fail in physics,mathematic,english");
					        }
					         else
					        {
					           	System.out.println("fail in physics,mathematic");
					        }
				        }
			        }
			        else
			        {
			        	if(hindi<33)
				        {
					        if(english<33)
					        {
						        System.out.println("fail in physics,hindi,english");
					        }
					        else
					        {
						        System.out.println("fail in physics,hindi");
					        }
				        }
			            else
				        {
					        if(english<33)
					        {
						        System.out.println("fail in physics,english");
					        }
					        else
					        {
						        System.out.println("fail in physics");
					        }
				        }
			        }
		        }
	        }	
	        else
			{
				if(chemistry<33)
				{
					if(mathematic<33)
					{
						if(hindi<33)
						{
							if(english<33)
							{
								System.out.println("fail in chemistry,mathematic,hindi, ENGLISH");
							}
							else
							{
								System.out.println("fail in chemistry,mathematic,hindi");
							}
						}
						else
						{
							if(english<33)
							{
								System.out.println("fail in chemistry,mathematic,english");
							}
							else
							{
								System.out.println("fail in chemistry,mathematic");
							}
						}
					}
					else
					{
						if(hindi<33)
						{
							if(english<33)
							{
								System.out.println("fail in chemistry,hindi,english");
							}
							else
							{
								System.out.println("fail in chemistry,hindi");
							}
						}
						else
						{
							if(english<33)
							{
								System.out.println("fail in chemistry,english");
							}
							else
							{
								System.out.println("fail in chemistry");
							}
						}
					}
				}	
				else
				{
					if(mathematic<33)
					{
						if(hindi<33)
						{
							if(english<33)
							{
								System.out.println("fail in mathematic,hindi,english");
							}
							else
							{
								System.out.println("fail in mathematic,hindi");
							}
						}	
						else
						{
							if(english<33)
							{
								System.out.println("fail in mathematice,english");
							}
							else
							{
								System.out.println("fail in mathematic");
							}	
						}
					}
					else
					{
						if(hindi<33)
						{
							if(english<33)
							{
								System.out.println("fail in hindi,english");
							}
							else
							{
								System.out.println("fail in hindi");
							}
						}
						else
						{
							if(english<33)
							{
								System.out.println("fail in english");
							}
							else
							{
								total=physics+chemistry+mathematic+hindi+english;
						        percentage=total/5.0;		
						        System.out.println("|\ttotal = "+total);
						        
								System.out.println("|\tpersentage = "+percentage);
						        if(percentage>=60)
								{
									System.out.println("\tpass in first division");
								}
								else
								{
									if(percentage>=45)
									{
										System.out.println("\tpass in second division");
									}
									else
									{
										if(percentage>=33)
										{
											System.out.println("\tpass in third division");
										}
										else
										{
											System.out.println("\t.....FAIL.....");
										}	
									}
								}
							}
						}
					}	
				}
			}
	}
}	

