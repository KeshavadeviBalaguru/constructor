package methodoverloading;

public class Employee {
	int Employeeid;
	double salary;
	String EmployeeName;
	
	static String OrgName;
	
	public Employee()
	{
		Employeeid=101;
		salary=34567.99;
		EmployeeName="praveen";
		
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
	
	public void getInfo(int Employeeid,double salary, String EmployeeName)
	{
		this.Employeeid=Employeeid;
		this.salary=salary;
		this.EmployeeName=EmployeeName;
		System.out.println(Employeeid);
		System.out.println(salary);
		System.out.println(EmployeeName);
		System.out.println(OrgName);
		
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.getInfo();
		System.out.println("--------------");
		e.getInfo(103,23456.89,"Anitha");
		
		
		
	}

}
