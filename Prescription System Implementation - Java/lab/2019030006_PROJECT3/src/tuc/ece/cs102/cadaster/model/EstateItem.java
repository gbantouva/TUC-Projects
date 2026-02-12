package tuc.ece.cs102.cadaster.model;

import tuc.ece.cs102.cadaster.models.estates.Estate;
import tuc.ece.cs102.list.Item;

public class EstateItem extends Item {
	private Estate estate;

	public EstateItem(Estate estate) {
		this.estate=estate;
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
		return estate.getCode();
	}
	
	public String toString() {
		return estate.toString();
	}

	public void print() {
		estate.print();
	}
	
	public Object getData() {
		return this.estate;
	}

}
