

public class Client {

	public static void main(String[] args) {
	
		Component theOrder = BuildOrder.getOrder();
		theOrder.printDescription();
		
		Double subTotal = BuildOrder.getsubTotal(theOrder);
		System.out.println("Sub Total = " +subTotal);
	}
}
