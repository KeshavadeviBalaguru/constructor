package covarient;

public class Employee extends Organization
{
	int Empid;
	String EmpName;
	double salary;
	
	static String orgName;
	public Employee()
	{
		Empid=101;
		EmpName="Akshaya";
		salary=45678.00;
	}
	static
	{
		orgName="Wipro";
	}
	
	public Employee getInfo()
	{
		System.out.println(Empid);
		System.out.println(EmpName);
		System.out.println(salary);
		System.out.println(orgName);
		
		return null;
	}

	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.getInfo();
		System.out.println("---------");
		Organization o=new Organization();
		o.getInfo();
		
	}

}
