package dayone.dao;

import dayone.entities.Employee;

public interface EmployeeDao {

	//by default abstract method
	//User Defined method for CRUD Operation
	void addEmployee(Employee emp);  //create
	Employee getEmployee(int id);    //retrieve
	void updateEmployee(Employee emp); //update
	void deleteEmployee(Employee emp); //delete
	
	//JPA transaction
	void beginTransaction();  //begin
	void commitTransaction(); //close

	
	

	
}
