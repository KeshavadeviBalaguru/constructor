package constructoroverloading;

public class Employee {
	int Employeeid;
	double salary;
	String EmployeeName;
	
	static String OrgName;
	
	public Employee()
	{
		Employeeid=101;
		salary=34567.99;
		EmployeeName="Keshav";
		
	}
	
	
	public Employee(int employeeid, double salary, String employeeName) 
	{
		
		this.Employeeid = employeeid;
		this.salary = salary;
		this.EmployeeName = employeeName;
	}


	static
	{
		 OrgName="CTC";
	}
	 
	public void getInfo()
	{
		System.out.println(Employeeid);
		System.out.println(salary);
		System.out.println(EmployeeName);
		System.out.println(OrgName);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.getInfo();
		System.out.println("----------");
		Employee e1=new Employee(104,12789.00,"Devi");
		e1.getInfo();
		
		
	}

}
