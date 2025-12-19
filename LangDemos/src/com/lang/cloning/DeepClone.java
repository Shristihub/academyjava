package com.lang.cloning;

public class DeepClone {
	public static void main(String[] args) {
		
		Address address = new Address("Karnataka", "Bengaluru");
		Customer customer = new Customer("Roni",1,address);
		try {
			Customer clonedCustomer = (Customer) customer.clone();
			System.out.println("customer "+customer);
			System.out.println("clonedcustomer "+clonedCustomer);
			
			address.setCity("Mysore");
			customer.setAddress(address);
			System.out.println();
			System.out.println("Cus-city "+customer.getAddress().getCity());//Mysore
			System.out.println("ClonedCus-city "+clonedCustomer.getAddress().getCity()); //Mysore
			
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
}
