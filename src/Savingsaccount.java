public class Savingsaccount extends Account{

    private float interest;


    public Savingsaccount(double bal, int pin, float rate) {
        super(bal, pin);
        this.interest = rate;
    }

    public double calculateInterest(){
        double interest = this.getBalance() * this.interest;
        return interest;
    }


}
