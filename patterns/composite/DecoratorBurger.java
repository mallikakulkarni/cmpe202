

import java.util.ArrayList;

abstract public class DecoratorBurger implements Component  {
	abstract public Double getCost();
	
	public int getNumberOfChildren() {
		return 0;
	}
}
