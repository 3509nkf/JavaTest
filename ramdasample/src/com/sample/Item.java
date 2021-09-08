package com.sample;

public class Item {
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}

	private String id;
	private String name;
	private String description;
	private int price;
	
	public Item id(String id) {
		this.id = id;
		return this;
	}
	
	public Item name(String name) {
		this.name = name;
		return this;
	}
	
	public Item description(String description) {
		this.description = description;
		return this;
	}
	
	public Item price(int price) {
		this.price = price;
		return this;
	}
	
	public Item save() {
		System.out.println("save");
		return this;
	}

}
