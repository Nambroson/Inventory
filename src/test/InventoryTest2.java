package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Inventory;
import model.InventoryLogic;

/**
 * @author Nick Ambroson - ntambroson
 * CIS175 - Spring 2021
 * Feb 4, 2021
 */
public class InventoryTest2 {
	
	Inventory ball = new Inventory("Ball", 5.99, 10, 2);
	Inventory glove = new Inventory("Glove", 14.99, 5, 5);
	
	InventoryLogic inventoryLogic = new InventoryLogic();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCorrectInventoryDisplay() {

		String display = "Inventory: \n"
				+ "[Item name: " + ball.getItemName() + "] \n"
				+ "[Price: " + ball.getPrice() + "] \n"
				+ "[Number in stock: " + (ball.getQuantity() - ball.getSold()) + "]";
		
		assertEquals(display, inventoryLogic.displayInventoryDetails(ball));
	}

}
