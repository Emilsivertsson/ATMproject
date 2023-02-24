public abstract class Account implements Transactions {
    private final int accountNR;
    private int pin;
    private double balance;

    private static int nextAccountNumber = 1001;

    public Account(double bal, int pin) {
        this.balance = bal;
        this.pin = pin;

        accountNR = getnextaccountNR();
    }


    public boolean validatePin (int p){
        if( this.pin == p){
            return true;
        }
        System.out.println("invalid pin");
        return false;
    }

    public int getAccountNR() {
        return accountNR;
    }

    public static int getnextaccountNR(){
        int acctnr = nextAccountNumber;
        nextAccountNumber++;
        return acctnr;
    }

    @Override
    public boolean withdraw(double debitAmt) {
        if (debitAmt > this.balance){
            System.out.println("Insufficient funds");
            return false;
        }
        balance -= debitAmt;
        System.out.println("Please take your card and money");
        return true;
    }

    @Override
    public boolean deposit(double creditAmt) {
        balance += creditAmt;
        System.out.println("Deposit successfull");
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
