package org.tnsif.java.polymorphism;

import org.tnsif.java.inheritance.Citizen;

public class MethodOverridingMain extends Citizen {

	public MethodOverridingMain(long aadharNo, String nationality, String dob, String address) {
		super(aadharNo, nationality, dob, address);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		/*public MethodOverridingMain(long aadharNo, String nationality, String dob, String address) {
			super(aadharNo, nationality, dob, address);
			// TODO Auto-generated constructor stub
		}*/
		
		// TODO Auto-generated method stub
		RBI sb= new SBI();
		System.out.println(sb.getRateofInterest());
		
		RBI ic= new ICICI();
		System.out.println(ic.getRateofInterest());
		
		//Citizen c = new Citizen();
		 //MethodOverridingMain m = new  MethodOverridingMain();
		

	}
}