import java.util.*;
class options{
    void options(){
        System.out.println("Enter your choice");
        System.out.println("1)Add Money");
        System.out.println("2) Withdraw Money ");
        System.out.println("3) EXIT");
    }
}
public class Main {
    static void main(String[] args) {
        System.out.println("*********Wel-Come to ATM Machine***********");
        Scanner input = new Scanner(System.in);
        options Options = new options();
        Options.options();
        int choice = input.nextInt();
        switch (choice){
            case 1:
                    System.out.println("Enter the Amount");
                    float creditAmount = input.nextFloat();
                    System.out.println("Money Added Successfully");
                    break;
            case 2:
                System.out.println("Enter The Amount");
                float debitAmount = input.nextFloat();
                System.out.println(debitAmount+"$"+" withdrawal successfully");
                break;
            case 3:
                System.out.println("Thank You For Using ATM Machine");
                 System.exit(0);
        }
    }
}