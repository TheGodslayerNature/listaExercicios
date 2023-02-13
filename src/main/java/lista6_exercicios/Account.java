package lista6_exercicios;

public class Account {
    private final int numberAccount;
    private String nameAccount;
    private double balance;
    Account(int numberAccount, String nameAccount, double balance){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        deposit(balance);
    }
    Account(int numberAccount, String nameAccount){
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        balance = 0.0;
    }
    public int getNumberAccount(){
        return numberAccount;
    }
    public String getNameAccount(){
        return nameAccount;
    }
    public double getDeposit(){
        return balance;
    }
    public void changeNameAccount(String nameChange){
        nameAccount = nameChange;
    }
    public void deposit(double deposit){
        balance += deposit;
    }
    public void withDraw(double withDraw){
        balance -= withDraw + 5;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Account;
    }
}
