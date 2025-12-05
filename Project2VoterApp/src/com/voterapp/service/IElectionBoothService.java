package com.voterapp.service;

import com.voterapp.exceptions.NotEligibleException;

public interface IElectionBoothService {
	boolean checkEligibility(int age, String locality, int voterId) throws NotEligibleException;

}
