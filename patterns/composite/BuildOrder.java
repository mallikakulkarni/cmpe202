

public class BuildOrder {

  
	
	public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        order.addChild(new Leaf("The Purist", 8.00 ));
        
        final String[] patty = {"Beef", "1/3lb.", "On A Bun"};//"In A Bowl", "Lettuce Blend"};
    	final String[] cheese = {"Danish Blue Cheese", "Horseradish Cheddar"};
    	final String[] topping = {"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"};
    	final String[] premiumTopping = {"Applewood Smoked Bacon"};
    	final String[] sauce = {"Appricot Sauce"};
    	final String[] bowlGreens = {"Lettuce Blend", "Organic Mixed Greens"};
    	DecoratorBurger b = new DecoratorBurger();
    	PattyDecorator pattyDecorator = new PattyDecorator(b, patty);
    	CheeseDecorator cheeseDecorator = new CheeseDecorator(pattyDecorator, cheese);
    	ToppingDecorator toppingDecorator = new ToppingDecorator(cheeseDecorator, topping);
    	PremiumDecorator premiumDecorator = new PremiumDecorator(toppingDecorator, premiumTopping);
    	SauceDecorator sauceDecorator = new SauceDecorator(premiumDecorator, sauce);
        
    	Composite customBurger = new Composite( "Build Your Own Burger", sauceDecorator ) ;
    	
    	
        customBurger.addChild(pattyDecorator);
      
        customBurger.addChild(cheeseDecorator);
        customBurger.addChild(toppingDecorator);
        customBurger.addChild(premiumDecorator);
        customBurger.addChild(sauceDecorator);
        order.addChild( customBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square
/*customBurger.addChild(new Leaf("Beef, 1/3 lb on a Bun", 9.50 )); // base price for 1/3 lb
        customBurger.addChild(new Leaf("Danish Blue Cheese", 0.00 )); // 1 cheese free, extra cheese +1.00
        customBurger.addChild(new Leaf("Horseradish Cheddar", 1.00 )); // extra cheese +1.00
        customBurger.addChild(new Leaf("Bermuda Red Onion", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Black Olives", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Carrot Strings", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Coleslaw", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Applewood Smoked Bacon", 1.50 )); // premium topping +1.50
        customBurger.addChild(new Leaf("Appricot Sauce", 0.00 )); // 1 sauce free, extra +.75
        order.addChild( customBurger );
        return order ;
*/