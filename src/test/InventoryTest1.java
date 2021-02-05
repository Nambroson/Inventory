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
public class InventoryTest1 {
	
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
	public void testUpdateStock() {
		assertEquals("Current Stock: 8", inventoryLogic.updateStock(ball));
	}
	
	@Test
	public void testOutOfStock() {
		assertFalse(inventoryLogic.checkInStock(glove));
	}
	
	@Test
	public void testInStock() {
		assertTrue(inventoryLogic.checkInStock(ball));
	}

}
