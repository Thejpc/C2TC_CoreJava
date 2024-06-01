package com.tnsif.java.collections;
import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sOne = new HashSet();
		sOne.add(5);
		sOne.add(7);
		sOne.add(7);
		System.out.println("the values stored in a set: "+sOne);
	
		sOne.add(null);
		System.out.println("the values stored in a set: "+sOne);
		

	}

}

