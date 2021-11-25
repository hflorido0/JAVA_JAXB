package main;

import jaxb.JaxbMarshaller;
import jaxb.JaxbUnMarshaller;

public class Main {

	public static void main(String[] args) {
		(new JaxbUnMarshaller()).init();
		(new JaxbMarshaller()).init();
	}

}
