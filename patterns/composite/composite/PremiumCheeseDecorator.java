package composite;

public class PremiumCheeseDecorator extends DecoratorBurger {
	
	private String[] cheeses;
	DecoratorBurger componentReference;
	
	public PremiumCheeseDecorator(DecoratorBurger c, String[] cheeses) {
		this.cheeses = cheeses;
		componentReference = c;
	}
	
	@Override
	public Double getCost() {
		Double cost;
		cost = cheeses.length * 1.50;
		return componentReference.getCost() + cost;	
	}
	
	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cheeses.length; i++) {
			System.out.print(cheeses[i]);
			if (i != cheeses.length - 1) {
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
