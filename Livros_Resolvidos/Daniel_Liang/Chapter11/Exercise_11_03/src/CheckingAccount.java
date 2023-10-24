public class CheckingAccount extends Account{
    private double limit;
    public CheckingAccount(int id, double balance, double limit){
        super(id, balance);
        this.limit = limit;
    }
    public double getLimit(){
        return this.limit;
    }

    public void setLimit(double limit){
        this.limit = limit;
    }
    public void checkBalance(double withdraw){
        if (getBalance() - withdraw > limit){
            setBalance(getBalance() - withdraw);
        }
        else{
            System.out.println("Withdrawal is not possible. Limit reached.");
        }
    }

    public String toString(){
        return super.toString() + "\nLimit: " + String.format("%.2f", getLimit());
    }
}
