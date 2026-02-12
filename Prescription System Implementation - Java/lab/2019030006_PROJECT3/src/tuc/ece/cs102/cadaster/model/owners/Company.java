package tuc.ece.cs102.cadaster.model.owners;

public class Company extends Owner {
	private String headquarters;
	private String spokesmanName;
	
	public Company(int afm, String name, String headquarters, String spokesmanName) {
		super(afm, name);
		this.headquarters=headquarters;
		this.spokesmanName=spokesmanName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public String getSpokesmanName() {
		return spokesmanName;
	}

	public void setSpokesmanName(String spokesmanName) {
		this.spokesmanName = spokesmanName;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Headquarters: " + this.headquarters + " Spokesman's Name: " + this.spokesmanName;
	}
	
}
