package org.tnsif.java.interfacepackage;

public abstract class Sweet implements Food {
	
	public Sweet() {
		System.out.println("This food is sweet");
	}
	
	public String taste() {
		return "Sweet";
	}
	@Override
	public String consume() {
		// TODO Auto-generated method stub
		System.out.println(whoAmI);
		return  "Eat when Halwa is hot";
	}


}
