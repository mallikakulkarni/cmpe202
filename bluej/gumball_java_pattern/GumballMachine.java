

public class GumballMachine implements IGumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	boolean isGumballinSlotFlag = false;
	int gumballsInSlot = 0;
	int returnValue = 0;
 
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void insertDime() {
		state.insertDime();
	}
	
	public void insertNickel() {
		state.insertNickel();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void ejectDime() {
		state.ejectDime();
	}
	
	public void ejectNickel() {
		state.ejectNickel();
	}
 
	public void turnCrank() {
		state.turnCrank();
		if (state == soldState) {
			gumballsInSlot = gumballsInSlot + 1;
			isGumballinSlotFlag = true;
		} else {
			isGumballinSlotFlag = false;
		}
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

	public boolean isGumballInSlot() {
		// TODO Auto-generated method stub
		if (isGumballinSlotFlag == true) {
			System.out.print(gumballsInSlot+" gumball");
			if (gumballsInSlot > 1) {
				System.out.print("s");
			}
			System.out.println (" in slot");
		}
		else {
			System.out.println ("No gumballs in slot");
		}
		return isGumballinSlotFlag;
		
	}

	
	public void takeGumballFromSlot() {
		// TODO Auto-generated method stub
		if (isGumballInSlot() == true) {
			System.out.println ("Take gumball from slot");
			gumballsInSlot = gumballsInSlot - 1;
			if (gumballsInSlot == 0) {
			System.out.println ("No gumballs left in slot");
			}
		}
	}
	
	public void setreturnValue(int value) {
		returnValue = value;
	}
	
	public int getreturnValue() {
		return returnValue;
	}
}

