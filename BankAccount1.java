
package com.mycompany.bankaccount1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;


public class BankAccount1 {

static int accountNumber=719129236,id,pinumber=20021,number=071-192-9326,answer;
static double initialbalance=10000,deposit,withdraw,transfer,Savings=1000; 
static String name,accounttype="Real",homeaddress="2nd  Road kew St",email="deborahtshuma473@gmail.com";
static  LocalDate dateOfBirth;

static public void captureDetails(){
    Scanner e=new Scanner(System.in);

    System.out.println("Press 1 to login, 2 to register");
        answer = e.nextInt();
        if (answer == 1) {
            login();
        }
        else if (answer == 2) {
     
    System.out.println(" AFRICAN BANKING APPLICATION  ");
    
    System.out.println("Enter your full names ");
     name=e.next();
    System.out.println("Enter your date of birth (year): ");
    int year = e.nextInt();
    System.out.println("Enter your date of birth (month): ");
    int month = e.nextInt();
    System.out.println("Enter your date of birth (day): ");
    int day = e.nextInt();
    dateOfBirth = LocalDate.of(year, month, day);
    System.out.println("Enter your ID number");
     id=e.nextInt();
    System.out.println("Enter your home address");
     homeaddress=e.next();
    System.out.println("Enter your email address");
     email = e.next();
    System.out.println("Enter your celphone number");
     number=e.nextInt();
    System.out.println("Enter any 5 numbers you want");
     pinumber=e.nextInt();
   
    
    System.out.println("account Holder:"+ ""+name);
    System.out.println("Date of Birth:"+" "+dateOfBirth);
    System.out.println("Address:"+" "+homeaddress);
    System.out.println("Email Address:" + " " + email);
    System.out.println("Phone Number:"+" "+number);
    System.out.println("id number:"+""+""+id);
    System.out.println("pinumber:"+""+""+pinumber);  
     }
}
static void login() {
    Scanner e = new Scanner(System.in);
    System.out.println("Enter your 5-digit pin to proceed");
        int pinumber1 = e.nextInt();
        if (pinumber1 == pinumber) {
    System.out.println("You have successfully logged in.");
    
        }
        else {
    System.out.println("Incorrect PIN. Please try again.");
        login();
    }
    System.out.println("**************************************************************************************************");
}
 static public void MoneyOperation(){
    Scanner e=new Scanner(System.in);
    System.out.println("press 1 to deposit or press 2 to withdraw,press 3 to transfer,");
    System.out.println( "4 to get transaction,press 5 to check balance , press 6 for your savings,press 7 to get your statement");
    answer=e.nextInt();
    
    if(answer==1){
    System.out.println("how much do you want to deposit");
      deposit=e.nextDouble();
      initialbalance +=deposit;
       LocalDateTime currentDateTime=LocalDateTime.now();
    System.out.println("Amount was deposited in your account.New balance is now: R" + initialbalance + " " + currentDateTime);
       MoneyOperation();
     }
 else if(answer==2){
    System.out.println("how much do you want to withdraw");
      withdraw=e.nextDouble();
  if (withdraw <= initialbalance) {
      initialbalance -= withdraw;
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your balance is now: R" + initialbalance + " " + currentDateTime);
    } 
  else {
    System.out.println("Insufficient funds!");
    MoneyOperation();
    }
     }
 else if(answer==3){
    System.out.println("how much you want to transfer");
       transfer=e.nextDouble();
       initialbalance-=transfer;
  if (transfer <= initialbalance) {
      initialbalance -= transfer;
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your balance is now: R" + initialbalance + " " + currentDateTime);
    System.out.println("Transfer successful! " + currentDateTime);
    }
  else {
    System.out.println("Insufficient funds! " );
         MoneyOperation();
    }
} 
 else if (answer == 4) {
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Transaction History:");
    System.out.println("Date: " + currentDateTime);
    System.out.println(deposit + " was deposited into: " + accountNumber);
    System.out.println(withdraw + " was withdrawn from: " + accountNumber);
    System.out.println(transfer + " was transferred from: " + accountNumber);
         MoneyOperation();

 }
 else if (answer == 5) {
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Your current balance is: R " + initialbalance + " " + currentDateTime);
    MoneyOperation();
}
 else if (answer == 6) {
    System.out.println("Savings account: R" + Savings);
    MoneyOperation();
}
 else if(answer==7){
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Statement: " + currentDateTime);
    System.out.println("ID Number: " + id);
    System.out.println("Email Address: " + email);
    System.out.println("Address: " + homeaddress);
    System.out.println("Account Holder: " + name);
    System.out.println("Phone Number: " + number);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Type: " + accounttype);
    System.out.println("Initial Balance: R" + initialbalance);
    System.out.println("Savings Account: R" + Savings);
    System.out.println("Withdrawals: R" + withdraw);
    System.out.println("Transfers: R" + transfer);
    System.out.println("Deposits: R" + deposit);
    MoneyOperation();
    System.out.println("**************************************************************************************************");      
 }
 }
 
