package SetGetExample;

public class Test {
	
	public static void main(String[] args)
	{	
		
		Laptop lap1 = new Laptop();
			lap1.setLapId(201);
			lap1.setLapName("HP 600");
			lap1.setLapColor("Black");
			lap1.setLapPrice(63000);
		
		
		Employee emp1 = new Employee();
			emp1.setEmpId(50001);
			emp1.setEmpName("Anlitaa");
			emp1.setEmpAddress("Pune , Maharashtra");
			emp1.setEmpDesignation("System ENgineer");
			emp1.setEmpAge(35);
			emp1.setEmpSalary(90000);
			
			emp1.setLap(lap1);
			
			System.out.println("Employee Details");
			System.out.println(emp1.getEmpId());
			System.out.println(emp1.getEmpName());
			System.out.println(emp1.getEmpAddress());
			System.out.println(emp1.getEmpDesignation());
			System.out.println(emp1.getEmpAge());
			System.out.println(emp1.getEmpSalary());
			
			System.out.println("Employee Laptop Details");
			System.out.println(emp1.getLap().getLapId());
			System.out.println(emp1.getLap().getLapName());
			System.out.println(emp1.getLap().getLapColor());
			System.out.println(emp1.getLap().getLapPrice());
		
	}

}
