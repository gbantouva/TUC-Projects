package tuc.ece.cs102.cadaster.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import tuc.ece.cs102.cadaster.model.owners.*;
import tuc.ece.cs102.cadaster.model.titles.Title;
import tuc.ece.cs102.cadaster.models.estates.*;

public class Cadaster {
	private String name;
	private String url;
	private EnhancedSortedList owners;
	private EnhancedSortedList estates;
	private EnhancedSortedList titles;
	
	public Cadaster() {
		this.name="E-Cadaster";
		this.url="www.e-cadaster.gr";
		owners=new EnhancedSortedList();
		estates=new EnhancedSortedList();
		titles=new EnhancedSortedList();
		
		owners.insert(new OwnerItem(new Person(123456789,"Νικόλαος Αραμπατζής","Παπαφλέσσα 2",setDate("1978/05/12"))));
		owners.insert(new OwnerItem(new Person(987456321,"Γεώργιος Μιχαήλ","Μάνου 10",setDate("1985/01/15"))));
		owners.insert(new OwnerItem(new Person(741258963,"Ιοκάστη Μάνου","Κτιστάκη 1",setDate("1970/11/13"))));
		owners.insert(new OwnerItem(new Person(236716384,"’ννα Κατράκη","Τσόχα 7",setDate("1990/07/28"))));
		owners.insert(new OwnerItem(new Company(341345657, "Informix", "Παπαναστασίου 10", "Ελένη Δήμου")));
		owners.insert(new OwnerItem(new Company(423451241, "SuperFood", "Σούτσου 20", "Μαρία Παππά")));
		
		estates.insert(new EstateItem(new Construction(1000020010, "Αττικής", "Αθηναίων", 800, 180000, 0.5, 600)));
		estates.insert(new EstateItem(new Construction(1000020011, "Χανίων", "Χανίων", 700, 1100000, 0.5, 400)));
		estates.insert(new EstateItem(new Land(1000020012, "Χανίων", "Ακρωτηρίου", 1100, 500000, 0.4)));
		estates.insert(new EstateItem(new Appartment(1000030030, "Ρεθύμνου", "Ρεθύμνου", 90, 170000, 2, "Κουντουριώτου 3", 1977, "ΚΑΤΟΙΚΙΑ", 2, 4)));
		estates.insert(new EstateItem(new Appartment(1000030031,"Αττικής","Αθηναίων",105,180000,2.5,"Πανόρμου 20",2015,"ΚΑΤΟΙΚΙΑ",4,5)));
		estates.insert(new EstateItem(new Appartment(1000030032,"Ηρακλείου","Ηρακλείου",150,250000,1.5,"Κνωσσού 12",1990,"ΕΠΑΓΓΕΛΜΑΤΙΚΗ ΣΤΕΓΗ",0,6)));
		estates.insert(new EstateItem(new House(1000040040, "Λασιθίου", "Σητείας", 80, 100000, 1.7, "4ης Σεπτεμβρίου 2", 1991, "ΚΑΤΟΙΚΙΑ", 1, 0)));
		estates.insert(new EstateItem(new House(1000040041, "Χανίων", "Χανίων", 600, 500000, 1.5, "Προφήτη Ηλία 13", 2017, "ΚΑΤΟΙΚΙΑ", 2, 100)));
		estates.insert(new EstateItem(new House(1000040042, "Αττικής", "Χαλανδρίου", 200, 300000, 1, "Αγίου Γεωργίου 15", 1980, "ΕΠΑΓΓΕΛΜΑΤΙΚΗ ΣΤΕΓΗ", 1, 0)));
		
		Title a=new Title(setDate("2000/05/12"), findOwner(123456789), findEstate(1000020010), 50d, "ΠΛΗΡΗΣ");
		Title b=new Title(setDate("2000/05/12"), findOwner(987456321), findEstate(1000020010), 50d, "ΠΛΗΡΗΣ");
		Title c=new Title(setDate("2001/06/01"), findOwner(123456789), findEstate(1000020011), 100d, "ΠΛΗΡΗΣ");
		Title d=new Title(setDate("2003/09/20"), findOwner(741258963), findEstate(1000020012), 100d, "ΠΛΗΡΗΣ");
		Title e=new Title(setDate("2010/11/24"), findOwner(236716384), findEstate(1000030030), 100d, "ΠΛΗΡΗΣ");
		Title f=new Title(setDate("2013/08/26"), findOwner(236716384), findEstate(1000030031), 100d, "ΨΙΛΗ");
		Title g=new Title(setDate("2017/04/02"), findOwner(423451241), findEstate(1000030032), 100d, "ΠΛΗΡΗΣ");
		Title h=new Title(setDate("2016/07/03"), findOwner(741258963), findEstate(1000040040), 100d, "ΠΛΗΡΗΣ");
		Title i=new Title(setDate("2005/03/13"), findOwner(741258963), findEstate(1000040041), 100d, "ΕΠΙΚΑΡΠΙΑ");
		Title j=new Title(setDate("2016/07/03"), findOwner(341345657), findEstate(1000040042), 100d, "ΠΛΗΡΗΣ");
		
		titles.insert(new TitleItem(a));
		titles.insert(new TitleItem(b));
		titles.insert(new TitleItem(c));
		titles.insert(new TitleItem(d));
		titles.insert(new TitleItem(e));
		titles.insert(new TitleItem(f));
		titles.insert(new TitleItem(g));
		titles.insert(new TitleItem(h));
		titles.insert(new TitleItem(i));
		titles.insert(new TitleItem(j));
		
		findOwner(123456789).addTitle(a);
		findEstate(1000020010).addTitle(a);
		findOwner(987456321).addTitle(b);
		findEstate(1000020010).addTitle(b);
		findOwner(123456789).addTitle(c);
		findEstate(1000020011).addTitle(c);
		findOwner(741258963).addTitle(d);
		findEstate(1000020012).addTitle(d);
		findOwner(236716384).addTitle(e);
		findEstate(1000030030).addTitle(e);
		findOwner(236716384).addTitle(f);
		findEstate(1000030031).addTitle(f);
		findOwner(423451241).addTitle(g);
		findEstate(1000030032).addTitle(g);
		findOwner(741258963).addTitle(h);
		findEstate(1000040040).addTitle(h);
		findOwner(741258963).addTitle(i);
		findEstate(1000040041).addTitle(i);
		findOwner(341345657).addTitle(j);
		findEstate(1000040042).addTitle(j);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date setDate(String strDate) {
		try {
			SimpleDateFormat df=new SimpleDateFormat("yyyy/MM/dd");
			Date firstDate = df.parse(strDate);
			return firstDate;
		}catch(Exception ex){
			System.out.println("Error: " +ex.getMessage()+"...");
			return null;
		}
	}
	
	public void addOwner(Owner owner) {
		owners.insert(new OwnerItem(owner));
	}
	
	public void addEstate(Estate estate) {
		estates.insert(new EstateItem(estate));
	}
	
	public void addTitle(Title title) {
		titles.insert(new TitleItem(title));
	}
	
	public Estate findEstate(int code) {
		EstateItem estateItem = (EstateItem)estates.search(code);
		if(estateItem==null) {
			return null;
		}else {
			return (Estate)estateItem.getData();
		}
	}
	
	public Owner findOwner(int afm) {
		OwnerItem ownerItem = (OwnerItem)owners.search(afm);
		if(ownerItem==null) {
			return null;
		}else {
			return (Owner)ownerItem.getData();
		}
	}
	
	public void printAllEstates() {
		System.out.println("Information about Estates\n");
		estates.print();
	}
	
	public void printOwnersByCategory(String myClass) {
		owners.printItemsInHierarchy(myClass);
	}

	public void printEstatesByCategory(String myClass) {
		estates.printItemsInHierarchy(myClass);
	}
	
	public void printTitlesByCategory(String myClass) {
		titles.printItemsInHierarchy(myClass);
	}

}
