package tuc.ece.cs102.cadaster.model;

import tuc.ece.cs102.cadaster.model.titles.Title;
import tuc.ece.cs102.list.Item;

public class TitleItem extends Item{
	private Title title;

	public TitleItem(Title title) {
		this.title=title;
	}
	
	public boolean equals(Item k) {
		return key().equals(k.key());
	}

	public boolean less(Item k) {
		if (((Integer) key()).compareTo((Integer) k.key()) < 0)
			return true;
		return false;
	}

	public Object key() {
		return title.getCode();
	}
	
	public String toString() {
		return title.toString();
	}

	public void print() {
		title.print();
	}
	
	public Object getData() {
		return this.title;
	}
}
