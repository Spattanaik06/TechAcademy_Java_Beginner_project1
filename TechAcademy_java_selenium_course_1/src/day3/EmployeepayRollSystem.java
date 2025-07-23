package day3;


abstract class  Employee
{
	private String employeeName;
	private String employeeId;
	public Employee(String employeeName, String employeeId) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
 
	abstract double calculateEmployeeSalary();
 
	public void employeedetails()
	 {
		 System.out.println("Employee Name :"+employeeName);
		 System.out.println("Employee ID :"+employeeId);
	 }

	
}

class PermanentEmployee extends Employee
{

	private double monthlySalary;

	public PermanentEmployee(String employeeName, String employeeId, double monthlySalary) {
		super(employeeName, employeeId);
		this.monthlySalary = monthlySalary;
	}

	@Override
	double calculateEmployeeSalary() {
		
		return monthlySalary;
	}
	
}

class ContractualEmployee extends Employee
{

	private double SalaryperHour;
	private int workHour;
	public ContractualEmployee(String employeeName, String employeeId, double salaryperHour, int workHour) {
		super(employeeName, employeeId);
		SalaryperHour = salaryperHour;
		this.workHour = workHour;
	}
	@Override
	double calculateEmployeeSalary() {
		// TODO Auto-generated method stub
		return SalaryperHour * workHour;
	}

	

	
	
}

public class EmployeepayRollSystem {

	public static void main(String[] args) {
		PermanentEmployee pe=new PermanentEmployee("Suresh", "WP0934", 25000.00);
		System.out.println("Salry will be :"+pe.calculateEmployeeSalary());
		pe.employeedetails();
		System.out.println();
		ContractualEmployee ce=new ContractualEmployee("Surya","IBM0934", 400, 25);
		System.out.println("Salry will be :"+ce.calculateEmployeeSalary());
		ce.employeedetails();

	}

}
