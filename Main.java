import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        BankAccount obj1 = new BankAccount("mperea", "85281");
        obj1.showMenu();
    }
}


class BankAccount{
    int balance;
    int prevTransaction;
    String custName;
    String custId;
    
    BankAccount(String cusName, String cusId){
        custName = cusName;
        custId = cusId;
    }
    
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            prevTransaction = amount;
        }
    }
    
    void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            prevTransaction = -amount;
        }
    }
    
    void getPrevTransaction(){
        if(prevTransaction > 0){
            System.out.println("Deposited: " + Math.abs(prevTransaction));
        }
        else if(prevTransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(prevTransaction));
        }
        else{
            System.out.println("No transaction occured");
        }
    }
    
    void showMenu(){
        char option = '\0';
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome " + custName);
        System.out.println("Your ID is " + custId);
        System.out.print("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");
        
        do{
            System.out.println("Enter an option");
            option = scan.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
                case 'A':
                    System.out.println("Balance = " + balance);
                    System.out.println("\n");
                    break;
                    
                case 'B':
                    System.out.println("Enter an amount to deposit:");
                    int amount = scan.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                    
                case 'C':
                    System.out.println("Enter an amount to withdraw:");
                    int amount2 = scan.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                    
                case 'D':
                    getPrevTransaction();
                    System.out.println("\n");
                    break;
                    
                case 'E':
                    System.out.println("$$$$$$");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please select a different option");
                    break;
            
                }
            }
        while(option != 'E');
                System.out.println("Thank you for using our services here at our Bank, Have a nice day!");
                
    }   
}
