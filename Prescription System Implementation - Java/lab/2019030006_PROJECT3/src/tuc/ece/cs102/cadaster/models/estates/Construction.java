package tuc.ece.cs102.cadaster.models.estates;

public class Construction extends Plot{

	public Construction(int code, String district, String municipality, double acreage, double value,
			double zonePrice, double maxArea) {
		super(code, district, municipality, acreage, value, zonePrice);
		this.maxArea=maxArea;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Max Area: " + this.maxArea;
	}
	
	public double getEnfia() {
		return super.getEnfia() + 0.15 * this.zonePrice * this.maxArea;
	}
	

}
