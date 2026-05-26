import java.util.Scanner;
public class Straffic {
    public static void main(String[] args) {
        String n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        n=sc.nextLine();
        System.out.print(n);
        switch(n)
        {
            case "red":

            {
                System.out.print("Stop");
                break;
            }
            case "green":
            {
                System.out.print("Go");
                break;
            }
            case "yellow":
            {
                System.out.print("GetReady");
                break;
            }
            default:
            {
                System.out.print("Not Exist");
            }

    }
}
}