package composite;

import java.util.ArrayList;
import java.util.List;



public class PremiumDecoratorTwoDollars extends DecoratorBurger{
	
	private String[] premiumToppings;
	private DecoratorBurger componentReference;
	

	public PremiumDecoratorTwoDollars(DecoratorBurger c, String[] premiumToppings) {
		this.premiumToppings = premiumToppings;
		componentReference = c;
	}
	
	//List<String> premiumToppingsExtraPricing = new ArrayList<String>();
	
	
	@Override
	public Double getCost() {
		Double cost;
		cost = premiumToppings.length * 3.00;
		return componentReference.getCost() + cost;
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		if (premiumToppings.length != 0) {
			for (int i = 0; i < premiumToppings.length; i++) {
				System.out.print(premiumToppings[i]);
				if (i != premiumToppings.length - 1) {
					System.out.print(" + ");
				}	
			}
			System.out.println();
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
}
