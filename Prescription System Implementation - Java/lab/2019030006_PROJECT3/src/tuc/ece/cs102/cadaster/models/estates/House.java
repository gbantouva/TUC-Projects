package tuc.ece.cs102.cadaster.models.estates;

public class House extends Building{
	private int highestFloor;
	private double poolArea;

	public House(int code, String district, String municipality, double acreage, double value, double zonePrice,
			String address, int constructionYear, String usage, int highestFloor, double poolArea) {
		super(code, district, municipality, acreage, value, zonePrice, address, constructionYear, usage);
		this.highestFloor=highestFloor;
		this.poolArea=poolArea;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Highest Floor: " + this.highestFloor + " Pool Area: " + this.poolArea;
	}
	
	public double getEnfia() {
		return super.getEnfia() + this.poolArea * 10;
	}
	
}
