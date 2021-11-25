package modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="product")
@XmlType(propOrder= {"name","price","stock"})
public class Product {
	private String name;
	private Price price;
	private Stock stock;
	
	public Product () {
		
	}

	public Product(String name, Price price, Stock stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="price")
	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	@XmlElement(name="stock")
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	
}
