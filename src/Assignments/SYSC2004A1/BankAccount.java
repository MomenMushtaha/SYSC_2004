package Assignments.SYSC2004A1;

class BankAccount
{
    private double balance;	   
    private String accountNumber; 
    public BankAccount()
    { //defultconstructor 
        accountNumber="101114546"; //sets defult account number
        balance= 50; //sets defult balance
        
        
    }
    public BankAccount(String accoutNo, double startingBalance)
    { //constructor that passes two values 
        accountNumber = accoutNo; //asks for account number 
        balance = startingBalance; //asks for balance 
    }
    public void debit(double debitamount)	
    { // mutator debit
        double NewBalance = balance - debitamount; // subtract from the balance
        balance = NewBalance;			
    }
    public void credit(double creditamount)	
    { // mutator credit 
        double NewBalance = balance + creditamount; // add to the balance
        balance = NewBalance;				
    }
    public double Getbalance()	
    { // accessor to get the balance // it shows your balance 
        return balance;			
    }
    
    public void printAccountinfo()	
    { //to print out info
        System.out.println("acountnumber:"+ accountNumber); //print account number 
        System.out.println("Balance:" + balance + "CAD"); // prints balance	
    }
    
    
}