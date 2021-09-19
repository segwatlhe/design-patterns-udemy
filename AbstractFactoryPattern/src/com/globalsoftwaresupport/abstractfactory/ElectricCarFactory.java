package com.globalsoftwaresupport.abstractfactory;

import com.globalsoftwaresupport.product.Car;
import com.globalsoftwaresupport.product.ElectricFord;
import com.globalsoftwaresupport.product.ElectricToyota;

public class ElectricCarFactory implements AbstractFactory {

	@Override
	public Car getCar(String type) {
		 if(type.equals("FORD"))
			 return new ElectricFord();
		 else if(type.equals("TOYOTA"))
			 return new ElectricToyota();
		 
		 return null;
	}

}
