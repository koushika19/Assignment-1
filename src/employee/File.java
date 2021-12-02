package employee;

import java.util.ArrayList;
import java.util.List;

public class File {
	
	public static void main(String[] args) {
		Employee emp1= new Employee ("A",22,50000);
		Employee emp2= new Employee ("B",23,40000);
		Employee emp3= new Employee ("C",32,30000);
		Employee emp4= new Employee ("D",42,20000);
		Employee emp5= new Employee ("E",30,70000);
		Employee emp6= new Employee ("F",25,80000);
		Employee emp7= new Employee ("G",29,10000);
		Employee emp8= new Employee ("H",26,9000);
		Employee emp9= new Employee ("I",35,11000);
		Employee emp10= new Employee ("J",24,500000);

	List<Employee>employeeList= new ArrayList<>();
	List<String> res=new ArrayList<>();
	employeeList.add(emp1);
	employeeList.add(emp2);
	employeeList.add(emp3);
	employeeList.add(emp4);
	employeeList.add(emp5);
	employeeList.add(emp6);
	employeeList.add(emp7);
	employeeList.add(emp8);
	employeeList.add(emp9);
	employeeList.add(emp10);
	
	for(Employee employee:employeeList) {
		if(employee.getSalary()>35000)
			res.add(employee.getName());
	
	}
	System.out.println("Employess with salary> 35,000 are:");
	for(String str:res) {
		System.out.println(str);
			
			
	}
	
	}
	
	}


