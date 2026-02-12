package tuc.ece.cs102.cadaster.models.estates;

import java.util.Calendar;
import java.util.Date;

public abstract class Building extends Estate{
	protected String address;
	protected int constructionYear;
	protected String usage;
	protected static final double FACTOR1 = 1.0;
	protected static final double FACTOR2 = 0.9;
	protected static final double FACTOR3 = 0.8;
	protected static final double FACTOR4 = 0.5;
	
	public Building(int code, String district, String municipality, double acreage, double value, double zonePrice, String address, int constructionYear, String usage) {
		super(code, district, municipality, acreage, value, zonePrice);
		this.address=address;
		this.constructionYear=constructionYear;
		this.usage=usage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getConstructionYear() {
		return constructionYear;
	}

	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}
	
	public String toString() {
		return super.toString() + " Address: " + this.address + " Construction Year: " + this.constructionYear + " AGE: "+this.getAge();
	}
	
	public int getAge() {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		int age=cal.get(Calendar.YEAR)-this.getConstructionYear();
		return age;
	}
	
	public double getEnfia() {
		double factor;
		int age = this.getAge();
		if(age<=10) {
			factor=FACTOR1;
		}else if(age<=20) {
			factor=FACTOR2;
		}else if(age<=30) {
			factor=FACTOR3;
		}else {
			factor=FACTOR4;
		}
		
		return this.zonePrice * this.acreage * factor;
	}
}
