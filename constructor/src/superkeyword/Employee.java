package superkeyword;


public class Employee extends Organization
{
	 int Empid;
	String EmpName;
	double salary;
	
	static String orgName;
	public Employee()
	{   
		
		Empid=101;
		EmpName="Manikandan";
		salary=45678.00;
	}
		
	static
	{
		orgName="Wipro";
	}
	
	public void getInfo()
	{   
		System.out.println("---------");
		System.out.println(Empid);
		System.out.println(EmpName);
		System.out.println(salary);
		System.out.println(orgName);
		
	
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.getInfo();
		
	}

}
