import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFunctions {

	
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(1,
                "Vinod", 16000,"Dept1"),new Employee(2,
                        "Chandra", 6000,"Dept1"),new Employee(3,
                                "Adi", 3000,"Dept2"),new Employee(4,
                                        "Rajagopal", 5000,"Dept2"));
		//Getting Highest salary from employee list
		Employee high = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("StreamFunctions.main()"+high.getSalary());
		
		//Getting lowest salary from employee list
		Employee low = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("StreamFunctions.main()"+low.getSalary());
		
		//Getting sum of salary from employee list
		int  sumSal = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("StreamFunctions.main()"+sumSal);
		
		//Getting acg salary of employes from Employee list
		double  avgSal = employees.stream().collect(Collectors.averagingInt(Employee::getSalary));
		System.out.println("StreamFunctions.main()"+avgSal);
		
		//Preparing a map like Map<dept_Id,No_Of_employes_of_Dept>
		Map<String,Long> employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::getDeptId,Collectors.counting()));
		
		System.out.println("StreamFunctions.main()"+employeeMap);
		
	}

	
}
