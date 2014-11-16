

import java.util.ArrayList;
import java.util.List;

public class CustomBurgerDecorator extends DecoratorBurger {
	DecoratorBurger componentReference;
	private List<Component> components = new ArrayList<Component>();
	private String description;

	public CustomBurgerDecorator(DecoratorBurger b, String d) {
		description = d;
		componentReference = b;
	}

	public CustomBurgerDecorator() {
	}

	@Override
	public void printDescription() {
		System.out.println(description + " " + getCost());
		for (Component obj : components) {
			obj.printDescription();
		}
	}

	@Override
	public void addChild(Component c) {
		components.add(c);
	}

	@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getChild(int i) {
		return components.get(i);
	}
	
	@Override
	public int getNumberOfChildren() {
		return components.size();
	}

	@Override
	public Double getCost() {
		return componentReference.getCost();
	}

}
