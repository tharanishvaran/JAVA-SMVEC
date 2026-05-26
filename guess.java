import java.util.Scanner;
public class guess{
    public static void main(String[] args) {
        int secret=33,guess;
        do{
            System.out.println("Enter The Number : ");
            Scanner sc=new Scanner(System.in);
            guess=sc.nextInt();
            if(guess>secret)
              System.out.println("Guess is Higher");
            else if(guess<secret)
              System.out.println("Guess is Lower");
            else
              System.out.println("Guess is Correct");
        }while(guess!=secret);
    }
}