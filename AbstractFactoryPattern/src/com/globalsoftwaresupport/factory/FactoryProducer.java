package com.globalsoftwaresupport.factory;

import com.globalsoftwaresupport.abstractfactory.AbstractFactory;
import com.globalsoftwaresupport.abstractfactory.ElectricCarFactory;
import com.globalsoftwaresupport.abstractfactory.PetrolCarFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("ELECTRIC"))
			return new ElectricCarFactory();
		else if(factory.equals("PETROL"))
			return new PetrolCarFactory();
		
		return null;
	}
}
