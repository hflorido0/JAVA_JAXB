package modelo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="stock")
public class Stock {
	private String storage;
	private String color;
	
	public Stock() {
		
	}

	public Stock(String storage, String color) {
		this.storage = storage;
		this.color = color;
	}

	@XmlAttribute(name="storage")
	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	@XmlAttribute(name="color")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Stock [storage=" + storage + ", color=" + color + "]";
	}
	
}
