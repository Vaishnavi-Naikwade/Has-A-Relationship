package Account_Bank;

public class Test {

	public static void main(String[] args) 
	{
		Bank b = new Bank();
			b.setbName("HDFC");
			b.setbCity("Pune");
			b.setbArea("J. M. Road");
			b.setbPincode(400102);
			
		Account acc = new Account();
			acc.setAccNo(1234506785);
			acc.setAccName("Sagar");
			acc.setMobileNo(4520145638l);
			acc.setGender("Male");
			
			acc.setBank(b);
			
		System.out.println("Account Number : "+acc.getAccNo());
		System.out.println("Account Holder : "+acc.getAccName());
		System.out.println("Contact Number : "+acc.getMobileNo());
		System.out.println("Acc. Holder Gender : "+acc.getGender());
		System.out.println("Account Bank Name : "+acc.getBank().getbName());
		System.out.println("Account Bank City : "+acc.getBank().getbCity());
		System.out.println("Account Bank Area : "+acc.getBank().getbArea());
		System.out.println("Account Bank Pincode : "+acc.getBank().getbPincode());
	}

}
