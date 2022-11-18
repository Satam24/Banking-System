import java.util.Scanner;

public class Bank {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Create an Account
        try {
            System.out.println("How many accounts you want to create");
            int n = sc.nextInt();
            Account C[] = new Account[n];
            for (int i = 0; i < C.length; i++) {
                C[i] = new Account();
                C[i].CreateAccount();
            }
            int x;
            do {
                System.out.println("Welcome to Banking Applicationg");
                System.out.println("1.Display all Your Account Details \n 2.Deposit Amount in your Bank \n 3.Withdraw Amount from your account \n 4.Show account Details or check Balance \n 5.Exit ");
                System.out.println("enter your choice");
                x = sc.nextInt();
                switch (x){
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].ShowAccDetails();
                        }
                        break;

                    case 2:
                        System.out.println("enter your acc no: ");
                        String acc_no = sc.next();
                        boolean acc_found = false;
                        for (int i=0; i<C.length; i++){
                            acc_found = C[i].search_acc(acc_no);
                            if (acc_found){
                                C[i].DEPOSIT();
                                break;
                            }
                        }
                        if (!acc_found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Account No : ");
                        acc_no = sc.next();
                        acc_found = false;
                        for (int i = 0; i < C.length; i++) {
                            acc_found = C[i].search_acc(acc_no);
                            if (acc_found) {
                                C[i].WITHDRAW();
                                break;
                            }
                        }
                        if (!acc_found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 4:
                        System.out.print("Enter account no. you want to search: ");
                        acc_no = sc.next();
                        acc_found = false;
                        for (int i = 0; i < C.length; i++) {
                            acc_found = C[i].search_acc(acc_no);
                            if (acc_found) {
                                break;
                            }
                        }
                        if (!acc_found) {
                            System.out.println("Search failed! Account doesn't exist..!!");
                        }
                        break;
                    case 5:
                        System.out.println("See you soon...");
                        break;
                }
            }
            while(x != 5);
        }
        catch(Exception e){
            System.out.println("Plzz Enter Number Only....RUN THE CODE AGAIN");
        }
    }
}
