
public class Tax {
	
	private double rate;

	public Tax(double rate) {
		super();
		this.rate = rate;
	}
	
	public int calcTax(int price) {
		return (int) (price * rate);
	}

}
