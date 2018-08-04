//Calculate various deductions and find salaries for an employee
public class Employee {

	private double employeeId;
	private String employeeName=new String();
	private double monthlyBasic;
	private static final int medicalAllowance=1250;
	private static final int conveyanceAllowance=800;
	private static double pfRate=0.1;
	
	//Getters and setters for instance  and class members
	public double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(double employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getMonthlyBasic() {
		return monthlyBasic;
	}
	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}
	
	public static double getPfRate() {
		return pfRate;
	}
	
	public static void setPfRate(double pfRate) {
		Employee.pfRate = pfRate;
	}
	
	//Calculate HRA
	public double getHra() {
		return (0.5*monthlyBasic);
	}
	
	//Calculate PF
	public double getPf() {
		if((getPfRate()*monthlyBasic)<6500)
			return (getPfRate()*monthlyBasic);
		else
			return(6500);
	}
	
	//Calculate professional tax
	public int getProfesionalTax() {
		if(monthlyBasic<=10000)
			return(50);
		else
			return(100);
	}
	
	//Calculate annual basic salary
	public double getAnnualBasic() {
		return(12*monthlyBasic);
	}
	
	//Calculate monthly gross salary
	public double getMonthlyGrossSalary() {
		return(monthlyBasic+getHra()+medicalAllowance+conveyanceAllowance);
	}
	
	//Calculate annual gross salary
	public double getAnnualGrossSalary() {
		return(12*getMonthlyGrossSalary());
	}
	
	//Calculate monthly deductions
	public double getMonthlyDeductions() {
		return(12*getMonthlyGrossSalary());
	}
	
	//Calculate monthly take home salary
	public double getMonthlyTakeHome() {
		return(getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	
	//Calculate annual take home salary
	public double getAnnualTakeHome() {
		return(12*getMonthlyTakeHome());
	}
	
	//Calculate ESIC
	public double getEsic() {
		if(monthlyBasic<=500)
			return(0.0475*monthlyBasic);
		else
			return(5000);
	}
	
	//Display employee details
	@Override
	public String toString() {
		return "Employee [Monthly Basic="+ monthlyBasic + ", Employee Id=" + getEmployeeId() + ", Employee Name=" + getEmployeeName()
				+ ", Monthly Basic=" + getMonthlyBasic() + ", Hra=" + getHra() + ", Pf=" + getPf()
				+ ", Profesional Tax=" + getProfesionalTax() + ", Annual Basic=" + getAnnualBasic()
				+ ", Monthly Gross Salary=" + getMonthlyGrossSalary() + ", Annual Gross Salary="
				+ getAnnualGrossSalary() + ", Monthly Deductions=" + getMonthlyDeductions()
				+ ", Monthly Take Home=" + getMonthlyTakeHome() + ", Annual Take Home=" + getAnnualTakeHome()
				+ ", Esic=" + getEsic() + "]";
	}
	
}
