package dayone.service;

import dayone.dao.EmployeeDao;
import dayone.dao.EmployeeDaoImpl;
import dayone.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDaoImpl dao;
	
	//constructor form superclass
	public EmployeeServiceImpl() {
		dao=new EmployeeDaoImpl();
	}
	//add or create
	@Override
	public void createEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee retrieveEmployee(int id) {
		Employee emp=dao.getEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
	}

}
