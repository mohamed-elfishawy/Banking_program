import java.util.ArrayList;

public class BankAccount {

    private double balance ;
    private Customer owner ;

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankAccount(){

    }

    public BankAccount(double balance , Customer owner){

        this.balance = balance ;
        this.owner = owner ;

    }

    public void setBalance(double balance){

        if(balance <= 0){

            System.out.println("Invalid input");
        }

        else{

            this.balance = balance ;

        }
    }

    public double getBalance(){

        return  balance ;
    }

    public Customer getOwner(){

        return owner ;
    }

    public void displayTransactions(){

        if(transactions.isEmpty()){

            System.out.println("No transactions yet.");
        }

        else{
            
               for(int i = 0 ; i < transactions.size() ; i++){

            System.out.println((i + 1) + " - " + transactions.get(i));
        } 
        }

     
    }

    public void deposit(double amount){

        if(amount > 0){

            balance += amount ;
            transactions.add(new Transaction(amount , Transactions.deposit));
            System.out.println("Transaction completed successfully and your current balance is : " +balance);

        }
        else{

            System.out.println("Invalid input");

        }
    } 

    public void withdraw(double amount){

        if(amount > 0 && amount <= balance){

            balance -= amount ;
            transactions.add(new Transaction(amount , Transactions.withdraw));
            System.out.println("Transaction completed successfully and your current balance is : " +balance);

        }

        else if(amount > balance){

            System.out.println("Your balance not enough");

        }

        else{

            System.out.println("Invalid input");
        }
    }

    
}
