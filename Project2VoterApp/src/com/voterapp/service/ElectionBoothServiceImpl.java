package com.voterapp.service;

import com.voterapp.exceptions.InvalidVoterIdException;
import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException {
		//call the three methods to check logic and throw specific exception
		checkAge(age);
		return false;
	}
	
	private boolean checkAge(int age )throws UnderAgeException{
		// If age is <  18 throw exception else return true
		return false;
	}

	private boolean checkLocality(String locality )throws LocalityNotFoundException{
		String[] localities = {"JP Nagar","ABC Nagar","whitefield"};
		// iterate and check if locality is available. if yes return true else throw exception
		return false;
	}
	private boolean checkVoterId(int voterId) throws InvalidVoterIdException {
		//If voter id is < 1000- or greater than 9999 throw exception else return true
		return false;
	}
}

	
	
	
	
	
	
	
	
	