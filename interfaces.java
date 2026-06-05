interface payment{
     public void makepayment();
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
        payment p=new phonepe();
        payment gg=new googlepay();
        payment pay=new paytm();
        p.makepayment();
        gg.makepayment();
        pay.makepayment();

    }
}