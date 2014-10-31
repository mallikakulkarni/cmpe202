
public class DecoratorBurger implements Component {
	
	private Component component;
	
	public DecoratorBurger(Component c) {
		component = c;
	}
	
	public DecoratorBurger() {}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Double getCost() {
		return 0.00;
	}

}
