
public class Main {
	
	public static void main(String[] args) {
		
		Tax tax = new Tax(0.1);
		Item item = new Item("apple",-110);
		System.out.println(item.getPriceWithTax(tax));
	}

}
