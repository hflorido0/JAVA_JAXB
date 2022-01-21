package jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import modelo.Price;
import modelo.Product;
import modelo.Products;
import modelo.Stock;

public class JaxbMarshaller {
	
	public void init (String file) {
		try {
			JAXBContext context = JAXBContext.newInstance(Products.class);
			Marshaller marshaller = context.createMarshaller();
			Products products = createXml();
			marshaller.marshal(products, new File(file));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private Products createXml() {
		
		ArrayList<Product> products = new ArrayList<>();
		
		products.add(new Product("Prod 1", new Price("Pound"), new Stock("12","orange")));
		products.add(new Product("Prod 2", new Price("Dollar"), new Stock("56","brown")));
		products.add(new Product("Prod 3", new Price("Euro"), new Stock("62","yellow")));
		products.add(new Product("Prod 4", new Price("Dollar"), new Stock("806","green")));
		products.add(new Product("Prod 5", new Price("Euro"), new Stock("50","dark blue")));
		
		return new Products(products);
	}
}
