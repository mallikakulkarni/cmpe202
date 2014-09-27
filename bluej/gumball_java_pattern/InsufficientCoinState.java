

public class InsufficientCoinState implements State {
    GumballMachine gumballMachine;
    private int coinValueCount = 0;
    private int extraValue = 0;
    private boolean insertQuarterFlag = false;
    private boolean insertDimeFlag = false;
    private boolean insertNickelFlag = false;
 
    public InsufficientCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		coinValueCount = coinValueCount + 25;
		insertQuarterFlag = true;
		checkCoinValue();
		
	}
	
	public void insertDime() {
		System.out.println("You inserted a dime");
		coinValueCount = coinValueCount + 10;
		checkCoinValue();
		insertDimeFlag = true;
	}
	
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		coinValueCount = coinValueCount + 5;
		checkCoinValue();
		insertNickelFlag = true;
	}
 
	public void ejectQuarter() {
		
		if (insertQuarterFlag == false) {
			System.out.println("You haven't inserted a quarter. Cannot eject");
		}
		else {
			System.out.println("Quarter ejected");
			coinValueCount = coinValueCount - 25;
		}
	}
	
	public void ejectDime() {
		if (insertDimeFlag == false) {
			System.out.println("You haven't inserted a dime. Cannot eject");
		}
		else {
			System.out.println("Dime ejected");
			coinValueCount = coinValueCount - 10;
		}
	}
	
	public void ejectNickel() {
		if (insertNickelFlag == false) {
			System.out.println("You haven't inserted a nickel. Cannot eject");
		}
		else {
			System.out.println("Nickel ejected");
			coinValueCount = coinValueCount - 5;
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for a coin";
	}
	
	public void checkCoinValue () {
		if (coinValueCount == 50) {
			gumballMachine.setState(gumballMachine.getFiftyCentsState());
			coinValueCount = 0;
			System.out.println("Have 50 cents");
			insertQuarterFlag = false;
			insertDimeFlag = false;
			insertNickelFlag = false;
			
		} else if (coinValueCount < 50) {
			gumballMachine.setState(gumballMachine.getInsufficientCoinState());
			System.out.println("You need to insert "+(50 - coinValueCount)+" cents more");
		}
		else {
			
			System.out.println("Have " +coinValueCount+ " cents. Returning " +(coinValueCount-50)+ " cents");
			extraValue = coinValueCount-50;
			coinValueCount = 0;
			insertQuarterFlag = false;
			insertDimeFlag = false;
			insertNickelFlag = false;
			gumballMachine.setState(gumballMachine.getFiftyCentsState());
			gumballMachine.passExtraValue(extraValue);
		}
	}
	
	
	
}
