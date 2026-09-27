enum Transactions {deposit , withdraw}

public class Transaction {

    private double amount ;
    private Transactions process ;

    public Transaction(){

    }

    public Transaction(double amount , Transactions process){
        
        this.amount = amount ;
        this.process = process ;
    }
   
    public void setAmount(double amount){

        this.amount = amount ;
    }

    public void setProcess(Transactions process){

        this.process = process ;
    }

    public double getAmount(){

        return amount ;
    }

    public Transactions getProcess(){

        return process ;
    }

}
