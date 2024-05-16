package com.app.Entity;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="First_Name",length = 20)
	private String firstName;
	
	@Column(name="Last_Name",length = 20)
	private String lastName;
	
	private double contact;
	
	
	public Employee() {
		super();
	}

	public Employee( String firstName, String lastName, double contact) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + id + ", firstName=" + firstName + ", LastName=" + lastName + ", Contact=" + contact
				+ "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
	this.id=id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getContact() {
		return contact;
	}

	public void setContact(double contact) {
		this.contact = contact;
	}




	

}
