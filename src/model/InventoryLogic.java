package model;

/**
 * @author Nick Ambroson - ntambroson
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class InventoryLogic {
	
	public boolean checkInStock(Inventory stock) {
		final int OUT_OF_STOCK = 0;
		
		if((stock.getQuantity() - stock.getSold()) == OUT_OF_STOCK) {
			return false;
		}
		return true;
	}
	
	public String updateStock(Inventory stock) {
		int currentStock = stock.getQuantity() - stock.getSold();
		stock.setQuantity(currentStock);
		return "Current Stock: " + currentStock;
	}
	
	public String displayInventoryDetails(Inventory stock) {
		return "Inventory: \n"
				+ "[Item name: " + stock.getItemName() + "] \n"
				+ "[Price: " + stock.getPrice() + "] \n"
				+ "[Number in stock: " + (stock.getQuantity() - stock.getSold()) + "]";
	}
	
	

}
