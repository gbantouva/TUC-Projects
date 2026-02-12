package tuc.ece.cs102.cadaster.models.estates;

public class Appartment extends Building{
	private int floor; 
	private int numberOfRooms;
	
	public Appartment(int code, String district, String municipality, double acreage, double value, double zonePrice,
			String address, int constructionYear, String usage, int floor, int numberOfRooms) {
		super(code, district, municipality, acreage, value, zonePrice, address, constructionYear, usage);
		this.floor=floor;
		this.numberOfRooms=numberOfRooms;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public void print() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return super.toString() + " Floor: " + this.floor + " Number of Rooms: " + this.numberOfRooms;
	}
	
	public double getEnfia() {
		return super.getEnfia() * (1 + this.floor * 0.05);
	}
	
}
