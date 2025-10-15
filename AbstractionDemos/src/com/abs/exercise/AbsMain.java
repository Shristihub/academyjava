package com.abs.exercise;

public class AbsMain {

	public static void main(String[] args) {
		// super class ref = sub class object
		Bank bank = new Branch1();
		// all methods of Bank class
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		bank.adminDetails();
		System.out.println();

		Branch1 branch1 = (Branch1) bank;
		// using this call all methods of Bank
		// and own methods of Branch1
		branch1.depositTypes(); // own method
		branch1.adminDetails(); // super class method
		System.out.println();
		
		bank = new SubBranch();
		// all methods of Bank class
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		bank.adminDetails();
		System.out.println();
		
		Branch2 branch2 = (Branch2)bank; // Branch2 branch2 =  new SubBranch();
	    branch2.loanTypes(); // own method
		branch2.adminDetails(); // super class method
		
		SubBranch sub = (SubBranch)bank;
		sub.cardSchemes();
		sub.loanTypes();
		sub.adminDetails();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
