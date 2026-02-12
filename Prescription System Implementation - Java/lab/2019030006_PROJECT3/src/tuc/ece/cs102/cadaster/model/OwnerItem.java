package tuc.ece.cs102.cadaster.model;

import tuc.ece.cs102.cadaster.model.owners.Owner;
import tuc.ece.cs102.list.Item;

public class OwnerItem extends Item {
	private Owner owner;

	public OwnerItem(Owner owner) {
		this.owner=owner;
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
		return owner.getAfm();
	}
	
	public String toString() {
		return owner.toString();
	}

	public void print() {
		owner.print();
	}
	
	public Object getData() {
		return this.owner;
	}
	

}