 static public void transferToSavings(){
    Scanner e=new Scanner(System.in);
    System.out.println("press 8 for the amount you want to transfer to your savings "); 
    answer=e.nextInt();
  if(initialbalance>=transfer){
    System.out.println("how much you want to transfer to your savings account");
        transfer=e.nextDouble();
       initialbalance-=transfer;
       Savings+=transfer;
    System.out.println("Transfer successful. New balance:R " + initialbalance + ", New savings: " + Savings);
    }
 else {
    System.out.println("Insufficient funds");
  
   }
    System.out.println("******************************************************************************************");   
 }
 
static public void displayAccountInfo(){
    Scanner e =new Scanner(System.in);
    System.out.println("press 9 to display your account information,press 0 to dismiss"); 
     answer=e.nextInt();
    System.out.println("Account Number:"+accountNumber);
    System.out.println("Accout Holder:"+name);
    System.out.println("Accout type:"+accounttype);
    System.out.println("Date of Birth:"+" "+dateOfBirth);
    System.out.println("Address:"+" "+homeaddress);
    System.out.println("ID Number: " + id);
    System.out.println("Email Address: " + email);
    System.out.println("Phone Number:"+" "+number);
    System.out.println("Balance: R"+initialbalance);
    System.out.println("Savings Account: R"+Savings);
 if (answer == 0) {
    System.out.println("Account information dismissed.");
    } 
else {
    System.out.println("Invalid option. Please try again.");        
}
    System.out.println("*********************************************************************************************");
}

static public void changeAddress(){
Scanner e= new Scanner(System.in);
    System.out.println("Enter your new address:");
    String newAddress = e.next();
    homeaddress = newAddress;
    System.out.println("Address changed successfully!");
} 

static public void requestLoan(){
    Scanner e = new Scanner(System.in);
    System.out.println("Enter the loan amount:");
    double loanAmount = e.nextDouble();
    System.out.println("Enter the loan term in months:");
    int loanTerm = e.nextInt();
    double monthlyPayment = calculateMonthlyPayment(loanAmount, loanTerm);
    System.out.println("Your monthly payment will be: R" + monthlyPayment);
    System.out.println("Do you want to proceed with the loan? (yes/no)");
    String response = e.next();
    if (response.equalsIgnoreCase("yes")) {
        initialbalance += loanAmount;
    System.out.println("Loan approved! Your new balance is: R" + initialbalance);
    } else {
    System.out.println("Loan request cancelled.");
    }
}

static public void payBill(){
Scanner e = new Scanner(System.in);
    System.out.println("Enter the bill amount:");
double billAmount = e.nextDouble();
if (initialbalance >= billAmount) {
initialbalance -= billAmount;
    System.out.println("Bill paid successfully! Your new balance is: R" + initialbalance);
}
else {
    System.out.println("Insufficient funds!");
}
}

static public void LastDetail(){
  while (true) {    
    System.out.println("press 10 for acknowledging ,press 11 to Exit, press 12 to Change your pinumber");
    System.out.println( " press 13 to change your address, press 14 to request a loan, press 15 to pay a bill");
    System.out.println ("press 16 to view transaction history");
    System.out.println("Choose an option:");
    Scanner e= new Scanner(System.in);
    int option = e.nextInt();
    switch (option) {              
case 10:
    System.out.println(" THANK YOU FOR CHOOSING US");
    break;        
case 11:
    System.exit(0);
    break;                    
case 12:
    System.out.println("Enter your current pinumber");
    int currentPinumber = e.nextInt();
    System.out.println("Enter your new pinumber");
    int newPinumber = e.nextInt();
    if (currentPinumber == pinumber) {
    System.out.println("Confirm your new pinumber:");
    int confirmNewPinumber = e.nextInt();
if (confirmNewPinumber == newPinumber) {
            pinumber = newPinumber;
    System.out.println("Pinumber changed successfully!");
        }
else {
    System.out.println("Pinumber do not match");
        }
    } 
else {
    System.out.println("Incorrect current pinumber");
             LastDetail();
    }
case 13:
             changeAddress();
    break;
case 14:
             requestLoan();
    break;
case 15:
             payBill();
    break;
default:
    System.out.println("Invalid option");
            }
        }  
 }

public static void main(String[] args) {
             captureDetails();
             MoneyOperation();
             transferToSavings();
             displayAccountInfo();
             changeAddress();
             requestLoan();
             payBill();
             LastDetail();   
 }
 private static double calculateMonthlyPayment(double loanAmount, int loanTerm) {    
 return 0;   
    }
}
    
