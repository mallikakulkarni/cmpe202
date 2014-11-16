
public class SideDecorator extends DecoratorBurger {
	
	private String side;
	private DecoratorBurger componentReference;
	
	public SideDecorator(DecoratorBurger c, String side) {
		this.side = side;
		componentReference = c;
	}
	
	
	
	@Override
	public void printDescription() {
		System.out.println(side);
		System.out.println();
		
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

	@Override
	public Double getCost() {
		Double cost;
		if (side != "") {
			cost = 3.00;
		}
		else {
			cost = 0.00;
		}
		return componentReference.getCost() + cost;
		
	}
	
	
}
