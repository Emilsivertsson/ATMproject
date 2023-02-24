import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pinNum;
        int userOption = 0;

        Scanner scanner = new Scanner(System.in);

        CheckingAccount account1 = new CheckingAccount(5000, 1432, 2);
        Savingsaccount savingsaccount = new Savingsaccount(4000, 1432, .34f);

        ATM atm = new ATM();
        pinNum = scanner.nextInt();

        if (account1.validatePin(pinNum)){
            do {
                atm.menu();
                userOption = scanner.nextInt();
                switch (userOption){
                    case 1:
                        atm.withdrawMenu();
                        double withdrawAmount = scanner.nextDouble();
                        account1.withdraw(withdrawAmount + account1.getFee());
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositAmount = scanner.nextDouble();
                        account1.deposit(depositAmount);
                        break;
                    case 3:
                        atm.balanceMenu(account1.getBalance());
                        //System.out.printf("The interest is : $%.2f", account1.calculateInterest());
                        break;
                    case 4:
                        atm.exitMenu();
                        break;
                    default:
                        atm.invalidMessageMenu();
                        break;
                }
            } while(userOption != 4);

        }

    }
}