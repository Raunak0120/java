package opearators_arithmetics;

class Account{

	private String accNo;
	private String name;
	private String add;
	private String phone;
	private String dob;
	protected double bal;
	
	public Account(String accNo, String name, String add, String phone, String dob) {
		this.accNo=accNo;
		this.name=name;
		this.add=add;
		this.phone=phone;
		this.dob=dob;
		bal=0;
		
	}
	
	public String getAccNo(){
		return accNo;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public String getPhone() {
		return phone;
	}
	public String getDob() {
		return dob;
	}
	public double getBal() {
		return bal;
	}
	
	
	public void setAdd(String add) {
		this.add=add;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String toString() {
		return "\nAccount No.: "+accNo+"\nName: "+name+"\nAddress: "+add+"\nDate Of Birth: "+dob+"\nPhone No.: "+phone;
		
	}
	

}

class SavingsAccount extends Account{	
			
			public SavingsAccount(String accNo, String name, String add, String phone, String dob) {
		super(accNo, name, add, phone, dob);
		
	}
			public void deposit(double amt) {
				bal+=amt;
		}
			public void withdraw(double amt) {
				bal-=amt;
			}
}
class LoanAccount extends Account{
			public LoanAccount(String accNo, String name, String add, String phone, String dob) {
		super(accNo, name, add, phone, dob);
		
	}
			public void payEMI(double amt) {
				bal-=amt;
			}
			public void repay(double amt) {
				if(bal==amt)
					bal=0;
			}
}


public class INH_acc_122 {

	public static void main(String[] args) {
		

	}

}
