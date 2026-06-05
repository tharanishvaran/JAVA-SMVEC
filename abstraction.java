abstract class animal{
    abstract void sound();
    public void name(){
        System.out.println("Animal Class");
    }
}
class dog extends animal{
    public void sound()
    {
        System.out.println("Dog barks");
    }

}
public class abstraction {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        d.name();

    }
}