package daytwo.tableperclassinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

//Child class
@Entity
@Table(name="Person")
public class Person extends Citizen {

	private String name;
	private long contactNo;
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	
}
