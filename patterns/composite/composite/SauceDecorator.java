package composite;



public class SauceDecorator extends DecoratorBurger{
	
	private String[] sauces;
	DecoratorBurger componentReference;
	
	public SauceDecorator(DecoratorBurger c, String[] sauces) {
		this.sauces = sauces;
		componentReference = c;
	}
	
	@Override
	public Double getCost() {
		Double cost;
		Double extraSauceCost = 0.50;
		int numberFreeSauces = 1;
		if (sauces.length > numberFreeSauces) {
			cost = (sauces.length - numberFreeSauces) * extraSauceCost;
			
		}
		else {
			cost = 0.00;
		}
		return componentReference.getCost() + cost;
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		for (int i = 0; i < sauces.length; i++) {
			System.out.print(sauces[i]);
			if (i != sauces.length - 1) {
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
