package tuc.ece.cs102.cadaster.model;

import java.util.Date;

import tuc.ece.cs102.cadaster.model.owners.*;
import tuc.ece.cs102.cadaster.model.titles.Title;
import tuc.ece.cs102.cadaster.models.estates.*;
import tuc.ece.cs102.util.StandardInputRead;

public class Console {
	private Cadaster cadaster;
	private StandardInputRead reader=new StandardInputRead();
	private int userOption;
	

	public Cadaster getCadaster() {
		return cadaster;
	}
	
	public void setCadaster(Cadaster cadaster) {
		this.cadaster=cadaster;
	}
	
	public Console() {
		cadaster = new Cadaster();
		//reader = new StandardInputRead();
		//userOption = 0;
	}
	
	
	public static void main(String[] args) {
		Console console = new Console();
		int userOption=0;
		StandardInputRead reader = new StandardInputRead();
		while(userOption!=11) {
			console.printMenu();
			String userInput = reader.readString("What would you like to do?");
			if (userInput == null) {
				continue;
	        }else {
	        	try {
	        		userOption = Integer.parseInt(userInput);
	        	}catch (NumberFormatException ex) {
	        		userOption = 0;
	        	}
	        }
			switch(userOption) {
				case 1:
					console.findEstate();
					break;
				case 2:
					console.cadaster.printAllEstates();
					break;
				case 3:
					console.findEstatesByCategory();
					break;
				case 4:
					console.findOwner();
					break;
				case 5:
					console.addTitle();
					break;
				case 6:
					console.printTitles();
					break;
				case 7:
					console.getValue();
					break;
				case 8:
					console.getEnfia();
					break;
				case 9:
					console.addEstate();
					break;
				case 10:
					console.addOwner();
					break;
			}	
		}
	}
	
	public void printMenu(){		
		System.out.println("-------------------Cadaster Menu-------------------");
		System.out.println("---------------------------------------------------");		
		System.out.println("1.  Search for a certain Estate....................");
		System.out.println("2.  Print Estates..................................");
		System.out.println("3.  Search for Estates of a certain Category.......");
		System.out.println("4.  Search for a certain Owner.....................");
		System.out.println("5.  Add new Title Deed.............................");
		System.out.println("6.  Print Title Deeds of an Estate/Owner...........");
		System.out.println("7.  Calculate total worth of real estate...........");
		System.out.println("8.  Calculate ENFIA................................");
		System.out.println("9.  Add new Estate.................................");
		System.out.println("10. Add new Owner..................................");
		System.out.println("11. Exit..........................................");
	}
	
	public Estate findEstateByCode() {
		int key = reader.readPositiveInt("Please enter estate's code: ");
		Estate estate = cadaster.findEstate(key);
		if(estate!=null) {
			return estate;
		}else {
			System.out.println("Error: Undefined code...");
			return null;
		}
	}
	
	public Owner findOwnerByAFM() {
		int key = reader.readPositiveInt("Please enter owner's afm: ");
		Owner owner = cadaster.findOwner(key);
		if(owner!=null) {
			return owner;
		}else {
			System.out.println("Error: Undefined afm...");
			return null;
		}
	}

	/* 1. Find a certain estate given his code and print */
	public void findEstate() {
		Estate estate = findEstateByCode();
		if(estate!=null) {
			estate.print();
		}
	}
	/* 3. Find a certain category of estates and print */
	public void findEstatesByCategory() {
		String category = reader.readString("What kind of estates are you looking for? ");
		cadaster.printEstatesByCategory("tuc.ece.cs102.cadaster.models.estates." + category);
	}
	/* 4. Find a certain owner given his afm and print */
	public void findOwner() {
		Owner owner = findOwnerByAFM();
		if(owner!=null) {
			owner.print();
		}
	}
	/* 5. Add new title */
	public void addTitle() {
		Owner owner = findOwnerByAFM();
		if(owner==null)
			return;
		Estate estate = findEstateByCode();
		if(estate==null)
			return;
		int percentage = reader.readPositiveInt("Please enter the ownership percentage: ");
		System.out.println(" Types of Ownership: ");
		System.out.println(" 1. –À«—«”");
		System.out.println(" 2. ÿ…À«");
		System.out.println(" 3. ≈–… ¡—–…¡.");
		int choice = reader.readPositiveInt("What's the type of ownership? ");
		String type;
		switch(choice) {
			case 1: 
				type = "–À«—«”";
				break;
			case 2:
				type = "ÿ…À«";
				break;
			case 3:
				type = "≈–… ¡—–…¡";
				break;
			default:
				type = "Undefined";
				System.out.println("Error: Invalid insertion. Please try again...");
				break;
		}
		Date date = reader.readDate("When was the title acquired? (dd/mm/yyyy) :");
		Title title = new Title(date, owner, estate, percentage, type);
		owner.addTitle(title);
		estate.addTitle(title);
		cadaster.addTitle(title);
	}
	
