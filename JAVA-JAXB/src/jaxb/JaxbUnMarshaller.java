package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import modelo.Product;
import modelo.Products;

public class JaxbUnMarshaller {
	
	public void init (String file) {
		Products products = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Products.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			products = (Products) unmarshaller.unmarshal(new File(file));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		if (products == null) System.out.println("ERROR MARSHALLING");
		else {
			for (Product p : products.getProducts()) {
				System.out.println(p);
			}
		}
	}
}
