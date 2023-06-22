//Program to demonstrate on CRUD using JPA with hibernate
//driver class
package dayone.client;

import dayone.entities.Employee;
import dayone.service.EmployeeService;
import dayone.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceImpl();
		Employee emp = new Employee();
		
		
		//create
		/*
		emp.setId(102);
		emp.setName("Parag Gupta");
		service.createEmployee(emp);
		System.out.println("The data is added successfully in the DB"); 
		*/
		
		//update
		/*
		emp = service.retrieveEmployee(102);
		emp.setName("Abhinav Rawat");
		service.updateEmployee(emp);
		System.out.println("The data updated successfully in the DB");*/
		
		//delete
		/*
		emp = service.retrieveEmployee(102);
		service.removeEmployee(emp);
		System.out.println("The data deleted successfully from DB");*/
		
		/*retrieve
		emp = service.retrieveEmployee(101);
		System.out.println("Emp Id: "+emp.getId()+" Emp Name: "+emp.getName());
	*/
		}

}
