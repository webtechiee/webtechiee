package polyexample;

public class CommissionEmp extends Employee{

	public CommissionEmp(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		// TODO Auto-generated constructor stub
	}

	public double pay() {
		return (payRate * 1.1);
	}
}
