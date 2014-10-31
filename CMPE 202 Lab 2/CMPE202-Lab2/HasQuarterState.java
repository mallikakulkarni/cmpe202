

import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	int returnValue = 0;
	
	private boolean turnCrankFlag = false;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
	
	public void insertDime() {
		System.out.println("You can't insert another dime");
	}
	
	public void insertNickel() {
		System.out.println("You can't insert another nickel");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter Returned");

	}
	
	public void ejectDime() {
		System.out.println("Dime Returned");

	}
	
	public void ejectNickel() {
		System.out.println("Nickel returned");

	}
 
	public void turnCrank() {
		turnCrankFlag = true;
		System.out.println("You turned...");
		returnValue = gumballMachine.getreturnValue();
		checkReturnValue();
		returnValue = 0;
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
	
	void checkReturnValue() {
		if (returnValue > 0) {
			if (returnValue >= 10) {
				for (int i = 1; i <= returnValue/10; i++) {
					ejectDime();
					returnValue = returnValue - 10;
				}
			}
			if (returnValue > 0) {
				ejectNickel();
			}
		}
	}
	
}
