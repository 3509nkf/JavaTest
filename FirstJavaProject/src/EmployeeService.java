import java.time.LocalDate;

public class EmployeeService {
	
	public void create(Employee employee) {
		
	}
	
	public void get(int id) {
		
	}
	
	public void MainService {
		private EmployeeService employeeService = new EmployeeService();
		
		public void register() {
			Employee employee = new Employee();
			employee.id = 1;
			employee.name = "ç≤ì°";
			employee.birth = LocalDate.of(1980, 2, 7);
		}
		
		public void show() {
			Employee employee = this.employeeService.get(1);
			System.out.println(employee.name);
			System.out.println(employee.birth);
			
		}
	}
	
	
}