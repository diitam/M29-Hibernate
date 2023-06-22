package dayone.service;

import dayone.entities.Employee;

public interface EmployeeService {

	//User defined method
	void createEmployee(Employee emp);  //create
	Employee retrieveEmployee(int id);    //retrieve
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp); //delete
}
