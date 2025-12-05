module Project1VirtualATM {
}
//Virtual ATM
//
//
//Create a Java Project as  VirtualATM
//
//Two  Packages
//com.bankapp.service
//com.bankapp.client
//
//the classes in com.bankapp.service
//
//-  Account, Savings, Current,
//
//Create the class Account as an abstract class
//abstract class Account
//- Has double balance as instance variable
// - Has parameterised constructor
// - Add methods as 
//abstract void withdraw(double amount);
//abstract  void deposit(double amount);
//double getBalance(){return the balance}  // concrete method
//
//Create the subclass as  Savings and Current. Override only withdraw() and deposit() in the subclasses. Give a different logic for Savings withdraw() and deposit() method compared to Current withdraw() and deposit() method.
//getBalance() should not be overridden
//
//Add own methods in Savings and Current class
//In Savings - void showDepositSchemes(){ print( some scheme names)}
//In Current - void transactionsAllowed(print(allow 20 transactions per day) )
//
//in com.bankapp.client
//
//Create the main class as ATMMain
//Use Scanner, switch case, If and concept of dynamic method dispatch to call the methods. Try to simulate a virtual ATM(Use While True)
//Allow the user to choose between Savings or Current
//On Selection choose withdraw, deposit or getBalance
//On Selection ask for the amount -> perform the operation and return the balance
//Check if he wants to do more transaction if yes proceed and ask for choice else exit the application using System.exit(0);