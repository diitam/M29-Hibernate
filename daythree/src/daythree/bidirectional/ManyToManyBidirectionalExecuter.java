package daythree.bidirectional;
import java.util.Date;

//driver class
//program to demonstrate on many to many bidirectional
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ManyToManyBidirectionalExecuter {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Product p=new Product();
		p.setProductId(123);
		p.setProductName("Soap");
		p.setPrice(60.25f);
		
		Product p1=new Product();
		p1.setProductId(456);
		p1.setProductName("Perfume");
		p1.setPrice(600.2f);
		
		Order o=new Order();
		o.setOrderid(123);
		o.setPurchaseDate(new Date());
		
		Order o1=new Order();
		o1.setOrderid(963);
		o1.setPurchaseDate(new Date());
		
		o.addOrder(p);
		o1.addOrder(p1);
		
		em.persist(o);
		em.persist(o1);

		
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();

	}

}

	


