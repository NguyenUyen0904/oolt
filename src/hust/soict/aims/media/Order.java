package hust.soict.aims.media;

import java.util.ArrayList;

public class Order {

//	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[10];
//
//	/**
//	 *
//	 */
	public Order() {
		super();
	}

	//private int qtyOrdered = 0;

	/**
	 * Returns the qtyOrdered
	 */
//	public int getQtyOrdered() {
//		return qtyOrdered;
//	}
//
//	/**
//	 * Sets the qtyOrdered
//	 */
//	public void setQtyOrdered(int qtyOrdered) {
//		this.qtyOrdered = qtyOrdered;
//	}

//	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
//		// store the number of discs currently in the order
//		int qty = getQtyOrdered();
//
//		// check that the order is not already full
//		if (qty < 10) {
//			// add the disc to the order
//			itemsOrdered[qty] = disc;
//
//			// increment the number of discs ordered
//			setQtyOrdered(qty + 1);
//		}
//	}
//
//	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
//		// store the number of discs currently in the order
//		int qty = getQtyOrdered();
//
//		// check that the order is not empty
//		if (qty > 0) {
//			// loop through the discs in the order
//			for (int i = 0; i < qty; i++) {
//
//				// if we have found the correct disc in
//				// the order
//				if (disc.equals(itemsOrdered[i])) {
//
//					// remove the disc from the order
//					itemsOrdered[i] = null;
//
//					// decrement the number of discs
//					// ordered
//					setQtyOrdered(qty - 1);
//
//					// exit the loop;
//					break;
//				}
//			}
//		}
//	}
//
//	public float totalCost() {
//		// store the number of discs currently in the order
//		int qty = getQtyOrdered();
//
//		// store the running total of the discs in the order
//		float total = 0;
//
//		// loop through the discs in the order
//		for (int i = 0; i < qty; i++) {
//			total = total + itemsOrdered[i].getCost();
//		}
//		return total;
//	}
	private ArrayList<Media> itemsOrdered= new ArrayList<Media>();

	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public void addMedia(Media mediaName){
		if(!(itemsOrdered.contains(mediaName))){
			itemsOrdered.add(mediaName);
		}
	}
	public void removeMedia(Media mediaName){
		if((itemsOrdered.contains(mediaName))){
			itemsOrdered.remove(mediaName);
		}
	}
	public float totalCost(){
		float total=0;
		Media mediaItem;
		java.util.Iterator iter=itemsOrdered.iterator();
		while (iter.hasNext()) {
			mediaItem = (Media) (iter.next());
			total += mediaItem.getCost();
		}
		return total ;

	}
}