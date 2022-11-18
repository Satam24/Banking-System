import java.util.Scanner;

public class Account {
    private String AccNumber;
    private String Name;
    private double Balance = 0;

    Scanner sc = new Scanner(System.in);

    public void CreateAccount(){
        System.out.print("Enter name: ");
        String acc_name = sc.next();

        System.out.print("Enter acc_No: ");
        String acc_no = sc.next();

//        System.out.print("Enter Balance: ");
//        Double acc_balance = sc.nextDouble();

        this.AccNumber = acc_no;
        this.Name = acc_name;
//        this.Balance = acc_balance;
    }

    public void DEPOSIT(){
       try {
           long amount;
           System.out.println("Enter the amount you want to deposit: ");
           amount = sc.nextLong();
           Balance = Balance + amount;
           System.out.println("Your money has been Deposited successfully.Your Balance is: "+Balance);
       }
       catch(Exception e){
           System.out.println("The Amount should be Numerical.....Plzz Check th input You Entered");
       }
    }

    public void WITHDRAW(){
       try {
           long amount;
           System.out.println("Enter the amount you want to withdraw: ");
           amount = sc.nextLong();
           if (Balance >= amount) {
               Balance = Balance - amount;
               System.out.println("Withdrawal was successful!!!");
               System.out.println("Balance after withdrawal: " + Balance);
           } else {
               System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );
           }
       }
       catch(Exception e){
           System.out.println("The Amount should be Numerical.....Plzz Check th input You Entered");
       }
    }

    public void BALANCE(){
        System.out.println("This is the Balance: "+this.Balance);
    }

    public void ShowAccDetails(){
        System.out.println("Account Name: "+this.Name);
        System.out.println("Account Number: "+this.AccNumber);
        System.out.println("Account Balance: "+this.Balance);
    }

    public boolean search_acc(String acc_no) {
        if (AccNumber.equals(acc_no)) {
            ShowAccDetails();
            return (true);
        }
        return (false);
    }

//    public String getAccNumber() {
//        return AccNumber;
//    }
//
//    public void setAccNumber() {
//        String accNumber = sc.next();
//        AccNumber = accNumber;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName() {
//        String name = sc.next();
//        Name = name;
//    }
//
//    public double getBalance() {
//        return Balance;
//    }
//
//    public void setBalance() {
//        Double balance = sc.nextDouble();
//        Balance = balance;
//    }
}
