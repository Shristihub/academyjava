package com.inter.anony;

public class AnonyMainOne {

	public static void main(String[] args) {
		
		//implementation
		IBonusCalculator ref = new IBonusCalculator() {
			@Override
			public void calcBonus(double amount) {
				System.out.println("Manager Bonus "+amount*2);
			}
		};
		//calling
		ref.calcBonus(2000);
		
		ref = new IBonusCalculator() {
			
			@Override
			public void calcBonus(double amount) {
				System.out.println("Developer Bonus "+amount);
				
			}
		}; 
		ref.calcBonus(2000);
		
	}
}
