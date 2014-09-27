

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		IGumballMachine gumballMachine = new GumballMachine(4);

		System.out.println(gumballMachine);

		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.insertNickel();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.takeGumballFromSlot();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
		
		gumballMachine.isGumballInSlot();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.isGumballInSlot();
		gumballMachine.takeGumballFromSlot();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		gumballMachine.insertNickel();
		gumballMachine.turnCrank();
	}
	
	
	
}
