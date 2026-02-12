package tuc.ece.cs102.cadaster.models.estates;

import tuc.ece.cs102.cadaster.model.EnhancedSortedList;
import tuc.ece.cs102.cadaster.model.TitleItem;
import tuc.ece.cs102.cadaster.model.titles.Title;

public abstract class Estate {
	protected int code;
	protected String district;
	protected String municipality;
	protected double acreage;
	protected double value;
	protected double zonePrice;
	protected EnhancedSortedList titles;
	
	public Estate(int code, String district, String municipality, double acreage, double value, double zonePrice) {
		this.code=code;
		this.district=district;
		this.municipality=municipality;
		this.acreage=acreage;
		this.value=value;
		this.zonePrice=zonePrice;
		this.titles=new EnhancedSortedList();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getMunicipality() {
		return municipality;
	}

	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}

	public double getAcreage() {
		return acreage;
	}

	public void setAcreage(double acreage) {
		this.acreage = acreage;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getZonePrice() {
		return zonePrice;
	}

	public void setZonePrice(double zonePrice) {
		this.zonePrice = zonePrice;
	}
	
	public EnhancedSortedList getTitles() {
		return titles;
	}

	public void addTitle(Title title) {
		titles.insert(new TitleItem(title));
	}

	public abstract void print();
	
	public String toString() {
		String s1 = "Code: " + this.code + " District: " + this.district + " Municipality: " + this.municipality;
		String s2 = " Acreage: " + this.acreage + " Value: " + this.acreage + " Zone Price: " + this.zonePrice;
		String s3 = " Enfia: "+this.getEnfia();
		return s1 + s2+s3;
	}
	
	public void printTitles() {
		titles.print();
	}
	
	public abstract double getEnfia();
}
