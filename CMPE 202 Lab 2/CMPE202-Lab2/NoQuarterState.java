

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    private boolean turnCrankFlag = false;
    int numberOfDimes = 0;
    int returnValue = 0;
    int moneyValue = 0;
    
    State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
        moneyValue = gumballMachine.getMoneyValue();
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		moneyValue = moneyValue + 25;
		checkMoneyValue();
		
	}
	
	public void insertDime() {
		System.out.println("You inserted a dime");
		moneyValue = moneyValue + 10;
		checkMoneyValue();
		
	}
	
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		moneyValue = moneyValue + 5;
		checkMoneyValue();
	}
 
	public void ejectQuarter() {
		System.out.println ("Cannot eject quarter");
	}
	
	public void ejectDime() {
		System.out.println ("Cannot eject dime");
	}
	
	public void ejectNickel() {
		System.out.println ("Cannot eject nickel");
	}
	
	public void turnCrank() {
		turnCrankFlag = true;
		System.out.println("You turned, but there is not enough money");
	 }
 
	public void dispense() {
		System.out.println("You need to pay " +(50-moneyValue)+ " cents first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
	
	private void checkMoneyValue () {
		if (moneyValue == 50) {
			moneyValue = 0;
			gumballMachine.setreturnValue(moneyValue);
			gumballMachine.setState(gumballMachine.getHasQuarterState());
			
		} else if (moneyValue < 50) {
			System.out.println("Have "+moneyValue+" cents. Insert "+(50-moneyValue)+ " cents more");
		} else {
			int excessValue = moneyValue - 50;
			System.out.println ("Need to return "+excessValue+" cents");
			gumballMachine.setreturnValue(excessValue);
			moneyValue = 0;
			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		gumballMachine.setMoneyValue(moneyValue);
		
	}


}
