package composite;


public class BunDecorator extends DecoratorBurger {
	
	private String bun;
	private DecoratorBurger componentReference;
	
	public BunDecorator(DecoratorBurger c, String bun) {
		this.bun = bun;
		componentReference = c;
	}
	
	
	
	@Override
	public void printDescription() {
		if (bun != "") {
			System.out.println(bun);
		}
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
		
		Double cost = 0.00;
		return componentReference.getCost() + cost;
		
	}
	
	
}
