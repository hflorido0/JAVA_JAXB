package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import modelo.Product;
import modelo.Store;

public class JaxbUnMarshaller2 {
	
	public void init () {
		Store products = null;
		try {
			JAXBContext context = JAXBContext.newInstance(Store.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			products = (Store) unmarshaller.unmarshal(new File("files/productos.xml"));
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
