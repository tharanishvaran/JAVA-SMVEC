class bank{
    private double balance=0;
    public void set(double amount)
    {
        balance+=amount;
    }
    public double get()
    {
        return balance;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        bank b=new bank();
        b.set(1000);
        System.out.println("Balance is "+b.get());

    }
}