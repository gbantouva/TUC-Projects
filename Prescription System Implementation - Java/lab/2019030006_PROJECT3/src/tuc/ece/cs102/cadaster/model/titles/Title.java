package tuc.ece.cs102.cadaster.model.titles;

import java.util.Date;
import java.util.Random;

import tuc.ece.cs102.cadaster.model.owners.Owner;
import tuc.ece.cs102.cadaster.models.estates.Estate;

public class Title {
	private int code;
	private Date date;
	private Owner owner;
	private Estate estate;
	private double percentage;
	private String type;
	
	public Title(Date date, Owner owner, Estate estate, double percentage, String type) {
		Random random=new Random();
		this.code=random.nextInt(1000);
		this.date=date;
		this.owner=owner;
		this.estate=estate;
		this.percentage=percentage;
		this.type=type;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Estate getEstate() {
		return estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		String a = " Code: " + this.code + " Since: " + this.date + " Owner: " + this.owner.getName() + " Estate: " + this.estate.getCode();
		String b = " Percentage: " + this.percentage + " Ownership type: " + this.type;
		return a+b;
	}

}
