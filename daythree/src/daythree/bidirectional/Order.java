package daythree.bidirectional;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Order_Master")
public class Order {
	
	@Id
	private int orderid;
	@Temporal(TemporalType.DATE)
	private Date purchaseDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Product>products=new HashSet<>();

	public void addOrder(Product products)
	{
		this.getProducts().add(products);
	}
	//Getters and Setters
	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}