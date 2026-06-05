interface payment{
    public void makepayment(){};
}
class phonepe implements payment
{
    public void makepayment()
    {
        System.out.println("From Phone pay");
    }
}
class googlepay implements payment
{
    public void makepayment()
    {
        System.out.println("From Google pay");
    }
}
class paytm implements payment
{
    public void makepayment()
    {
        System.out.println("From Paytm");
    }
}
public class interfaces {
    public static void main(String[] args) {
        phonepe p=new phonepe();
        pe.makepayment();

    }
}