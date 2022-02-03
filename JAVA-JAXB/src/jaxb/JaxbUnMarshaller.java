package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import modelo.Product;
import modelo.Products;

public class JaxbUnMarshaller {
	
	public Products init (String file) {
		Products lectura = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Products.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			lectura = (Products) unmarshaller.unmarshal(new File(file));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		if (lectura == null) System.out.println("ERROR MARSHALLING");
		else {
			for (Product p : lectura.getProducts()) {
				System.out.println(p);
			}
		}
		
		return lectura;
	}
}
