//Constructor calling from child class to parent
package ConstructorCalling;

class Parent{
	
	private int sal;

	public Parent()
	{
		System.out.println("Parent class constructor");
	}
	public Parent(int sal)
	{
		this.sal=sal;
		System.out.println("Salary="+sal);
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Child class constructor");
	}
	public Child(int sal)
	{
		super(sal);//call super class constructor , it should be the first line
		System.out.println("other statements");
	}
}



public class MainApp {

	public static void main(String[] args) {
		Child ob1=new Child(); 
		System.out.println("----------");
		Child ob2=new Child(456);
		// TODO Auto-generated method stub

	}

}
