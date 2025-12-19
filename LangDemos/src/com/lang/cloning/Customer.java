package com.lang.cloning;

public class Customer implements Cloneable{

	private String customerName;
	private int customerId;
	private Address address;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, int customerId, Address address) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	protected Customer clone() throws CloneNotSupportedException {
//		Customer cloned = (Customer)super.clone();
//		//create a new address object
//		Address newaddress = new Address();
//		// get address from cloned customer - set the values for the new Address object - 
//		newaddress.setCity(cloned.getAddress().getCity());
//		newaddress.setState(cloned.getAddress().getState());
//	   //set the new  address to the cloned customer object
//		cloned.setAddress(newaddress);
//		return cloned;
		
		// get the cloned customer object
		Customer cloned = (Customer)super.clone();
	   // get the address object from clonedcustomer
	   Address address = cloned.getAddress();// loaded address with values
	   //call clone on the address object
	   Address clonedAddress =(Address)address.clone(); // cloaned address with values
	   // set the address
	   cloned.setAddress(clonedAddress);
	   return cloned;
	
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", address=" + address + "]";
	}
	
}





