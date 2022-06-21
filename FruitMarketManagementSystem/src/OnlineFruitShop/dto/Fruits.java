package OnlineFruitShop.dto;

public class Fruits {
	private int fruidid;
	private String fruitname;
	private int price;
	private String description;
	public int getFruidid() {
		return fruidid;
	}
	public void setFruidid(int fruidid) {
		this.fruidid = fruidid;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Fruits(int fruidid, String fruitname, int price, String description) {
		super();
		this.fruidid = fruidid;
		this.fruitname = fruitname;
		this.price = price;
		this.description = description;
	}
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}

}


