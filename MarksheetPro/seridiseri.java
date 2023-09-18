class StoreData
{
	public static void storeData(StudentPOJO std[],int n,int i)throws Exception
	{
		System.out.println("");
		Properties properties = new Properties();
		properties.setProperty("Roll_"+std[i].getRoll()+"_Name",std[i].getName());
		properties.setProperty("Roll_"+std[i].getRoll()+"_FatherName",std[i].getFather());
		properties.setProperty("Roll_"+std[i].getRoll()+"_MotherName",std[i].getMother());
		properties.setProperty("Roll_"+std[i].getRoll()+"_Course",std[i].getCourse());
		properties.setProperty("Roll_"+std[i].getRoll()+"_Branch",std[i].getBranch());
		properties.setProperty("Roll_"+std[i].getRoll()+"_University",std[i].getUniversity());
		properties.setProperty("Roll_"+std[i].getRoll()+"_Roll",String.valueOf(std[i].getRoll()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Year",String.valueOf(std[i].getYear()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Sem",String.valueOf(std[i].getSemester()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Physics",String.valueOf(std[i].getPhy()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Chemistry",String.valueOf(std[i].getChemistry()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Maths",String.valueOf(std[i].getMaths()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_English",String.valueOf(std[i].getEnglish()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Hindi",String.valueOf(std[i].getHindi()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Total",String.valueOf(std[i].getTotal()));
		properties.setProperty("Roll_"+std[i].getRoll()+"_Percentaage",String.valueOf(std[i].getPercentage()));
		
		try(FileOutputStream fos = new FileOutputStream("std.properties1",true))
		{
			properties.store(fos,"User Data");
			System.out.println("Data saved successfully");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}