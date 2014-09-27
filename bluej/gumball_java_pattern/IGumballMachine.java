
public interface IGumballMachine {
	void insertQuarter();
	void insertNickel();
	void insertDime();
	void turnCrank();
	boolean isGumballInSlot();
	void takeGumballFromSlot();
}