
public class Item {
	private String name; //���i��
	private int price;
	private int priceWithTax;//�ō��݉��i
	
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
		
		assert 0 < price : "price is invalid value : " + this.price; //�A�T�[�V�����������������G���[���b�Z�[�W���\�������
		//price���}�C�i�X�łȂ��悤�ɂ��Ȃ��Ƃ����Ȃ��B
		int taxPrice = tax.calcTax(this.price);
		this.priceWithTax = this.price + taxPrice;
		return priceWithTax;
	}
	
	

}