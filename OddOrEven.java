import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number :");
        n=sc.nextInt();
        System.out.print(n+" is"+(n%2==0?"even":"odd"));

    }
}