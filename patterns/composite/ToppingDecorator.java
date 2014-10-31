
public class ToppingDecorator extends DecoratorBurger{
	private String[] toppings;
	private DecoratorBurger componentReference;
	
	public ToppingDecorator(Component component) {
		super(component);
	}
	
	public ToppingDecorator(DecoratorBurger c, String[] toppings) {
		this.toppings = toppings;
		componentReference = c;
	}
	
	@Override
	public Double getCost() {
		Double cost;
		Double extraToppingCost = 0.75;
		int numberFreeToppings = 4;
		if (toppings.length > numberFreeToppings) {
			cost = (toppings.length - numberFreeToppings) * extraToppingCost;
			
		}
		else {
			cost = 0.00;
		}
		return componentReference.getCost() + cost;
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		for (int i = 0; i < toppings.length; i++) {
			System.out.print(toppings[i]);
			if (i != toppings.length - 1) {
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
