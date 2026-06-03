class v{
    public void start()
    {
        System.out.println("Started");
    }
}
class car extends v{
     public void start()
     {
        System.out.println("Car Started");
     }
}
class bike extends v{
     public void start()
     {
        System.out.println("Bike Started");
     }
}
class bus extends v{
     public void start()
     {
        System.out.println("Bus Started");
     }
}
public class vehicle {
    public static void main(String[] args) {
        v vv=new v();
        vv=new car();
        vv.start();

    }
}