import java.util.*;
import java.time.*;
class Type {
    int creditAmount;
    Type(int creditAmount) {
        this.creditAmount = creditAmount;
    }
}

class authintications{
    void authintications(){
        System.out.println("Enter the 4-Digit Pin:****");
        System.out.println("You Get only Three 3 Chances");
    }
}

class Options {
    void options() {
        System.out.println("==========================");
        System.out.println("|      ATM MENU          |");
        System.out.println("==========================");
        System.out.println("| Enter your choice      |");
        System.out.println("| 1) Add Money           | ");
        System.out.println("| 2) Withdraw Money      |");
        System.out.println("| 3) View Balance        |");
        System.out.println("| 4) EXIT                |");
        System.out.println("==========================");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("********* Welcome to ATM Machine ***********");
        Scanner input = new Scanner(System.in);
        Options options = new Options();
        ArrayList<Type> list = new ArrayList<>();
        Date current = new Date() ;
        authintications Auth = new authintications();
        Auth.authintications();
        if (true) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter the Pin = ");
                int pin = input.nextInt();
                if (pin != 1234) {
                    System.out.println("WRONG pin");
                }else {
                    System.out.println("Pin Verified Successfully");
                    break;
                }
                System.out.println("Card is Blocked");
                System.exit(0);
            }
        }
        while (true) {
            options.options();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount: ");
                    int creditAmount = input.nextInt();
                    list.add(new Type(creditAmount));
                    System.out.println("Money Added Successfully");
                    System.out.println(current);
                    break;
                    case 2:
                    System.out.println("Enter the Amount to Withdraw: ");
                    int debitAmount = input.nextInt();
                    int total = 0;
                    for (Type t : list) {
                        total += t.creditAmount;
                    }
                    if (debitAmount <= total) {
                        total -= debitAmount;
                        list.clear();
                        list.add(new Type(total));
                        System.out.println("Amount Withdrawn Successfully");
                        System.out.println(current);
                    } else {
                        System.out.println("Out of Balance");
                    }
                    break;
                    case 3:
                    if (list.isEmpty()) {
                        System.out.println("Out of Balance");
                    } else {
                        int balance = 0;
                        for (Type t : list) {
                            balance += t.creditAmount;
                        }
                        System.out.println("------ Balance ------");
                        System.out.println("Total Balance: ₹" + balance);
                    }
                    break;
                    case 4:
                    System.out.println("Thank You For Using ATM Machine");
                    System.exit(0);
            }
        }
    }
}
