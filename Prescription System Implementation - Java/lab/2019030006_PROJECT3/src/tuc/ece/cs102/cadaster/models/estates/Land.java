package tuc.ece.cs102.cadaster.models.estates;

public class Land extends Plot{
	
	public Land(int code, String district, String municipality, double acreage, double value, double zonePrice) {
		super(code, district, municipality, acreage, value, zonePrice);
		this.maxArea=0;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " No buildable area.";
	}
	
	public double getEnfia() {
		return super.getEnfia();
	}
	
}
