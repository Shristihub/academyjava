module Project2VoterApp {
}
//VoterApp
//
//Create a java project - VoterApp 
//
//VoterApp has these packages
//
//com.voterapp.service
//com.voterapp.client
//com.voterapp.exception
//
//com.voterapp.service
//
//IElectionBoothService - Interface 
//boolean checkEligibility(int age,String locality,int vid)throws 	 NotEligibleException;
//class ElectionBoothServiceImpl implements IElectionBoothService{
//
////overridden
//boolean checkEligibility(int age,String locality,int vid) throws 	 NotEligibleException{
// // call all three method and throw the exception to main method
//
//}
//private boolean checkAge(int age)throws UnderAgeException{
// If age is <  18 throw exception else return true
//}
//private boolean checkLocality(String locality )throws LocalityNotFoundException{
// String[] localities = {“JP Nagar”,”ABC Nagar”,”whitefield”};
//// iterate and check if locality is available if not throw exception
//
// Return true
//}
//private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
//If voter id is < 1000- or greater than 9999 throw exception else return true
// }
//
//com.voterapp.exceptions
//LocalityNotFoundException extends NotEligibleException
//UnderAgeException extends NotEligibleException
//InvalidVoterIDException extends NotEligibleException
//NotEligibleException extends Exception	
//
//com.voterapp.client
//class Voter{
//Psvm(){
//Use scanner first get age -> 
//if age does not match handle exception and terminate, else
//If locality does not match, handle exception and terminate, else
//If voterid does not match, handle exception and terminate, else
//Print “You are eligible to vote”
//}
//
//   
//
//     
//
// 