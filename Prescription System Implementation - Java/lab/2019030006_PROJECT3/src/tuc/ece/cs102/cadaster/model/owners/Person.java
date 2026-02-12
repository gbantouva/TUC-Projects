package tuc.ece.cs102.cadaster.model.owners;

import java.util.Date;

public class Person extends Owner {
	private String address;
	private Date birthdate;
	
	public Person(int afm, String name, String address, Date birthdate) {
		super(afm, name);
		this.address=address;
		this.birthdate=birthdate;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Address: " + this.address + " Birthdate: " + this.birthdate;
	}
	
}
