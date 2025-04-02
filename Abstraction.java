abstract class BankAccount{
    double balance;
    String name;

    BankAccount(double balance,String name){
        this.balance=balance;
        this.name=name;

    }

    abstract void deposit( double amt);

    void showBal(){
        System.out.println("The balance is :"+balance);
    }


}
class SavingsAccount extends BankAccount{
    // double balance;
    // String name;
    SavingsAccount(double balance,String name){
        super(balance,name);
    }

    @Override
    void deposit(double amt){
        balance+=amt;
        System.out.println("Amount Deposited");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        SavingsAccount s=new SavingsAccount(1000,"nav");
        s.showBal();
        s.deposit(1000);
        s.showBal();
    }
}
