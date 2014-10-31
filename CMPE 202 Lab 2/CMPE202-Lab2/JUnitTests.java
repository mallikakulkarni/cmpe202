import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class JUnitTests {
	
	@Test
	public void testBalanceForLessThan50Cents () {
		//If more than 50 cents are present in machine
		//Machine remembers how much money to return
		GumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		assertEquals(35 , gumballMachine.getMoneyValue());
	}
	
	@Test
	public void testBalanceIsReturnedForExtraMoney () {
		//If more than 50 cents are present in machine
		//Machine remembers how much money to return
		GumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		assertEquals (10, gumballMachine.getreturnValue());
	}
	
	@Test
	public void checkSlotAfterRemovingTwoGumballs() {
		//If two gumballs are present in slot
		//Check if isGumballInSlot() returns false 
		//after two gumballs are removed
		IGumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.takeGumballFromSlot();
		boolean gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(false, gumBallinSlotFlag);
	}
	
	@Test
	public void checkSlotForTwoGumballs() {
		//Check if isGumballInSlot() returns true 
		//if two or more gumballs are in the slot
		IGumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		boolean gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(true, gumBallinSlotFlag);
		gumballMachine.takeGumballFromSlot();
		gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(false, gumBallinSlotFlag);
	}
	
	@Test
	public void checkMoreThanFiftyCentsGumball() {
		//Check if gumball is dispensed for more than 50 cents
		IGumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		boolean gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(true, gumBallinSlotFlag);
	}
	
	
	
	@Test
	public void checkLessThanFiftyCents() {
		//Check if gumball is NOT dispensed for less than 50 cents
		IGumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		boolean gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(false, gumBallinSlotFlag);
	}
	
	@Test
	public void checkEqualToFiftyCents() {
		////Check if gumball is dispensed for equal to 50 cents
		IGumballMachine gumballMachine = new GumballMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		boolean gumBallinSlotFlag = gumballMachine.isGumballInSlot();
		assertEquals(true, gumBallinSlotFlag);
	}
	
}	