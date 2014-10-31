
public class PattyDecorator extends DecoratorBurger{
	
	private String[] patty;
	DecoratorBurger componentReference;
	
	public PattyDecorator(Component component) {
		super(component);
	}
	
	public PattyDecorator(DecoratorBurger c, String[] patty) {
		this.patty = patty;
		componentReference = c;
	}
	
	Double cost = 0.00;
	
	private Double calcCost(String pattyComponent) {
		//List out cost of items in menu
		Double cost;
		String[] pattyComponentsFree = {"Beef", "Chicken", "Turkey", "Veggie", "On A Bun", "Lettuce Blend", "Organic Mixed Greens"};
		String pattySmall = "1/3lb.";
		String pattyMedium = "2/3lb.";
		String pattyBig = "1lb.";
		String bowlOptions = "In A Bowl";
		
		if (pattyComponent.equals(pattySmall)) {
			cost = 9.50;
		}
		else if (pattyComponent.equals(pattyMedium)) {
			cost = 11.50;
		}
		else if (pattyComponent.equals(pattyBig)) {
			cost = 15.50;
		}
		else if (pattyComponent.equals(bowlOptions)) {
			cost = 1.00;
		}
		else {
			cost = 0.00;
		}
		
		return cost;
	}
	
	@Override
	public Double getCost() {
		
		for (String pattyComponent : patty ) {
			cost = cost + calcCost(pattyComponent);
		}
		
		return componentReference.getCost() + cost;
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		for (int i = 0; i < patty.length; i++) {
			System.out.print(patty[i]);
			if (i != patty.length - 1) {
				System.out.print(" + ");
			}	
		}
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
	
	
}
