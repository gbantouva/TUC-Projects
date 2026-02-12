package tuc.ece.cs102.cadaster.models.estates;

public abstract class Plot extends Estate {
	double maxArea; 

	public Plot(int code, String district, String municipality, double acreage, double value, double zonePrice) {
		super(code, district, municipality, acreage, value, zonePrice);
	}

	public double getMaxArea() {
		return maxArea;
	}

	public void setMaxArea(double maxArea) {
		this.maxArea = maxArea;
	}
	
	public double getEnfia() {
		return this.zonePrice * this.acreage;
	}
	
}
