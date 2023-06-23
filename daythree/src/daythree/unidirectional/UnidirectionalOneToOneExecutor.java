package daythree.unidirectional;
//Program to demonstrate on one to one unidirectional association
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c=new Customer();
		c.setCustName("Disha");
		
		Address a=new Address();
		a.setPincode(401503);
		a.setCity("Chinchani");
		a.setArea("Boisar");
		
		c.setAddress(a);
		em.persist(c);
		
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	



	}

}
