package tuc.ece.cs102.cadaster.model.owners;

import tuc.ece.cs102.cadaster.model.EnhancedSortedList;
import tuc.ece.cs102.cadaster.model.TitleItem;
import tuc.ece.cs102.cadaster.model.titles.Title;
import tuc.ece.cs102.list.Node;

public abstract class Owner {
	protected int afm;
	protected String name;
	protected EnhancedSortedList titles;
	protected Node head;
	
	public Owner(int afm, String name) {
		this.afm=afm;
		this.name=name;
		titles= new EnhancedSortedList();
	}

	public int getAfm() {
		return afm;
	}

	public void setAfm(int afm) {
		this.afm = afm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EnhancedSortedList getTitles() {
		return titles;
	}

	public void addTitle(Title title) {
		titles.insert(new TitleItem(title));
	}

	public abstract void print();
	
	public String toString() {
		return "AFM: " + this.afm + " Name: " + this.name;
	}
	
	public void printTitles() {
		titles.print();
	}
	
	public double getEnfia() {
		return titles.getEnfia();
	}
	
	public double getValue() {
		return titles.getValue();
	}
	

}
