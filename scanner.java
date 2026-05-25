import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        float b;
        char c;
        String s;
        boolean d;
        System.out.print("Enter the int value :");
        a=sc.nextInt();
        System.out.print("Enter the float value :");
        b=sc.nextFloat();
        System.out.print("Enter the Char value :");
        c=sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Enter the String value :");
        s=sc.nextLine();
        System.out.print("Enter the Boolean value :");
        d=sc.nextBoolean(); 
        System.out.println();
        System.out.println("The Integer Value is "+a);
        System.out.println("The Float Value is "+b);
        System.out.println("The Char Value is "+c);
        System.out.println("The string Value is "+s);
        System.out.println("The Boolean Value is "+d);
    }
}