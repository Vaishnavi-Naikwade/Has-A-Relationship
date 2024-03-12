package Student_Address;

public class Test {

	public static void main(String[] args)
	{
		Address add = new Address();
			add.setPincode(413512);
			add.setCityname("Latur");
			add.setAreaName("Radha Nagar");
			add.setDistrictName("Latur");
			add.setStateName("Maharashtra");
			
		Student std = new Student()	;
			std.setRollNo(38);
			std.setName("Kusum");
			std.setMarks(80.63f);
			std.setAddr(add);
			
		System.out.println("Student RollNO : "+std.getRollNo());
		System.out.println("Student Name   : "+std.getName());
		System.out.println("Student Marks  : "+std.getMarks());
		System.out.println("Student Area Name : "+std.getAddr().getAreaName());
		System.out.println("Student District  : "+std.getAddr().getDistrictName());
		System.out.println("Student City Name : "+std.getAddr().getCityname());
		System.out.println("Student State name: "+std.getAddr().getStateName());
		System.out.println("Student Pincode   : "+std.getAddr().getPincode());
	}

}
