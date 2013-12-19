package dms.rori;

public class Person {
	private String name;
	private int age;
	private boolean married;
	
	public Person(){
		//
	}
	public Person(String _name, int _age,boolean _maried){
		this.name=_name;
		this.age=_age;
		this.married=_maried;
				
	}
	
	public String getName()
	{
		return name;
		
	}
	public void setName(String nameValue)
	{
		this.name= nameValue;
		
	}
	public int getAge()
	{
		return age;
		
	}
	public void setAge(int ageValue)
	{
		this.age=ageValue;
		
	}
	
    public boolean getMaried()
    {
    	return married;
    	
    }
    public void setMaried (boolean mariedValue)
    {
    	this.married=mariedValue;
    	
    }
    
    public String displayPerson(){
    	String personString = name+" is "+age+" years of age and is married = "+married;
    	return personString;
    }
	

}
