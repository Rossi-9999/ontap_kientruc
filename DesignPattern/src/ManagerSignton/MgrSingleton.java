package ManagerSignton;

import java.util.ArrayList;
import java.util.List;

public class MgrSingleton {

	List<Category> categories;
	List<Product> products;
	private static MgrSingleton instance=null;
	
	private MgrSingleton() {
		categories = new ArrayList<>();
		products = new ArrayList<>();
		System.out.println("Init obj MgrSingleton");
	}

	public synchronized static MgrSingleton getInstance() {
		if (instance==null) {
			instance=new MgrSingleton();
		}return instance;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
