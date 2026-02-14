package core;

public class DataHiding {
    private int balance=1000;

    public void deposit(int balance){
        this.balance=this.balance+balance;
        System.out.println("balance after deposite "+this.balance);

    }
    public void withdraw(int balance){
        this.balance=this.balance-balance;
        System.out.println("balance after withdraw " + this.balance);
    }

}
