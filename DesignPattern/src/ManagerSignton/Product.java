package ManagerSignton;

import java.util.List;

public class Product {

	private int id, idCat;
	private double price;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", idCat=" + idCat + ", price=" + price + ", name=" + name + "]";
	}
	public Product(int id, int idCat, double price, String name) {
		super();
		this.id = id;
		this.idCat = idCat;
		this.price = price;
		this.name = name;
	}
	public Product() {
		super();
	}
	public void getListCat() {
		List<Category> categories=MgrSingleton.getInstance().getCategories();
	}
	
}
