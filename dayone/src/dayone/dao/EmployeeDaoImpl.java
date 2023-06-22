package dayone.dao;

import javax.persistence.EntityManager;

import dayone.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	//all the CRUD method are inside the entity manager interface
	private EntityManager em;
	//constructor of main class
	public EmployeeDaoImpl() {
		em=JPAUtil.getEntityManager();
	}
	//create or add
	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
	}
	//retrieve any record
	@Override
	public Employee getEmployee(int id) {
		Employee emp=em.find(Employee.class,id);
		return null;
	}

	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
	}

}
