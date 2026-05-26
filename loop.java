import java.util.Scanner;
public class loop{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number Of Times Loop Runs : ");
        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.print((i%2!=0)?i:" ");
        }
        System.out.println("Using Continue");
        for(int i=1;i<=n;i++)
        {
            if(i==5)
              continue;
            else
              System.out.print(i+" ");
        }

    }
}