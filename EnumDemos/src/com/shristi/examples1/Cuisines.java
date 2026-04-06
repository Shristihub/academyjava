package com.shristi.examples1;

public enum Cuisines {
  
	CH("CHINESE"),
	SI("SOUTH INDIAN"),
	NI("NORTH INDIAN"),
	ME("MEXICAN"),
	IT("ITALIAN");
	
	String cuisineName;
	private Cuisines(String name){
		this.cuisineName=name;
	}
	
	public String getCusine(){
		 return cuisineName;
	 }
	
	
}
