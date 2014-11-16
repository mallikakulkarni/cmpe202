

public class PattyDecoratorFourDollars extends DecoratorBurger {

	private String patty;
	DecoratorBurger componentReference;
	Double cost;

	public PattyDecoratorFourDollars(DecoratorBurger c, String patty) {
		this.patty = patty;
		componentReference = c;
	}	


	@Override
	public Double getCost() {
		cost = 0.00;
		if (patty != "") {
			cost = 4.00;
		}
		
		return componentReference.getCost() + cost;
	}

	@Override
	public void printDescription() {
		if (patty != "") {
			System.out.println(patty);
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
