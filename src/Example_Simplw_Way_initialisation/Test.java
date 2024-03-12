package Example_Simplw_Way_initialisation;

public class Test {

	public static void main(String[] args) 
	{
		Laptop lap1 = new Laptop();
			lap1.lapId = 1001;
			lap1.lapName = "DELL Inspiron";
			lap1.lapColor = "Silver Black";
			lap1.lapPrice = 56000;
			
		Employee emp1 = new Employee();
			emp1.empId = 5001;
			emp1.empName = "Yamini";
			emp1.empAddress = "India";
			emp1.empDesignation = "Developer";
			emp1.empAge = 31;
			emp1.empSalary = 68000;
			emp1.lap = lap1;
			
		System.out.println("Employee Details ");
		System.out.println("ID   : "+emp1.empId);
		System.out.println("Name : "+emp1.empName);
		System.out.println("Address : "+emp1.empAddress);
		System.out.println("Designation : "+emp1.empDesignation);
		System.out.println("Age : "+emp1.empAge);
		System.out.println("Salary  : "+emp1.empSalary);
		
		System.out.println("Laptop Id : "+emp1.lap.lapId);
		System.out.println("Laptop Name : "+emp1.lap.lapName);
		System.out.println("Laptop Color : "+emp1.lap.lapColor);
		System.out.println("Laptop Price : "+emp1.lap.lapPrice);

	}

}
