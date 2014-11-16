

public class BuildOrder {

	static int numberOfChildren = 0;
	
	static Component getOrder() {
		String patty1FourDollars = "Organic Bison";
		String[] patty1 = { "1/2lb.", "On A Bun" };
		String[] cheese1 = { "Yellow American", "Spicy Jalapeno Jack"};
		String[] premiumCheese1 = {"Danish Blue Cheese"};
		String[] topping1 = { "Dill Pickle Chips", "Black Olives","Spicy Pickle"};
		String[] premiumTopping1 = {};
		String[] premiumToppingTwoDollars1 = { "Marinated Tomatoes" };
		String[] sauce1 = { "Mayonnaise", "Thai Peanut Sauce" };
		String bun1 = "Ciabatta (Vegan)";
		String bun1FiftyCents = "";
		String bun1OneDollar = "";
		String side1 = "ShoeString fries";
		
		String patty2FourDollars = "";
		String[] patty2 = { "Hormone & Antibiotic Free Beef", "1/3lb.", "On A Bun" };
		String[] cheese2 = { "Smoked Gouda", "Greek Feta"};
		String[] premiumCheese2 = {"Fresh Mozzarella"};
		String[] topping2 = { "Crushed Peanuts"};
		String[] premiumTopping2 = { "Sunny side up Egg"};
		String[] premiumToppingTwoDollars2 = { "Marinated Tomatoes" };
		String[] sauce2 = { "Habanero Salsa" };
		String bun2 = "";
		String bun2FiftyCents = "";
		String bun2OneDollar = "Gluten-Free Bun";
		String side2 = "ShoeString fries";
		
		Composite order = new Composite("Order");
		Component customBurger1 = buildYourOwnBurger(patty1FourDollars, patty1, cheese1, premiumCheese1, topping1, premiumTopping1, premiumToppingTwoDollars1, sauce1, bun1, bun1FiftyCents, bun1OneDollar, side1);
		order.addChild(customBurger1);
		numberOfChildren++;
		Component customBurger2 = buildYourOwnBurger(patty2FourDollars, patty2, cheese2, premiumCheese2, topping2, premiumTopping2, premiumToppingTwoDollars2, sauce2, bun2, bun2FiftyCents, bun2OneDollar, side2);
		order.addChild(customBurger2);
		numberOfChildren++;
		return order;
	}
	
	static Double getsubTotal(Component order) {
		double subTotal = 0.00;
		for(int i = 0; i < numberOfChildren; i++) {
			DecoratorBurger burger = (DecoratorBurger) order.getChild(i);
			subTotal = subTotal + burger.getCost();
		}
		
		return subTotal;
	}

	private static Component buildYourOwnBurger(String pattyFourDollars, String[] patty, String[] cheese, String[] premiumCheese, String[] topping, String[] premium, String[] premiumTwoDollars, String[] sauce, String bun, String bunFiftyCents, String bunOneDollar, String side) {
		
		DecoratorBurger pattyDecorator = new PattyDecorator(patty);
		DecoratorBurger pattyDecoratorFourDollars = new PattyDecoratorFourDollars(pattyDecorator, pattyFourDollars);
		DecoratorBurger cheeseDecorator = new CheeseDecorator(pattyDecoratorFourDollars,cheese);
		DecoratorBurger premiumCheeseDecorator = new PremiumCheeseDecorator(cheeseDecorator,premiumCheese);
		DecoratorBurger toppingDecorator = new ToppingDecorator(premiumCheeseDecorator, topping);
		DecoratorBurger premiumDecorator = new PremiumDecorator(toppingDecorator, premium);
		DecoratorBurger premiumDecoratorTwoDollars = new PremiumDecoratorTwoDollars(premiumDecorator, premiumTwoDollars);
		DecoratorBurger sauceDecorator = new SauceDecorator(premiumDecoratorTwoDollars, sauce);
		DecoratorBurger bunDecorator = new BunDecorator(sauceDecorator, bun);
		DecoratorBurger bunDecoratorFiftyCents = new BunDecoratorFiftyCents(bunDecorator, bunFiftyCents);
		DecoratorBurger bunDecoratorOneDollar = new BunDecoratorOneDollar(bunDecoratorFiftyCents, bunOneDollar);
		DecoratorBurger sideDecorator = new SideDecorator(bunDecoratorOneDollar, side);

		Component customBurger = new CustomBurgerDecorator(sideDecorator,"Build Your Own Burger");
		customBurger.addChild(pattyDecorator);
		customBurger.addChild(pattyDecoratorFourDollars);
		customBurger.addChild(cheeseDecorator);
		customBurger.addChild(premiumCheeseDecorator);
		customBurger.addChild(toppingDecorator);
		customBurger.addChild(premiumDecorator);
		customBurger.addChild(premiumDecoratorTwoDollars);
		customBurger.addChild(sauceDecorator);
		customBurger.addChild(bunDecorator);
		customBurger.addChild(bunDecoratorFiftyCents);
		customBurger.addChild(bunDecoratorOneDollar);
		customBurger.addChild(sideDecorator);
		return customBurger;
	}

}