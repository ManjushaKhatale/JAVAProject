package CoreJava;

public class EmployeeData 
{
	int id;
	String name;
	
	public void display()
	{
		System.out.println("Employee id is:"+id);
		System.out.println("Employee name is:"+name);
	}
	public static void main(String[] args)
	{
		EmployeeData E1=new EmployeeData();
		E1.id=1;
		E1.name="Mohit";
		E1.display();
		EmployeeData E2=new EmployeeData();
		E2.id=2;
		E2.name="Akash";
		E2.display();
		EmployeeData E3=new EmployeeData();
		E3.id=3;
		E3.name="Omkar";
		E3.display();
		EmployeeData E4=new EmployeeData();
		E4.id=4;
		E4.name="Viraj";
		E4.display();
		EmployeeData E5=new EmployeeData();
		E5.id=5;
		E5.name="Aaradhya";
		E5.display();
	}

}