	/* 6. Print title deeds */ 
	public void printTitles() {
		System.out.println("1. Titles of a certain estate.");
		System.out.println("2. Titles of a certain owner.");
		userOption = reader.readPositiveInt("What kind of titles are you looking for? ");
		switch(userOption) {
			case 1:
				Estate estate = findEstateByCode();
				if(estate!=null)
					estate.printTitles();
				break;
			case 2:
				Owner owner = findOwnerByAFM();
				if(owner!=null)
					owner.printTitles();
				break;
			default:
				System.out.println("Error: Invalid insertion...");
				break;
		}
	}
	/* 7. Calculate total value of real estate */
	public void getValue() {
		Owner owner = findOwnerByAFM();
		if(owner!=null) {
			System.out.println("Person's total value is: "+owner.getValue());
		}
	}
	
	/* 8. Calculate ENFIA */
	public void getEnfia() {
		Owner owner = findOwnerByAFM();
		if(owner!=null) {
			System.out.println("Person's total ENFIA is: "+owner.getEnfia());
		}
	}
	
	/* 9. Add new estate */
	public void addEstate() {
		int code = reader.readPositiveInt("Please enter estate's code: ");
		String district = reader.readString("Please enter estate's district: ");
		String municipality = reader.readString("Please enter estate's municipality: ");
		double totalArea = reader.readPositiveFloat("Please enter estate's total area: ");
		double worth = reader.readPositiveFloat("Please enter estate's worth: ");
		double zonePrice = reader.readPositiveFloat("Please enter estate's price zone: ");
		userOption=0;
		System.out.println(" Estate Types:");
		System.out.println(" 1. Plot."); //oikopedo
		System.out.println(" 2. Building."); //ktisma
		userOption = reader.readPositiveInt("What kind of estate do you want to add? ");
		switch(userOption) {
		case 1:
			System.out.println(" Plot Types:");
			System.out.println(" 1. Construction."); //oikodomisimo
			System.out.println(" 2. Land."); //agrotemaxio
			userOption = reader.readPositiveInt("What kind of plot is it? ");
			Estate estate ;
			switch(userOption) {
				case 1:
					double maxArea = reader.readPositiveFloat("Please enter max buildable area: ");
					estate = new Construction(code, district, municipality, totalArea, worth, zonePrice, maxArea);
					cadaster.addEstate(estate);
					break;
				case 2:
					estate = new Land(code, district, municipality, totalArea, worth, zonePrice);
					cadaster.addEstate(estate);
					break;
				default:
					System.out.println("Error: Invalid insertion...");
					break;
			}
			break;
		case 2: 
			String address = reader.readString("Please enter the address of building: ");
			int year = reader.readPositiveInt("Please enter the year of construction: ");
			System.out.println(" Usage:");
			System.out.println(" 1.  ¡‘œ… …¡.");
			System.out.println(" 2. ≈–¡√√≈ÀÃ¡‘… « ”‘≈√«");
			int option = reader.readPositiveInt("What is it used for? ");
			String usage;
			switch(option) {
				case 1:
					usage=" ¡‘œ… …¡";
					break;
				case 2:
					usage="≈–¡√√≈ÀÃ¡‘… « ”‘≈√«";
					break;
				default:
					usage="Undefined";
					System.out.println("Error: Invalid insertion. This usage is undefined...");
					break;
			}
			System.out.println(" Building Types:");
			System.out.println(" 1. Appartment");
			System.out.println(" 2. House");
			userOption = reader.readPositiveInt("What kind of building is it? ");
			switch(userOption) {
				case 1:
					int floor = reader.readPositiveInt("On which floor is the appartment? ");
					int numOfRooms = reader.readPositiveInt("How many rooms does it have? ");
					estate = new Appartment(code, district, municipality, totalArea, worth, zonePrice, address, year, usage, floor, numOfRooms);
					cadaster.addEstate(estate);
					break;
				case 2:
					int highestFloor = reader.readPositiveInt("Please enter the highest floor: ");
					double poolArea = reader.readPositiveFloat("Please enter the pool area. If there isn't any pool press 0: ");
					estate = new House(code, district, municipality, totalArea, worth, zonePrice, address, year, usage, highestFloor, poolArea);
					cadaster.addEstate(estate);
					break;
			}
		}
	}
	
	/* 10. Add new Owner */
	public void addOwner() {
		int afm = reader.readPositiveInt("Please enter owner's afm: ");
		String name = reader.readString("Please enter owner's name: ");
		System.out.println(" Owner Types:");
		System.out.println(" 1. Person");
		System.out.println(" 2. Company");
		userOption = reader.readPositiveInt("What kind of owner do you want to add? ");
		switch(userOption) {
			case 1:
				String address = reader.readString("Please enter home address: ");
				Date date = reader.readDate("Please enter the date of Birth: ");
				Person person = new Person(afm, name, address, date);
				cadaster.addOwner(person);
				break;
			case 2:
				String headquarters = reader.readString("Please enter the headquarters: ");
				String spokesmanName = reader.readString("Please enter official spokesman's name: ");
				Company company = new Company(afm, name, headquarters, spokesmanName);
				cadaster.addOwner(company);
				break;
		}
	}
	
}
