
public class PremiumDecorator extends DecoratorBurger{
	
	private String[] premiumToppings;
	private DecoratorBurger componentReference;
	
	public PremiumDecorator(Component component) {
		super(component);
	}
	
	public PremiumDecorator(DecoratorBurger c, String[] premiumToppings) {
		this.premiumToppings = premiumToppings;
		componentReference = c;
	}
	
	@Override
	public Double getCost() {
		Double cost;
		Double PremiumToppingCost = 1.50;
		cost = premiumToppings.length * 1.50;
		return componentReference.getCost() + cost;
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		for (int i = 0; i < premiumToppings.length; i++) {
			System.out.print(premiumToppings[i]);
			if (i != premiumToppings.length - 1) {
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
