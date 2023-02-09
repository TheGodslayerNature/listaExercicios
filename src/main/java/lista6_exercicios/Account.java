package lista6_exercicios;

public class Account {
    private final int numberAccount;
    private String nameAccount;
    private double initialDeposit;
    Account(int numberAccount, String nameAccount, double initialDeposit){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.initialDeposit = initialDeposit;
    }
    Account(int numberAccount, String nameAccount){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        initialDeposit = 0.0;
    }
    public int getNumberAccount(){
        return numberAccount;
    }
    public String getNameAccount(){
        return nameAccount;
    }
    public double getDeposit(){
        return initialDeposit;
    }
    public void changeNameAccount(String nameChange){
        nameAccount = nameChange;
    }
    public void deposit(double deposit){
        initialDeposit += deposit;
    }
    public void withDraw(double withDraw){
        double tax = 5.00;
        initialDeposit -= tax;
        initialDeposit -= withDraw;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Account;
    }
}
