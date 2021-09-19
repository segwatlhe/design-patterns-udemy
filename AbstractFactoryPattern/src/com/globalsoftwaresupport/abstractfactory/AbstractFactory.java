package com.globalsoftwaresupport.abstractfactory;

import com.globalsoftwaresupport.product.Car;

public interface AbstractFactory {
	public Car getCar(String type); // product interface with productType
									// i.e. product in the return type, and product type as an argument for the FACTORY
}
