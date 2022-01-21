package main;

import java.util.ArrayList;

import jaxb.JaxbMarshaller;
import jaxb.JaxbUnMarshaller;

public class Main {

	public static void main(String[] args) {
		(new JaxbUnMarshaller()).init("files/products.xml");
		(new JaxbMarshaller()).init("files/productsResult.xml", new ArrayList<Object>());
	}

}
