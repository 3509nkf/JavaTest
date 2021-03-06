
public class Item {
	private String name; //商品名
	private int price;
	private int priceWithTax;//税込み価格
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getPriceWithTax(Tax tax) {
		
		assert 0 < price : "price is invalid value : " + this.price; //アサーションが発生した時エラーメッセージが表示される
		//priceがマイナスでないようにしないといけない。
		int taxPrice = tax.calcTax(this.price);
		this.priceWithTax = this.price + taxPrice;
		return priceWithTax;
	}
	
	

}
