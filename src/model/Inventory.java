package model;

/**
 * @author Nick Ambroson - ntambroson
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class Inventory {
	private String itemName;
	private double price;
	private int quantity;
	private int sold;
	
	public Inventory() {
		
	}
	
	public Inventory(String itemName, double price, int quantity, int sold) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.sold = sold;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSold() {
		return sold;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	@Override
	public String toString() {
		return "Inventory: \n"
				+ "[Item name: " + itemName + "] \n"
				+ "[Price: " + price + "] \n"
				+ "[Number in stock: " + quantity + "]";
	}

}
