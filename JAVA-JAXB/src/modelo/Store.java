package modelo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="store")
public class Store {
	private ArrayList<Product> products;
	
	public Store() {
		
	}

	public Store(ArrayList<Product> products) {
		this.products = products;
	}

	@XmlElementWrapper(name="products")
	@XmlElement(name="product")
	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	
}
