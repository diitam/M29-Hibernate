package dattwo.joinedtableinheritance;
//child class
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Car")
public class Car extends Vehicle {

	private String brandName;
	
	//Getters and Setters
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
