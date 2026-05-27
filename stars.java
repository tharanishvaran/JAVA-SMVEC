import java.util.Scanner;
public class stars {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Of Stars : ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
                for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>=0;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {   
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}