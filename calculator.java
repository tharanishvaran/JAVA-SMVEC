class overload{
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
class animal{
     public void sound()
     {
        System.out.println("sound");
     }
}
class dog extends animal{
    public void sound()
    {
        System.out.println("Dog sounds");
    }
}
public class calculator {
    public static void main(String[] args) {
        System.out.println(overload.add(10,20));
        System.out.println(overload.add(10,20,30));

        System.out.println("Overriding");
        animal a=new animal();
        a.sound();
        dog d=new dog();
        d.sound();

    }
}