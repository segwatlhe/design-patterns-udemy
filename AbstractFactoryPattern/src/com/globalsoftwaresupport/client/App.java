package com.globalsoftwaresupport.client;

import com.globalsoftwaresupport.abstractfactory.AbstractFactory;
import com.globalsoftwaresupport.factory.FactoryProducer;

public class App {

	public static void main(String[] args) {
		
		AbstractFactory factory = FactoryProducer.getFactory("ELECTRIC");
		factory.getCar("TOYOTA").assemble();
	}
}
