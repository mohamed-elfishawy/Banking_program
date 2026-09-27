import java.util.Scanner;

public class Main{

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Hello our dear customer,Please enter your name : ");

        String inputName = in.nextLine();


        System.out.println("Enter your age : ");

        int inputAge = in.nextInt();

        if(inputAge <= 0){

            System.out.println("Invalid input, Try again");

            return;
        }

        in.nextLine();


        System.out.println("Enter your email : ");

        String inputEmail = in.nextLine();


        Customer c1 = new Customer(inputName , inputEmail , inputAge);



        System.out.println("Set initial balance : ");

        double initialBalance = in.nextDouble();


        BankAccount acc = new BankAccount(initialBalance , c1);


        boolean tamam = true;
        
        
        while(tamam){

            System.out.println("Please choice a number : ");

            System.out.println("1 - Deposit.");
            System.out.println("2 - Withdraw.");
            System.out.println("3 - Show your balance.");
            System.out.println("4 - Transaction history.");
            System.out.println("5 - Exit");

            int num = in.nextInt();

            switch (num) {

                case 1:

                   System.out.println("Enter deposit amount :");
                   double depositAmount = in.nextDouble();

                   acc.deposit(depositAmount);

                   break;


                case 2:
                    
                   System.out.println("Enter withdraw amount :");
                   double withdrawamount = in.nextDouble();

                   acc.withdraw(withdrawamount);

                   break;
                 
                   
                case 3:

                   System.out.println("Your current balance is : " +acc.getBalance());

                   break;


                case 4:
                    
                  acc.displayTransactions();

                  break;


                case 5:
                   
                  System.out.println("Thank you, Have a nice day.");
                  tamam = false;

                  break;


                  default:

                    System.out.println("Invalid choice, Please try again,");
            }
        }





        in.close();
    }
}
