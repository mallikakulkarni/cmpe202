package composite;



public class PattyDecorator extends DecoratorBurger {

	private String[] patty;
	DecoratorBurger componentReference;
	Double cost;

	public PattyDecorator(String[] patty) {
		this.patty = patty;
	}

	private Double calcCost(String pattyComponent) {
		// List out cost of items in menu
		Double componentCost;
		String[] pattyComponentsFree = { "On A Bun", "Seasonal Lettuce Blend", "Organic Mixed Greens", "Baby Spinach", "Kale", "Quinoa",	 "Hormone & Antibiotic free beef", 
				"100% Natural Chicken Breast", "100% Natural Ground Turkey", "Housemade Vegan Veggie"};
		String pattySmall = "1/3lb.";
		String pattyMedium = "1/2lb.";
		String pattyBig = "1lb.";
		String bowlOptions = "In A Bowl";
		String[] fourDollarPatties = {"Organic Bison", "Ahi Tuna"};
		

		if (pattyComponent.equals(pattySmall)) {
			componentCost = 9.00;
		} else if (pattyComponent.equals(pattyMedium)) {
			componentCost = 12.00;
		} else if (pattyComponent.equals(pattyBig)) {
			componentCost = 18.00;
		} else if (pattyComponent.equals(bowlOptions)) {
			componentCost = 1.00;
		} else {
			componentCost = 0.00;
		}
		
		return componentCost;
	}

	@Override
	public Double getCost() {
		cost = 0.00;
		for (String pattyComponent : patty) {
			cost = cost + calcCost(pattyComponent);
		}
		return cost;
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
