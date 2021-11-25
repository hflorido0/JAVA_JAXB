package jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import modelo.Price;
import modelo.Product;
import modelo.Stock;
import modelo.Store;

public class JaxbUnMarshaller {
	
	public void init () {
		try {
			JAXBContext context = JAXBContext.newInstance(Store.class);
			Marshaller marshaller = context.createMarshaller();
			Store store = createXml();
			marshaller.marshal(store, new File("files/productosResult.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private Store createXml() {
		Store store = new Store();
		ArrayList<Product> products = new ArrayList<>();
		
		products.add(new Product("Prod 1", new Price("Pound"), new Stock("12","orange")));
		products.add(new Product("Prod 2", new Price("Dollar"), new Stock("56","brown")));
		products.add(new Product("Prod 3", new Price("Euro"), new Stock("62","yellow")));
		products.add(new Product("Prod 4", new Price("Dollar"), new Stock("806","green")));
		products.add(new Product("Prod 5", new Price("Euro"), new Stock("50","dark blue")));
		
		store.setProducts(products);
		
		return store;
	}
}
