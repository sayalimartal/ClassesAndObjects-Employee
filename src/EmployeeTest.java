//Display Employee salary details
import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter employee id");
		employee.setEmployeeId(scanner.nextDouble());
		
		System.out.println("Enter employee name");
		employee.setEmployeeName(scanner.next());
		
		System.out.println("Enter employee's monthly basic salary");
		employee.setMonthlyBasic(scanner.nextDouble());
		
		scanner.close();
		
		System.out.println(employee);  //Display employee details
		
	}	
}
