public class SavingAccount extends Account{
    private double limit;

    public SavingAccount(int id, double balance, double limit){
        super(id,balance);
        this.limit = limit;
    }

    public void checkBalance(double withdraw){
        if (getBalance() - withdraw > 0){
            setBalance(getBalance() - withdraw);
        }
        else{
            System.out.println("Withdrawal is not possible. Limit reached.");
        }
    }

    public String toString(){
        return super.toString();
    }
}
