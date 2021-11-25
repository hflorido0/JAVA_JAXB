package modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="product")
@XmlType(propOrder= {"name","price","stock"})
public class Product {
	@XmlAttribute(name="name")
	private String name;
	@XmlElement(name="price")
	private Price price;
	@XmlElement(name="stock")
	private Stock stock;
	
	public Product() {};
	
	public Product(String name, Price price, Stock stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}
	
	public Price getPrice() {
		return price;
	}

	public Stock getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
}
