package tuc.ece.cs102.cadaster.model;

import tuc.ece.cs102.cadaster.model.titles.Title;
import tuc.ece.cs102.cadaster.models.estates.Estate;
import tuc.ece.cs102.list.Item;
import tuc.ece.cs102.list.Node;
import tuc.ece.cs102.list.SortedList;

public class EnhancedSortedList extends SortedList {
	public EnhancedSortedList() {
		super();
	}
	
	public Item search(int key) {
		Node node = head;
		while(node!=null) {
			if(node.getValue().key().equals(new Integer(key))) {
				return node.getValue();
			}
			node=node.getNext();
		}
		return null;
	}
	
	public Item search(String key) {
		Node node = head;
		while(node!=null) {
			if(node.getValue().key().equals(new String(key))) {
				return node.getValue();
			}
			node=node.getNext();
		}
		return null;
	}
	
	public void printItemsInHierarchy(String className) {
		Node node = head;
		try{
			while (node!=null){
				Item item = node.getValue();				
				if (Class.forName(className).isInstance(item.getData())){
					item.print();
				}
				node = node.getNext();
			}
		}catch (ClassNotFoundException ex){
			System.out.println("Error: This class "+className+" does not exist...");
		}		
	}
	
	public double getEnfia() {
		Node node = head;
		double sum = 0.0;
		try {
			while(node!=null) {
				Item item = node.getValue();
				Estate estate = ((Title)item.getData()).getEstate();
				double percentage = ((Title)item.getData()).getPercentage();
				sum+=estate.getEnfia() * percentage/100 ;
				node=node.getNext();
			}
			return sum;
		}catch(Exception ex) {
			System.out.println("Error...");
			return sum;
		}
	}
	
	public double getValue() {
		Node node = head;
		double value=0;
		try {
			while(node!=null) {
				Item item = node.getValue();
				Estate estate = ((Title)item.getData()).getEstate();
				value+=estate.getValue();
				node=node.getNext();
			}
			return value;
		}catch(Exception ex) {
			System.out.println("Error...");
			return value;
		}
	}
}
