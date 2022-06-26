package com.sahan.cohor5app.model;

public class Mobile {
	
	private int id;
	private String brand;
	private String model;
	private int capacity;
	private float price;
	
	
	
	public Mobile() {
		
	}
	
	public Mobile(String brand, String model, int capacity, float price) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public Mobile(int id, String brand, String model, int capacity, float price) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
