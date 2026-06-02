public class car
{
    String brand;
    int speed;
    public void drive()
    {
        System.out.println("Brand name is "+brand+" speed is "+speed);
    }
}
public class object {
    String name=" ";
    byte age=1;
    public void print()
    {
        System.out.println("Iam "+name+" Age is "+age);
        //System.out.println("hello");
    }
    public static void main(String[] args) {
        object ob=new object();
        ob.name="tharanish";
        ob.age=21;
        ob.print();
        //print();
        car c=new car();
        c.brand="Kia";
        c.speed=100;
        c.drive();
    }
}