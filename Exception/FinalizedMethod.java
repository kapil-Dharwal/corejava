class Object
{
	protected finalize()
	{
		file.close();
		db.close();	
	}
}
class Test extends Object
{
	finalize()//@override
	{
		file.close();
		db.close();
	}
	new Test();//unused object
}