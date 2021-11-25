package modelo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="products")
public class Products {
	
	@XmlElement(name="product")
	private ArrayList<Product> products;
	
	public Products() {};
	
	public Products(ArrayList<Product> products) {
		this.products = products;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
	
}
