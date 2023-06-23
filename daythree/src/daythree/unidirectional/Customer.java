package daythree.unidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generationof ID
	private int custId;
	private String custName;
	
	//obj of address class
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	//Default Constructor
	public Customer() {
		System.out.println("One to one unidirectional");
	}
	
	
	//Parameterized constructor
	public Customer(int custId, String custName, Address address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
	}

	//getters and setters
	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	//toString()
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	
	
	
	
}