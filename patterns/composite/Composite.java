

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>()  ;
    private String description ;
    private DecoratorBurger b = null;
    
    public Composite ( String d )
    {
        description = d ;
    }
    
    public Composite ( String d, DecoratorBurger b )
    {
        description = d ;
        this.b = b;
    }

	public void printDescription() {
        if (b != null) {
        	System.out.println( description+" "+ b.getCost());
        }
        else {
        	System.out.println( description );
        }
        System.out.println();
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
	
	

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	 
}
 
